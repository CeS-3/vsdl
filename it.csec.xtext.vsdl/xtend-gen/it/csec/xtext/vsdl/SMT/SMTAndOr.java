package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlToken;
import it.csec.xtext.vsdl.AndOr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTAndOr extends SMTObj<AndOr> {
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final AndOr obj, final String name, final SMTContext context) {
    ArrayList<IExpr.IFcnExpr> exprArr = null;
    ArrayList<IExpr.IFcnExpr> leftArr = null;
    ArrayList<IExpr.IFcnExpr> rightArr = null;
    int k = 0;
    String symbol = "and";
    String _op = obj.getOp();
    boolean _equals = Objects.equals(_op, VsdlToken.OR);
    if (_equals) {
      symbol = "or";
    }
    EObject _left = obj.getLeft();
    leftArr = new SMTObjFactory(_left).compile(name, context);
    EObject _right = obj.getRight();
    rightArr = new SMTObjFactory(_right).compile(name, context);
    int _size = leftArr.size();
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 1);
    boolean _greaterThan = (_size > _plus);
    if (_greaterThan) {
      int _ttu_1 = context.getTtu();
      int _ttuStep_1 = context.getTtuStep();
      int _divide_1 = (_ttu_1 / _ttuStep_1);
      int _plus_1 = (_divide_1 + 2);
      List<IExpr.IFcnExpr> _nCopies = Collections.<IExpr.IFcnExpr>nCopies(_plus_1, null);
      ArrayList<IExpr.IFcnExpr> _arrayList = new ArrayList<IExpr.IFcnExpr>(_nCopies);
      exprArr = _arrayList;
      exprArr.set(
        0, 
        context.getEfactory().fcn(context.getEfactory().symbol(symbol), leftArr.get(0), rightArr.get(0)));
      k = 1;
      {
        int i = 0;
        int _ttu_2 = context.getTtu();
        boolean _lessEqualsThan = (i <= _ttu_2);
        boolean _while = _lessEqualsThan;
        while (_while) {
          {
            exprArr.set(k, 
              context.getEfactory().fcn(context.getEfactory().symbol(symbol), leftArr.get(k), rightArr.get(k)));
            k++;
          }
          int _i = i;
          int _ttuStep_2 = context.getTtuStep();
          i = (_i + _ttuStep_2);
          int _ttu_3 = context.getTtu();
          boolean _lessEqualsThan_1 = (i <= _ttu_3);
          _while = _lessEqualsThan_1;
        }
      }
    } else {
      int _ttu_2 = context.getTtu();
      int _ttuStep_2 = context.getTtuStep();
      int _divide_2 = (_ttu_2 / _ttuStep_2);
      int _plus_2 = (_divide_2 + 1);
      ArrayList<IExpr.IFcnExpr> _arrayList_1 = new ArrayList<IExpr.IFcnExpr>(_plus_2);
      exprArr = _arrayList_1;
      {
        int i = 0;
        int _ttu_3 = context.getTtu();
        boolean _lessEqualsThan = (i <= _ttu_3);
        boolean _while = _lessEqualsThan;
        while (_while) {
          {
            exprArr.add(k, 
              context.getEfactory().fcn(context.getEfactory().symbol(symbol), leftArr.get(k), rightArr.get(k)));
            k++;
          }
          int _i = i;
          int _ttuStep_3 = context.getTtuStep();
          i = (_i + _ttuStep_3);
          int _ttu_4 = context.getTtu();
          boolean _lessEqualsThan_1 = (i <= _ttu_4);
          _while = _lessEqualsThan_1;
        }
      }
    }
    return exprArr;
  }
}
