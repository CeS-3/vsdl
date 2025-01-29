package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.IP;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
    try {
      int _ttu = context.getTtu();
      int _ttuStep = context.getTtuStep();
      int _divide = (_ttu / _ttuStep);
      int _plus = (_divide + 1);
      ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_plus);
      int k = 0;
      String _op = ip.getOp();
      boolean _equals = Objects.equals(_op, "connected");
      if (_equals) {
        int i = 0;
        int _ttu_1 = context.getTtu();
        boolean _lessEqualsThan = (i <= _ttu_1);
        boolean _while = _lessEqualsThan;
        while (_while) {
          exprArr.add(k, context.getEfactory().fcn(
            context.getEfactory().symbol(">"), 
            context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), 
              context.getEfactory().symbol(name), context.getEfactory().symbol(ip.getId().getName())), 
            context.getEfactory().numeral(0)));
          int _i = i;
          int _ttuStep_1 = context.getTtuStep();
          i = (_i + _ttuStep_1);
          int _ttu_2 = context.getTtu();
          boolean _lessEqualsThan_1 = (i <= _ttu_2);
          _while = _lessEqualsThan_1;
        }
      } else {
        int _octet1 = ip.getAddress().getOctet1();
        String _plus_1 = (Integer.valueOf(_octet1) + ".");
        int _octet2 = ip.getAddress().getOctet2();
        String _plus_2 = (_plus_1 + Integer.valueOf(_octet2));
        String _plus_3 = (_plus_2 + ".");
        int _octet3 = ip.getAddress().getOctet3();
        String _plus_4 = (_plus_3 + Integer.valueOf(_octet3));
        String _plus_5 = (_plus_4 + ".");
        int _octet4 = ip.getAddress().getOctet4();
        String _plus_6 = (_plus_5 + Integer.valueOf(_octet4));
        byte[] bAddr = InetAddress.getByName(_plus_6).getAddress();
        long _unsignedLong = Byte.toUnsignedLong(bAddr[0]);
        long _multiply = (_unsignedLong * 16777216);
        long _unsignedLong_1 = Byte.toUnsignedLong(bAddr[1]);
        long _multiply_1 = (_unsignedLong_1 * 
          65536);
        long _bitwiseOr = (_multiply | _multiply_1);
        long _unsignedLong_2 = Byte.toUnsignedLong(bAddr[2]);
        long _multiply_2 = (_unsignedLong_2 * 256);
        long addr = ((_bitwiseOr | _multiply_2) | Byte.toUnsignedLong(bAddr[3]));
        {
          int i_1 = 0;
          int _ttu_2 = context.getTtu();
          boolean _lessEqualsThan_1 = (i_1 <= _ttu_2);
          boolean _while_1 = _lessEqualsThan_1;
          while (_while_1) {
            exprArr.add(k, context.getEfactory().fcn(
              context.getEfactory().symbol("="), 
              context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i_1), 
                context.getEfactory().symbol(name), context.getEfactory().symbol(ip.getId().getName())), 
              context.getEfactory().numeral(addr)));
            int _i = i_1;
            int _ttuStep_1 = context.getTtuStep();
            i_1 = (_i + _ttuStep_1);
            int _ttu_3 = context.getTtu();
            boolean _lessEqualsThan_2 = (i_1 <= _ttu_3);
            _while_1 = _lessEqualsThan_2;
          }
        }
      }
      return exprArr;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
