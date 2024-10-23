package it.csec.xtext.vsdl.Terraform;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class ScenElem {
  @Accessors
  private String name;

  @Accessors
  private String scenario;

  @Accessors
  private int ttuStep;

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Pure
  public String getScenario() {
    return this.scenario;
  }

  public void setScenario(final String scenario) {
    this.scenario = scenario;
  }

  @Pure
  public int getTtuStep() {
    return this.ttuStep;
  }

  public void setTtuStep(final int ttuStep) {
    this.ttuStep = ttuStep;
  }
}
