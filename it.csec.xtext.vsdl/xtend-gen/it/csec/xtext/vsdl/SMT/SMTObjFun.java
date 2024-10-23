package it.csec.xtext.vsdl.SMT;

import org.smtlib.command.C_declare_fun;

@SuppressWarnings("all")
public abstract class SMTObjFun<T extends Object> extends SMTObj<T> {
  public String funName;

  public String[] funParams;

  public abstract void setFunName();

  public abstract void setFunParams();

  public SMTObjFun() {
    this.setFunName();
    this.setFunParams();
  }

  public String getFunName() {
    return this.funName;
  }

  public C_declare_fun getFun() {
    return SMTObjUtils.generateFun(this.funName, this.funParams);
  }
}
