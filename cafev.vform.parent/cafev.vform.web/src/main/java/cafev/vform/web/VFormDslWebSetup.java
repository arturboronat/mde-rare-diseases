/*
 * generated by Xtext 2.28.0
 */
package cafev.vform.web;

import cafev.vform.VFormDslRuntimeModule;
import cafev.vform.VFormDslStandaloneSetup;
import cafev.vform.ide.VFormDslIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class VFormDslWebSetup extends VFormDslStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new VFormDslRuntimeModule(), new VFormDslIdeModule(), new VFormDslWebModule()));
	}
	
}