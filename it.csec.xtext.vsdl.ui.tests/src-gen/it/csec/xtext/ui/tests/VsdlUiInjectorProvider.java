/*
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.ui.tests;

import com.google.inject.Injector;
import it.csec.xtext.vsdl.ui.internal.VsdlActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class VsdlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return VsdlActivator.getInstance().getInjector("it.csec.xtext.Vsdl");
	}

}