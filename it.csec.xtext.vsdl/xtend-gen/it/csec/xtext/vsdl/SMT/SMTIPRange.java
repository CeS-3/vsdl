package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.IPRange;
import java.net.InetAddress;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTIPRange extends SMTObj<IPRange> {
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final IPRange ipr, final String name, final SMTContext context) {
    try {
      ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(1);
      int _octet1 = ipr.getRange().getAddress().getOctet1();
      String _plus = (Integer.valueOf(_octet1) + ".");
      int _octet2 = ipr.getRange().getAddress().getOctet2();
      String _plus_1 = (_plus + Integer.valueOf(_octet2));
      String _plus_2 = (_plus_1 + ".");
      int _octet3 = ipr.getRange().getAddress().getOctet3();
      String _plus_3 = (_plus_2 + Integer.valueOf(_octet3));
      String _plus_4 = (_plus_3 + ".");
      int _octet4 = ipr.getRange().getAddress().getOctet4();
      String _plus_5 = (_plus_4 + Integer.valueOf(_octet4));
      byte[] bAddr = InetAddress.getByName(_plus_5).getAddress();
      long _unsignedLong = Byte.toUnsignedLong(bAddr[0]);
      long _multiply = (_unsignedLong * 16777216);
      long _unsignedLong_1 = Byte.toUnsignedLong(bAddr[1]);
      long _multiply_1 = (_unsignedLong_1 * 65536);
      long _bitwiseOr = (_multiply | _multiply_1);
      long _unsignedLong_2 = Byte.toUnsignedLong(bAddr[2]);
      long _multiply_2 = (_unsignedLong_2 * 256);
      long addr = ((_bitwiseOr | _multiply_2) | Byte.toUnsignedLong(bAddr[3]));
      int _bitmask = ipr.getRange().getBitmask();
      int _minus = (32 - _bitmask);
      int netmask = (0xffffffff << _minus);
      long first = (addr & netmask);
      long last = (addr | (~netmask));
      ArrayList<String> _scenelems = context.getScenelems();
      for (final String elem : _scenelems) {
        {
          int i = 0;
          int _ttu = context.getTtu();
          boolean _lessEqualsThan = (i <= _ttu);
          boolean _while = _lessEqualsThan;
          while (_while) {
            {
              IExpr.IFcnExpr no = context.getEfactory().fcn(
                context.getEfactory().symbol("="), 
                context.getEfactory().fcn(
                  context.getEfactory().symbol("network.node.address"), 
                  context.getEfactory().numeral(i), 
                  context.getEfactory().symbol(name), 
                  context.getEfactory().symbol(elem)), 
                context.getEfactory().numeral(0));
              IExpr.IFcnExpr s = context.getEfactory().fcn(
                context.getEfactory().symbol(">"), 
                context.getEfactory().fcn(
                  context.getEfactory().symbol("network.node.address"), 
                  context.getEfactory().numeral(i), 
                  context.getEfactory().symbol(name), 
                  context.getEfactory().symbol(elem)), 
                context.getEfactory().numeral(first));
              IExpr.IFcnExpr e = context.getEfactory().fcn(
                context.getEfactory().symbol("<"), 
                context.getEfactory().fcn(
                  context.getEfactory().symbol("network.node.address"), 
                  context.getEfactory().numeral(i), 
                  context.getEfactory().symbol(name), 
                  context.getEfactory().symbol(elem)), 
                context.getEfactory().numeral(last));
              exprArr.add(0, context.getEfactory().fcn(
                context.getEfactory().symbol("or"), no, 
                context.getEfactory().fcn(context.getEfactory().symbol("and"), s, e)));
            }
            int _i = i;
            int _ttuStep = context.getTtuStep();
            i = (_i + _ttuStep);
            int _ttu_1 = context.getTtu();
            boolean _lessEqualsThan_1 = (i <= _ttu_1);
            _while = _lessEqualsThan_1;
          }
        }
      }
      {
        int i = 0;
        int _ttu = context.getTtu();
        boolean _lessEqualsThan = (i <= _ttu);
        boolean _while = _lessEqualsThan;
        while (_while) {
          {
            exprArr.add(0, context.getEfactory().fcn(
              context.getEfactory().symbol("="), 
              context.getEfactory().fcn(
                context.getEfactory().symbol("network.address"), 
                context.getEfactory().numeral(i), 
                context.getEfactory().symbol(name)), 
              context.getEfactory().numeral(addr)));
            exprArr.add(0, context.getEfactory().fcn(
              context.getEfactory().symbol("="), 
              context.getEfactory().fcn(
                context.getEfactory().symbol("network.netmask"), 
                context.getEfactory().numeral(i), 
                context.getEfactory().symbol(name)), 
              context.getEfactory().numeral(ipr.getRange().getBitmask())));
          }
          int _i = i;
          int _ttuStep = context.getTtuStep();
          i = (_i + _ttuStep);
          int _ttu_1 = context.getTtu();
          boolean _lessEqualsThan_1 = (i <= _ttu_1);
          _while = _lessEqualsThan_1;
        }
      }
      return exprArr;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
