package it.csec.xtext.generator;

import it.csec.xtext.VsdlResources;
import it.csec.xtext.vsdl.Model;
import it.csec.xtext.vsdl.SMT.SMTContext;
import it.csec.xtext.vsdl.SMT.SMTModel;
import it.csec.xtext.vsdl.TimeInterval;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.smtlib.impl.Script;

/**
 * 纯命令行下的生成器示例，去掉了对 Eclipse Workspace 的依赖。
 */
@SuppressWarnings("all")
public class VsdlGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final int dotIndex = resource.getURI().lastSegment().lastIndexOf(".");
    final String fileName = resource.getURI().lastSegment().substring(0, dotIndex);
    final VsdlConsole console = new VsdlConsole(fileName);
    EObject _get = resource.getContents().get(0);
    fsa.generateFile(
      (fileName + ".smt2"), 
      this.compileModel(((Model) _get), console));
    final URI smt2Uri = fsa.getURI((fileName + ".smt2"));
    String _xifexpression = null;
    boolean _isFile = smt2Uri.isFile();
    if (_isFile) {
      _xifexpression = smt2Uri.toFileString();
    } else {
      _xifexpression = smt2Uri.toString();
    }
    final String filePath = _xifexpression;
    Process process = ((Process) null);
    try {
      Runtime _runtime = Runtime.getRuntime();
      String _solver = VsdlResources.getSolver();
      String _plus = ("cmd /C " + _solver);
      String _plus_1 = (_plus + " ");
      String _plus_2 = (_plus_1 + filePath);
      process = _runtime.exec(_plus_2);
      InputStream _inputStream = process.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      final BufferedReader reader = new BufferedReader(_inputStreamReader);
      String line = "";
      int ln = 0;
      final StringBuilder data = new StringBuilder();
      final StringBuilder model = new StringBuilder();
      boolean sat = false;
      boolean getModel = true;
      while ((!Objects.equals((line = reader.readLine()), null))) {
        {
          boolean _equals = Objects.equals(line, "sat");
          if (_equals) {
            sat = true;
            console.getStream().println("sat");
          }
          if (((sat && (ln > 0)) && getModel)) {
            boolean _equals_1 = Objects.equals(line, ")");
            if (_equals_1) {
              getModel = false;
            }
            model.append((line + "\n"));
          } else {
            if ((sat && (ln > 0))) {
              data.append((line + "\n"));
            }
          }
          ln++;
        }
      }
      if ((!sat)) {
        console.getStream().println("unsat");
      }
      int _length = model.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        fsa.generateFile(
          (fileName + "_model.smt2"), 
          model.toString());
      }
      int _length_1 = data.length();
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        fsa.generateFile(
          (fileName + "_values.smt2"), 
          data.toString());
      }
      process.waitFor();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else if (_t instanceof InterruptedException) {
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  /**
   * 将模型编译为SMT脚本的辅助方法
   */
  public CharSequence compileModel(final Model model, final VsdlConsole console) {
    CharSequence _xblockexpression = null;
    {
      int ttu = 60;
      int ttuStep = 5;
      String _ttuStep = VsdlResources.getTtuStep();
      boolean _notEquals = (!Objects.equals(_ttuStep, null));
      if (_notEquals) {
        ttuStep = Integer.parseInt(VsdlResources.getTtuStep());
      }
      TimeInterval _timeToUse = model.getTimeToUse();
      boolean _notEquals_1 = (!Objects.equals(_timeToUse, null));
      if (_notEquals_1) {
        ttu = model.getTimeToUse().getValue();
      } else {
        String _ttu = VsdlResources.getTtu();
        boolean _notEquals_2 = (!Objects.equals(_ttu, null));
        if (_notEquals_2) {
          ttu = Integer.parseInt(VsdlResources.getTtu());
        }
      }
      String _name = model.getName();
      final SMTContext env = new SMTContext(_name, ttu, ttuStep, console);
      final String smtScript = env.getSmt().smtConfig.defaultPrinter.<Script>toString(
        new SMTModel(model).compileScript(env));
      final Calendar cal = Calendar.getInstance();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("; Scenario ");
      String _name_1 = model.getName();
      _builder.append(_name_1);
      _builder.append(" compiled on ");
      String _format = new SimpleDateFormat("yyyy/MM/dd").format(cal.getTime());
      _builder.append(_format);
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      _builder.append("; at ");
      String _format_1 = new SimpleDateFormat("HH.mm.ss").format(cal.getTime());
      _builder.append(_format_1);
      _builder.newLineIfNotEmpty();
      _builder.append("; TTU: ");
      _builder.append(ttu);
      _builder.append(", Step: ");
      _builder.append(ttuStep);
      _builder.newLineIfNotEmpty();
      int _length = smtScript.length();
      int _minus = (_length - 1);
      String _substring = smtScript.substring(1, _minus);
      _builder.append(_substring);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
