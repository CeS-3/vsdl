package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.IP;
import java.util.ArrayList;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTIP extends SMTObjFun<IP> {
  @Override
  public void setFunName() {
    this.funName = "network.node.address";
  }

  @Override
  public void setFunParams() {
    this.funParams = new String[] { "Int", "Int", "Int", "Int" };
  }

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final IP ip, final String name, final SMTContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getId() is undefined for the type IP"
      + "\nThe method or field id is undefined for the type IP"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
}
