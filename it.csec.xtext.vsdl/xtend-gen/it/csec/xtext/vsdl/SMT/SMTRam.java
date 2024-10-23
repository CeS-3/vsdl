package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlToken;
import it.csec.xtext.vsdl.Ram;
import it.csec.xtext.vsdl.RamSize;
import java.util.ArrayList;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTRam extends SMTObjFun<Ram> {
  @Override
  public void setFunName() {
    this.funName = "node.ram";
  }

  @Override
  public void setFunParams() {
    this.funParams = new String[] { "Int", "Int", "Int" };
  }

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final Ram ram, final String name, final SMTContext context) {
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
          boolean _isSameas = ram.isSameas();
          if (_isSameas) {
            exprArr.add(k, 
              context.getEfactory().fcn(context.getEfactory().symbol(symbol), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), context.getEfactory().symbol(name)), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), context.getEfactory().symbol(ram.getId().getName()))));
          } else {
            String _op = ram.getOp();
            if (_op != null) {
              switch (_op) {
                case VsdlToken.LARGER:
                  symbol = ">";
                  break;
                case VsdlToken.SMALLER:
                  symbol = "<";
                  break;
              }
            }
            exprArr.add(k, 
              context.getEfactory().fcn(
                context.getEfactory().symbol(symbol), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), context.getEfactory().symbol(name)), 
                context.getEfactory().numeral(this.compileRamSize(ram.getValue()))));
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

  public int compileRamSize(final RamSize size) {
    String _unit = size.getUnit();
    if (_unit != null) {
      switch (_unit) {
        case VsdlToken.MEGABYTE:
          return size.getValue();
        case VsdlToken.GIGABYTE:
          int _value = size.getValue();
          return (_value * 1024);
        default:
          return 0;
      }
    } else {
      return 0;
    }
  }
}
