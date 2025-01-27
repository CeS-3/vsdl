package it.csec.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import it.csec.xtext.vsdl.Model
import it.csec.xtext.vsdl.SMT.SMTContext
import it.csec.xtext.vsdl.SMT.SMTModel
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

import it.csec.xtext.VsdlResources

/**
 * 纯命令行下的生成器示例，去掉了对 Eclipse Workspace 的依赖。
 */
class VsdlGenerator extends AbstractGenerator {


    override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val dotIndex = resource.URI.lastSegment.lastIndexOf('.')
        val fileName = resource.URI.lastSegment.substring(0, dotIndex)

        val console = new VsdlConsole(fileName)

        // 生成SMT文件
        fsa.generateFile(
            fileName + ".smt2",
            compileModel(resource.contents.get(0) as Model, console)
        )

        // 获取刚生成的 .smt2 文件在本地系统的路径（如果是 file:// URI）
        val smt2Uri = fsa.getURI(fileName + ".smt2")
        val filePath = if (smt2Uri.isFile)
            smt2Uri.toFileString   // 转成本地绝对路径
        else
            smt2Uri.toString       // 万一不是 file URI，就用原始字符串

        var process = null as Process
        try {
            // 执行外部 z3 求解器，这里以 "cmd /C" 为例（Windows 下）
            process = Runtime.runtime.exec("cmd /C " + VsdlResources.solver + " " + filePath)
            val reader = new BufferedReader(new InputStreamReader(process.inputStream))
            var line = ""
            var ln = 0
            val data = new StringBuilder
            val model = new StringBuilder
            var sat = false
            var getModel = true

            while ((line = reader.readLine()) != null) {
                if (line == "sat") {
                    sat = true
                    console.stream.println("sat")
                }
                if (sat && ln > 0 && getModel) {
                    if (line == ")") {
                        getModel = false
                    }
                    model.append(line + "\n")
                } else if (sat && ln > 0) {
                    data.append(line + "\n")
                }
                ln++
            }
            if (!sat) {
                console.stream.println("unsat")
            }

            // 将模型结果保存到文件
            if (model.length > 0) {
                fsa.generateFile(
                    fileName + "_model.smt2",
                    model.toString
                )
            }
            // 将数据值保存到文件
            if (data.length > 0) {
                fsa.generateFile(
                    fileName + "_values.smt2",
                    data.toString
                )
            }
            process.waitFor
        } catch (IOException e) {
            e.printStackTrace
        } catch (InterruptedException e) {
            return
        }
    }

    /**
     * 将模型编译为SMT脚本的辅助方法
     */
    def compileModel(Model model, VsdlConsole console) {
        var ttu = 60
        var ttuStep = 5

        // 获取自定义时间步长
        if (VsdlResources.getTtuStep != null) {
            ttuStep = Integer.parseInt(VsdlResources.getTtuStep)
        }

        // 获取模型的时间信息
        if (model.timeToUse != null) {
            ttu = model.timeToUse.value
        } else if (VsdlResources.ttu != null) {
            ttu = Integer.parseInt(VsdlResources.ttu)
        }

        val env = new SMTContext(model.name, ttu, ttuStep, console)
        val smtScript = env.smt.smtConfig.defaultPrinter.toString(
            new SMTModel(model).compileScript(env)
        )

        val cal = java.util.Calendar.instance

        '''
        ; Scenario «model.name» compiled on «new java.text.SimpleDateFormat("yyyy/MM/dd").format(cal.time)» 
        ; at «new java.text.SimpleDateFormat("HH.mm.ss").format(cal.time)»
        ; TTU: «ttu», Step: «ttuStep»
        «smtScript.substring(1, smtScript.length - 1)»
        '''
    }
}
