/*
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import it.csec.xtext.vsdl.Model
import it.csec.xtext.vsdl.SMT.SMTContext
import it.csec.xtext.vsdl.SMT.SMTModel
//import org.smtlib.IAccept
//import org.smtlib.impl.Script

import java.io.IOException
import java.io.BufferedReader
import java.io.InputStreamReader

import org.eclipse.core.resources.ResourcesPlugin;

import it.csec.xtext.VsdlResources

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VsdlGenerator extends AbstractGenerator {
	var VsdlConsole console
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val dotIndex = resource.URI.lastSegment.lastIndexOf('.')
		val fileName = resource.URI.lastSegment.substring(0, dotIndex)
		
		console = new VsdlConsole(fileName)
	
fsa.generateFile(
    fileName + ".smt2",
    compileModel(resource.contents.get(0) as Model, console)
)

// 获取生成的 SMT 文件路径
val file = ResourcesPlugin.workspace.root.location.toString + "/" +
    fsa.getURI(fileName + ".smt2").toPlatformString(true)

var process = null as Process
try {
    // 执行外部 Z3 求解器
    process = Runtime.runtime.exec("cmd /C " + VsdlResources.solver + " " + file)
    val reader = new BufferedReader(new InputStreamReader(process.inputStream))
    var line = ""
    var ln = 0
    val data = new StringBuilder
    val model = new StringBuilder
    var sat = false
    var getModel = true
    
    while ((line = reader.readLine()) != null) {
        // 输出每一行数据到控制台
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
//		new SMTModel(model).compileScript(env)
//		var script = new Script()
		// 将 SMT 模型转换为 SMT 脚本
		val smtscript = env.smt.smtConfig.defaultPrinter.toString(new SMTModel(model).compileScript(env))
//		val smtscript = env.smt.smtConfig.defaultPrinter.toString(script)
		val cal = java.util.Calendar.instance				
		'''
		; Scenario «model.name» compiled on «new java.text.SimpleDateFormat("yyyy/MM/dd").format(cal.time)» at «new java.text.SimpleDateFormat("HH.mm.ss").format(cal.time)»
		; TTU: «ttu», Step: «ttuStep»
		«smtscript.substring(1, smtscript.length-1)»
		'''		
	}	
}
