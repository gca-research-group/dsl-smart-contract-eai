/*
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SmartCEStandaloneSetup extends SmartCEStandaloneSetupGenerated {

	public static void doSetup() {
		new SmartCEStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}