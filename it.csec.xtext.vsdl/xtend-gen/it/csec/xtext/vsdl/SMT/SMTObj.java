package it.csec.xtext.vsdl.SMT;

import java.util.ArrayList;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public abstract class SMTObj<T extends Object> {
  public static Object getIAssertions(final String name, final SMTContext context) {
    return null;
  }

  public abstract ArrayList<IExpr.IFcnExpr> compile(final T obj, final String name, final SMTContext context);
}
