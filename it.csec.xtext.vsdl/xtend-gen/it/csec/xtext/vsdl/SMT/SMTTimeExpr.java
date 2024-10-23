package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlToken;
import it.csec.xtext.vsdl.Multiplication;
import it.csec.xtext.vsdl.PlusMinus;
import it.csec.xtext.vsdl.TimeExpr;
import it.csec.xtext.vsdl.TimeInterval;
import java.util.Objects;
import org.smtlib.IExpr;
import org.smtlib.SMT;

@SuppressWarnings("all")
public class SMTTimeExpr {
  private SMT smt = new SMT();

  private IExpr.IFactory efactory = this.smt.smtConfig.exprFactory;

  private TimeExpr t;

  public SMTTimeExpr(final TimeExpr t) {
    this.t = t;
  }

  public IExpr compile() {
    final TimeExpr _switchValue = this.t;
    boolean _matched = false;
    if (_switchValue instanceof PlusMinus) {
      _matched=true;
      String symbol = "+";
      String _op = ((PlusMinus)this.t).getOp();
      boolean _equals = Objects.equals(_op, VsdlToken.MINUS);
      if (_equals) {
        symbol = "-";
      }
      TimeExpr _left = ((PlusMinus)this.t).getLeft();
      TimeExpr _right = ((PlusMinus)this.t).getRight();
      return this.efactory.fcn(
        this.efactory.symbol(symbol), 
        new SMTTimeExpr(_left).compile(), 
        new SMTTimeExpr(_right).compile());
    }
    if (!_matched) {
      if (_switchValue instanceof Multiplication) {
        _matched=true;
        TimeExpr _left = ((Multiplication)this.t).getLeft();
        TimeExpr _right = ((Multiplication)this.t).getRight();
        return this.efactory.fcn(
          this.efactory.symbol("*"), 
          new SMTTimeExpr(_left).compile(), 
          new SMTTimeExpr(_right).compile());
      }
    }
    {
      TimeInterval _interval = this.t.getInterval();
      boolean _tripleNotEquals = (_interval != null);
      if (_tripleNotEquals) {
        return this.efactory.numeral(this.t.getInterval().getValue());
      } else {
        String _variable = this.t.getVariable();
        boolean _tripleNotEquals_1 = (_variable != null);
        if (_tripleNotEquals_1) {
          return this.efactory.symbol(this.t.getVariable());
        }
      }
      String _simpleName = this.t.getClass().getSimpleName();
      String _plus = ("oops! : " + _simpleName);
      return this.efactory.symbol(_plus);
    }
  }
}
