/*
 * generated by Xtext 2.28.0
 */
package cafev.vform.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractVFormDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(cafev.vform.vFormDsl.VFormDslPackage.eINSTANCE);
		return result;
	}
}
