package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlToken;
import it.csec.xtext.vsdl.Disk;
import it.csec.xtext.vsdl.DiskSize;
import java.util.ArrayList;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTDisk extends SMTObjFun<Disk> {
  @Override
  public void setFunName() {
    this.funName = "node.disk";
  }

  @Override
  public void setFunParams() {
    this.funParams = new String[] { "Int", "Int", "Int" };
  }

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final Disk disk, final String name, final SMTContext context) {
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
          boolean _isSameas = disk.isSameas();
          if (_isSameas) {
            exprArr.add(k, 
              context.getEfactory().fcn(context.getEfactory().symbol(symbol), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), context.getEfactory().symbol(name)), 
                context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), context.getEfactory().symbol(disk.getId().getName()))));
          } else {
            String _op = disk.getOp();
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
                context.getEfactory().numeral(this.compileDiskSize(disk.getValue()))));
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

  public int compileDiskSize(final DiskSize size) {
    String _unit = size.getUnit();
    if (_unit != null) {
      switch (_unit) {
        case VsdlToken.MEGABYTE:
          return size.getValue();
        case VsdlToken.GIGABYTE:
          int _value = size.getValue();
          return (_value * 1024);
        case VsdlToken.TERABYTE:
          int _value_1 = size.getValue();
          return (_value_1 * 1048576);
        default:
          return 0;
      }
    } else {
      return 0;
    }
  }
}
