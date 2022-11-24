package sd_to_vdf;

import cafev.vform.vFormDsl.EnumOption
import cafev.vform.vFormDsl.FormInputSelect
import cafev.vform.vFormDsl.FormLayout
import cafev.vform.vFormDsl.Model
import cafev.vform.vFormDsl.StringOptionItem
import cafev.vform.vFormDsl.VFormDslPackage
import cafev.vform.vFormDsl.VFormDslFactory
import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.FrequencyEntry
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import java.util.List
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*
import cafev.vform.vFormDsl.FormInputBasic

/** 
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */

public class sd2vdf  extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VFormDslPackage.eINSTANCE  
	val Vfac = VFormDslFactory.eINSTANCE
	
	new () {
		header().in('dd', DD).out('vf', VF)
		ruleStore( #[
			rule('Init')
				.in('sd', DD.statsDataModel)
				.out('m', VF.model) [
					m.formLayout = fl
				]
				.out('fl', VF.formLayout) [
					fl.layout = "\"horizontal\""
				],
			rule('NameCategorical')
				.in('ct', DD.categoricalType)
				.out("txc", VF.formInputBasic) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					txc.name = ct.name
					txc.type = "\"checkbox\""	
					m.formInput.add(txc)		
				]
				.out("txt", VF.formInputBasic)[
					txt.name = "name"
					txt.type = "\"text\""
				],
			rule('NameNumerical')
				.in('ct', DD.categoricalType)
				.out("txn", VF.formInputBasic) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					txn.name = ct.name
					txn.type = "\"checkbox\""	
					m.formInput.add(txn)		
				].out("txt", VF.formInputBasic)[
					txt.name = "name"
					txt.type = "\"text\""
				],
			rule('TypeCategorical')
				.in('ct', DD.categoricalType).filter[ct.frequencyTable.size()<=2]
				.out("slt", VF.formInputSelect) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = "type"			
					slt.option = (ct as CategoricalType).fetch("enumOption1") as EnumOption
					m.formInput.add(slt)
				],
				rule('TypeCategorical2')
				.in('ct', DD.categoricalType).filter[ct.frequencyTable.size()>2]
				.out("slt", VF.formInputSelect) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = "type"			
					slt.option = (ct as CategoricalType).fetch("enumOption2") as EnumOption
					m.formInput.add(slt)
				],
				
				rule("enumOption1")
				.uniqueLazy
				.in("ct", DD.categoricalType).filter[ct.frequencyTable.size()<=2]
				.out("opt", VF.enumOption) [
					opt.data+=(ct as CategoricalType).fetch("getSelect") as StringOptionItem	
//					opt.data+=(ct as CategoricalType).fetch("getCheckbox") as StringOptionItem								
				],
				rule("enumOption2")
				.uniqueLazy
				.in("ct", DD.categoricalType).filter[ct.frequencyTable.size()>2]
				.out("opt", VF.enumOption) [
					opt.data+=(ct as CategoricalType).fetch("getSelect") as StringOptionItem
//					opt.data+=(ct as CategoricalType).fetch("getSearch") as StringOptionItem	
				],
//			rule('TypeNumerical')
//				.in('nt', DD.numericalType)
//				.out("slt", VF.formInputSelect) [
//					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
//					//bindings
//					slt.name = "type"			
//					slt.option = opt
//					m.formInput.add(slt)
//				].
//				out("opt", VF.enumOption) [
//					
////					opt.data+=(nt as NumericalType).fetch("getSelect") as StringOptionItem
//					opt.data+=(nt as NumericalType).fetch.fetch("getRange") as StringOptionItem
//					opt.data+=(nt as NumericalType).fetch("getNumber") as StringOptionItem
//				],
				
				rule("getSelect")
				.uniqueLazy
				.in("ct", DD.categoricalType)
				.out("sos", VF.stringOptionItem)[
					val v = new String('"select"')
					
				],
				rule("getRange")
				.uniqueLazy
				.in("nt", DD.numericalType)
				.out("sos",VF.stringOptionItem)[
					sos.value ="range"
				],
				rule("getCheckbox")
				.uniqueLazy
				.in("ct", DD.categoricalType)
				.out("sos",VF.stringOptionItem)[
					sos.value ="checkbox"
				],
				rule("getSearch")
				.uniqueLazy
				.in("ct", DD.categoricalType)
				.out("sos",VF.stringOptionItem)[
					sos.value ="search"
				],
				rule("getNumber")
				.uniqueLazy
				.in("nt", DD.numericalType)
				.out("sos",VF.stringOptionItem)[
					sos.value ="number"
				]

		])				
				
	}
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def sd() {
	  'sd'.fetch() as StatsDataModel
	}
	def m() {
	  'm'.fetch() as Model
	}

	def fl() {
	  'fl'.fetch() as FormLayout
	}

	def ct() {
	  'ct'.fetch() as CategoricalType
	}
	def nt() {
	  'nt'.fetch() as NumericalType
	}
	def txt() {
	  'txt'.fetch() as FormInputBasic
	}
	def txc() {
	  'txc'.fetch() as FormInputBasic
	}
	def txn() {
	  'txn'.fetch() as FormInputBasic
	}
	def slt() {
	  'slt'.fetch() as FormInputSelect
	}
	def opt() {
	  'opt'.fetch() as EnumOption
	}
	def opt2() {
	  'opt2'.fetch() as EnumOption
	}
	def opt3() {
	  'opt3'.fetch() as EnumOption
	}
	def sos(){
	
	 var s = fetch() as StringOptionItem
	 return s
	}
//	def soc(){
//	 'soc'.fetch() as StringOptionItem
//	}
//	def sor(){
//	'sor'.fetch() as StringOptionItem
//	}
//	def sosc(){
//	 'sosc'.fetch() as StringOptionItem
//	}
//	def son(){
//	 'son'.fetch() as StringOptionItem
//	}
	def fe(){
	  'fe'.fetch() as FrequencyEntry
	}
}
				
				
				
				
				
				
				
				
				
				
				