package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlToken;
import it.csec.xtext.vsdl.CPU;
import it.csec.xtext.vsdl.CPUFrequency;
import java.util.ArrayList;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTCPU extends SMTObjFun<CPU> {
  @Override
  public void setFunName() {
    this.funName = "node.cpu";
  }

  @Override
  public void setFunParams() {
    this.funParams = new String[] { "Int", "Int", "Int" };
  }

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final CPU cpu, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 1);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_plus);
    String symbol = "=";
    int k = 0;
    {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          boolean _isSameas = cpu.isSameas();
          if (_isSameas) {
            exprArr.add(k, 
              context.getEfactory().fcn(context.getEfactory().symbol(symbol), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), 
                  context.getEfactory().symbol(name)), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), 
                  context.getEfactory().symbol(cpu.getId().getName()))));
          } else {
            String _op = cpu.getOp();
            if (_op != null) {
              switch (_op) {
                case VsdlToken.FASTER:
                  symbol = ">";
                  break;
                case VsdlToken.SLOWER:
                  symbol = "<";
                  break;
              }
            }
            exprArr.add(k, 
              context.getEfactory().fcn(
                context.getEfactory().symbol(symbol), 
                context.getEfactory().fcn(context.getEfactory().symbol("node.cpu"), context.getEfactory().numeral(i), 
                  context.getEfactory().symbol(name)), 
                context.getEfactory().numeral(this.compileCPUFrequency(cpu.getValue()))));
          }
          k++;
        }
        int _i = i;
        int _ttuStep_1 = context.getTtuStep();
        i = (_i + _ttuStep_1);
        int _ttu_2 = context.getTtu();
        boolean _lessEqualsThan_1 = (i <= _ttu_2);
        _while = _lessEqualsThan_1;
      }
    }
    return exprArr;
  }

  public int compileCPUFrequency(final CPUFrequency frequency) {
    String _unit = frequency.getUnit();
    if (_unit != null) {
      switch (_unit) {
        case VsdlToken.MHZ:
          return frequency.getValue();
        case VsdlToken.GHZ:
          int _value = frequency.getValue();
          return (_value * 10000);
        case VsdlToken.THZ:
          int _value_1 = frequency.getValue();
          int _multiply = (_value_1 * 100000);
          return (_multiply * 10000);
        default:
          return 0;
      }
    } else {
      return 0;
    }
  }
}
