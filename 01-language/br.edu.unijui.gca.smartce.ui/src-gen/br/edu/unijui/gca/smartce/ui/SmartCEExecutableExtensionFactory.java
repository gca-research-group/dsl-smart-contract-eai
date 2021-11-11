/*
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.ui;

import br.edu.unijui.gca.smartce.ui.internal.SmartceActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmartCEExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SmartceActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SmartceActivator activator = SmartceActivator.getInstance();
		return activator != null ? activator.getInjector(SmartceActivator.BR_EDU_UNIJUI_GCA_SMARTCE_SMARTCE) : null;
	}

}
