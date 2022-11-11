package sd2vf

import dataDescription.DataDescriptionPackage
import dataDescription.StatsDataModel
import dataDescription.StatsDataType
import vformDSL.Checkbox
import vformDSL.FormInput
import vformDSL.FormLayout
import vformDSL.Layout
import vformDSL.VformDSLPackage
import yamtl.core.YAMTLModule
import yamtl.dsl.Rule

/**
 * LONGER VERSION TO EXPERIMENT WITH NEW RULES
 */
class statsModel2VForm extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VformDSLPackage.eINSTANCE  
	new () {
		header().in('dd', DD).out('vf', VF)
		ruleStore( #[
			new Rule('Init')
				.in('sd', DD.statsDataModel)
				.out('fi', VF.formInput) [
					// environment vbles 
					val sd = 'sd'.fetch as StatsDataModel
					val fi = 'fi'.fetch as FormInput
				]
				.out('fl', VF.formLayout) [
					// environment vbles 
					val sd = 'sd'.fetch as StatsDataModel
					val fl = 'fl'.fetch as FormLayout
					// bindings
					fl.layout = Layout.HORIZONTAL
				],
			new Rule('CheckBox')
				.in('sdt', DD.statsDataType).filter [
					val sdt = 'sdt'.fetch as StatsDataType
					sdt.frequencyTable.size() <= 2
				]
				.out('ck', VF.checkbox) [
					// environment vbles 
					val sdt = 'sdt'.fetch as StatsDataType
					val ck = 'ck'.fetch as Checkbox
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					ck.inputName = sdt.name
					fi.checkbox.add(ck)
				]
		])
	}
}
