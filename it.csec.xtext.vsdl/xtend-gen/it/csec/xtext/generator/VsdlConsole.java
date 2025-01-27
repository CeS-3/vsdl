package it.csec.xtext.generator;

import java.io.PrintStream;

@SuppressWarnings("all")
public class VsdlConsole {
  private PrintStream stream;

  public VsdlConsole(final String name) {
    this.stream = this.findConsole(name);
  }

  /**
   * 原本在 Eclipse 里是找到命名Console，这里改为直接返回System.out
   */
  private PrintStream findConsole(final String name) {
    return System.out;
  }

  public PrintStream getStream() {
    return this.stream;
  }
}
