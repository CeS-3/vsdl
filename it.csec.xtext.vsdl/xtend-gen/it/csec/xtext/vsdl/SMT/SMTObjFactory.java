package it.csec.xtext.vsdl.SMT;

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTObjFactory {
  private EObject obj;

  public SMTObjFactory(final EObject obj) {
    this.obj = obj;
  }

  private String getSimpleName() {
    String _simpleName = this.obj.getClass().getSimpleName();
    int _length = this.obj.getClass().getSimpleName().length();
    int _minus = (_length - 4);
    return _simpleName.substring(
      0, _minus);
  }

  private String getName() {
    String _string = this.obj.getClass().getPackage().toString();
    int _length = this.obj.getClass().getPackage().toString().length();
    int _minus = (_length - 4);
    String _substring = _string.substring(
      8, _minus);
    String _simpleName = this.getSimpleName();
    return (_substring + _simpleName);
  }

  private String getSMTName() {
    String _substring = this.getClass().getPackage().toString().substring(8);
    String _plus = (_substring + ".SMT");
    String _simpleName = this.getSimpleName();
    return (_plus + _simpleName);
  }

  public ArrayList<IExpr.IFcnExpr> compile(final String name, final SMTContext context) {
    try {
      Class<?> cls = this.getClass().getClassLoader().loadClass(this.getSMTName());
      Object newobj = cls.newInstance();
      Method imethod = cls.getMethod("getIAssertions", String.class, Class.forName("it.csec.xtext.vsdl.SMT.SMTContext"));
      imethod.invoke(newobj, name, context);
      Method method = null;
      try {
        method = cls.getMethod("compile", Class.forName(this.getName()), String.class, Class.forName("it.csec.xtext.vsdl.SMT.SMTContext"));
      } catch (final Throwable _t) {
        if (_t instanceof NoSuchMethodException) {
          try {
            method = cls.getMethod("compile", Class.forName("java.lang.Object"), String.class, Class.forName("it.csec.xtext.vsdl.SMT.SMTContext"));
          } catch (final Throwable _t_1) {
            if (_t_1 instanceof Exception) {
              Method[] _methods = cls.getMethods();
              for (final Method m : _methods) {
                PrintStream _stream = context.getConsole().getStream();
                String _sMTName = this.getSMTName();
                String _plus = (_sMTName + ": ");
                String _string = m.toString();
                String _plus_1 = (_plus + _string);
                _stream.println(_plus_1);
              }
            } else {
              throw Exceptions.sneakyThrow(_t_1);
            }
          }
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      Object _invoke = method.invoke(newobj, this.obj, name, context);
      return ((ArrayList<IExpr.IFcnExpr>) _invoke);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
