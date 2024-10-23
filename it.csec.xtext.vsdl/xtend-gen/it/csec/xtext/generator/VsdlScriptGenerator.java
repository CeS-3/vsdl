package it.csec.xtext.generator;

import it.csec.xtext.VsdlResources;
import it.csec.xtext.vsdl.Terraform.Network;
import it.csec.xtext.vsdl.Terraform.Node;
import it.csec.xtext.vsdl.Terraform.Scenario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VsdlScriptGenerator extends AbstractHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      ISelection _activeMenuSelection = HandlerUtil.getActiveMenuSelection(event);
      IStructuredSelection activeSelection = ((IStructuredSelection) _activeMenuSelection);
      Object _firstElement = activeSelection.getFirstElement();
      if ((_firstElement instanceof IFile)) {
        Object _firstElement_1 = activeSelection.getFirstElement();
        IFile file = ((IFile) _firstElement_1);
        String _string = file.getLocation().toString();
        FileReader fr = new FileReader(_string);
        BufferedReader br = new BufferedReader(fr);
        String _substring = file.getName().substring(0, file.getName().indexOf("_"));
        Scenario scenario = new Scenario(_substring);
        String line = null;
        MessageConsoleStream _stream = scenario.getConsole().getStream();
        String _name = scenario.getName();
        String _plus = ("Generating Terraform scripts for scenario " + _name);
        _stream.println(_plus);
        while (((line = br.readLine()) != null)) {
          scenario.setElementFromValue(line);
        }
        br.close();
        scenario.getConsole().getStream().println("Done.");
        MessageConsoleStream _stream_1 = scenario.getConsole().getStream();
        int _ttu = scenario.getTtu();
        String _plus_1 = ("ttu: " + Integer.valueOf(_ttu));
        _stream_1.println(_plus_1);
        int ttuStep = Integer.parseInt(VsdlResources.getTtuStep());
        {
          int i = 0;
          int _ttu_1 = scenario.getTtu();
          boolean _lessEqualsThan = (i <= _ttu_1);
          boolean _while = _lessEqualsThan;
          while (_while) {
            {
              scenario.createResource("provider.tf", i, scenario.doTerraformProvider().toString());
              scenario.createResource("network_bogus.tf", i, scenario.doTerraformBogusNet().toString());
              Set<String> _keySet = scenario.getNetworks().keySet();
              for (final String netName : _keySet) {
                {
                  Network net = scenario.getNetworks().get(netName).get(Integer.valueOf(i));
                  scenario.createResource((("network_" + netName) + ".tf"), i, net.toTerraformString().toString());
                  scenario.createResource((("router_" + netName) + ".tf"), i, net.getRouter().toTerraformString().toString());
                }
              }
              Set<String> _keySet_1 = scenario.getNodes().keySet();
              for (final String nodeName : _keySet_1) {
                {
                  Node node = scenario.getNodes().get(nodeName).get(Integer.valueOf(i));
                  scenario.createResource(
                    (("node_" + nodeName) + ".tf"), i, 
                    node.toTerraformString().toString());
                }
              }
            }
            int _i = i;
            i = (_i + ttuStep);
            int _ttu_2 = scenario.getTtu();
            boolean _lessEqualsThan_1 = (i <= _ttu_2);
            _while = _lessEqualsThan_1;
          }
        }
        scenario.getConsole().getStream().println("Done.");
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
