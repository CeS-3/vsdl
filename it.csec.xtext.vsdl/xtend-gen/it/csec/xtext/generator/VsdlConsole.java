package it.csec.xtext.generator;

import java.util.Collections;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class VsdlConsole {
  private MessageConsoleStream stream;

  public VsdlConsole(final String name) {
    this.stream = this.findConsole(name).newMessageStream();
  }

  private MessageConsole findConsole(final String name) {
    final ConsolePlugin cplugin = ConsolePlugin.getDefault();
    final IConsoleManager conMan = cplugin.getConsoleManager();
    final IConsole[] existing = conMan.getConsoles();
    for (int i = 0; (i < existing.length); i++) {
      boolean _equals = name.equals((existing[i]).getName());
      if (_equals) {
        IConsole _get = existing[i];
        return ((MessageConsole) _get);
      }
    }
    final MessageConsole console = new MessageConsole(name, null);
    conMan.addConsoles(((IConsole[]) ((IConsole[])Conversions.unwrapArray(Collections.<MessageConsole>unmodifiableList(CollectionLiterals.<MessageConsole>newArrayList(console)), IConsole.class))));
    return console;
  }

  public MessageConsoleStream getStream() {
    return this.stream;
  }
}
