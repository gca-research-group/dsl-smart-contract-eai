/*
 * generated by Xtext 2.35.0
 */
package br.edu.unijui.gca.jabuti.ui.tests;

import br.edu.unijui.gca.jabuti.ui.internal.JabutiActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class JabutiUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JabutiActivator.getInstance().getInjector("br.edu.unijui.gca.jabuti.Jabuti");
	}

}
