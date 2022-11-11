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

import static yamtl.dsl.Rule.*

/** 
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
class sd2vf extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VformDSLPackage.eINSTANCE  
	new () {
		header().in('dd', DD).out('vf', VF)
		ruleStore( #[
			rule('Init')
				.in('sd', DD.statsDataModel)
				.out('fi', VF.formInput) 
				.out('fl', VF.formLayout) [
					fl.layout = Layout.HORIZONTAL
				],
			rule('CheckBox')
				.in('sdt', DD.statsDataType).filter [
					sdt.frequencyTable.size() <= 2
				]
				.out('ck', VF.checkbox) [
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					ck.inputName = sdt.name
					fi.checkbox.add(ck)
				]
		])
	}
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def sd() {
	  'sd'.fetch() as StatsDataModel
	}
	def fi() {
	  'fi'.fetch() as FormInput
	}
	def fl() {
	  'fl'.fetch() as FormLayout
	}
	def sdt() {
	  'sdt'.fetch() as StatsDataType
	}
	def ck() {
	  'ck'.fetch() as Checkbox
	}
}
