package sd_to_vf
import cafev.vform.vFormDsl.EnumOption
import cafev.vform.vFormDsl.FormInputBasic
import cafev.vform.vFormDsl.FormInputRange
import cafev.vform.vFormDsl.FormInputSearch
import cafev.vform.vFormDsl.FormInputSelect
import cafev.vform.vFormDsl.FormLayout
import cafev.vform.vFormDsl.Model
import cafev.vform.vFormDsl.StringOptionItem
import cafev.vform.vFormDsl.VFormDslPackage
import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.FrequencyEntry
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import java.util.List
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*


/** 
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
class sd2vf extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VFormDslPackage.eINSTANCE
		
		
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
//			rule('Checkbox')
//				.in('ct', DD.categoricalType).filter[
//					ct.frequencyTable.size()<=2
//				]
//				.out('fib', VF.formInputBasic) [	
//					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
//					fib.name = ct.name
//					fib.type = "\"checkbox\""
//					m.formInput.add(fib)
//				],
//				
//			rule('Text')
//				.in('ct', DD.categoricalType)
//				.out('fib', VF.formInputBasic) [	
//					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
//					fib.name = ct.name
//					fib.type = "\"text\""
//					m.formInput.add(fib)
//				],
//			rule('Number')
//				.in('nt', DD.numericalType)
//				.out('fib', VF.formInputBasic) [	
//					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
//					fib.name = nt.name
//					fib.type = "'numberr'"
//					m.formInput.add(fib)
//				],
//			rule('Range')
//				.in('nt', DD.numericalType)
//				.out('rg', VF.formInputRange) [
//					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
//					//bindings
//					rg.name = nt.name
//					rg.min = Math.toIntExact(Math.round(nt.min)) 
//					rg.max = Math.toIntExact(Math.round(nt.max)) 
//					m.formInput.add(rg)
//				],
//				
//				rule('Date')
//				.in('sdt', DD.statsDataType).
//				out('dt', VF.dat) [
//					// environment vbles 
//					val pattern = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")
//					val sdt = 'sdt'.fetch as StatsDataType
//					val dt = 'dt'.fetch as Dat
//					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
//					dt.inputName = sdt.name
//					
//					sdt.frequencyTable.forEach[i|
//						
//						if(!pattern.matcher(i.name).matches()){
//							fi.dat.add(dt)
//						}
//					]
//					
//				],
			
			rule('Search')
				.in('ct', DD.categoricalType).filter [
					val ct = 'ct'.fetch as CategoricalType
					ct.frequencyTable.size() > 10
				]
				.out("sch", VF.formInputSearch) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					
					//bindings
					sch.name = ct.name
					sch.id = ct.name
					sch.QC = 'true'
					sch.data += ct.frequencyTable.fetch("stringOptionItem") as List<StringOptionItem>
					m.formInput.add(sch)
				],
			rule('Categorical Select')
				.in('ct', DD.categoricalType).filter [
					val ct = 'ct'.fetch as CategoricalType
					ct.frequencyTable.size() <= 10
				]
				.out("slt", VF.formInputSelect) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = ct.name	
					slt.id = ct.name	
					slt.QC = 'true'		
					slt.option = opt
					m.formInput.add(slt)
				].
				out("opt", VF.enumOption) [
					opt.data += ct.frequencyTable.fetch("stringOptionItem") as List<StringOptionItem>
				],
			rule('Numerical Select')
				.in('nt', DD.numericalType).filter [
					val nt = 'nt'.fetch as NumericalType
					nt.frequencyTable.size() <= 10
				]
				.out("slt", VF.formInputSelect) [
					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = nt.name	
					slt.id = ct.name	
					slt.QC = 'true'				
					slt.option = opt
					m.formInput.add(slt)
				].
				out("opt", VF.enumOption) [
					opt.data += nt.frequencyTable.fetch("stringOptionItem") as List<StringOptionItem>
				],
			rule('stringOptionItem')
				.uniqueLazy
				.in('fe', DD.frequencyEntry)
				.out("soi", VF.stringOptionItem) [
					soi.value = fe.name
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
	def fib() {
	  'fib'.fetch() as FormInputBasic
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
	def rg(){
	  'rg'.fetch() as FormInputRange
	}
	def sch() {
	  'sch'.fetch() as FormInputSearch
	}
	def slt() {
	  'slt'.fetch() as FormInputSelect
	}
	def opt() {
	  'opt'.fetch() as EnumOption
	}
	def soi(){
	  'soi'.fetch() as StringOptionItem
	}
	def fe(){
	  'fe'.fetch() as FrequencyEntry
	}
}