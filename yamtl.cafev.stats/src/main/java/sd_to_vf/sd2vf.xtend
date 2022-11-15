package sd_to_vf

import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import dataDescription.StatsDataType
import vformDSL.Checkbox
import vformDSL.EnumOption
import vformDSL.FormInput
import vformDSL.FormLayout
import vformDSL.Layout
import vformDSL.Range
import vformDSL.Search
import vformDSL.Select
import vformDSL.Text
import vformDSL.Number
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
				],
				
			rule('Text')
				.in('ct', DD.categoricalType)
				.out('txt', VF.text) [
					val fi = (ct.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					txt.inputName = ct.name
					fi.text.add(txt)
				],
			rule('Number')
				.in('nt', DD.numericalType)
				.out('nb', VF.number) [
					val fi = (nt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					nb.inputName = nt.name
					fi.number.add(nb)
				],
			rule('Range')
				.in('nt', DD.numericalType)
				.out('rg', VF.range) [
					val fi = (nt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					rg.inputName = nt.name
					rg.min = Math.toIntExact(Math.round(nt.min)) 
					rg.max = Math.toIntExact(Math.round(nt.max)) 
					fi.range.add(rg)
				],
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
				.in('sdt', DD.statsDataType).filter [
					val sdt = 'sdt'.fetch as StatsDataType
					sdt.frequencyTable.size() > 10
				]
				.out("sch", VF.search)[
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					sdt.frequencyTable.forEach[i|sch.stringData.add(i.name)]
					sch.inputName = sdt.name
					fi.search.add(sch)
				],
				
			rule('select')
				.in('sdt', DD.statsDataType).filter [
					val sdt = 'sdt'.fetch as StatsDataType
					sdt.frequencyTable.size() <= 10
				]
				.out("slt", VF.select)[
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					slt.inputName = sdt.name					
					fi.select.add(slt)
				]
				.out("opt", VF.enumOption)[
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings 
					fi.select.forEach[i|
						if(i.inputName == sdt.name){
							sdt.frequencyTable.forEach[j|opt.stringData.add(j.name)]
						}
						if(i.inputName == sdt.name){
							i.setEnumOption(opt)
						}
					]
				]		
			// TODO: at the moment select iterates over output model
			// * why does opt have stringData? should this attribute be univalued
			// * should each option be modeled as a separate EnumOption?
			// * what is select and what is enumOption?
//			rule('selectOption').uniqueLazy
//				.in('sdt', DD.statsDataType)
//				.out("slt", VF.select)
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
	def ct() {
	  'ct'.fetch() as CategoricalType
	}
	def txt() {
	  'txt'.fetch() as Text
	}
	def nt() {
	  'nt'.fetch() as NumericalType
	}
	def nb() {
	  'nb'.fetch() as Number
	}
	def rg() {
	  'rg'.fetch() as Range
	}
	def sch() {
	  'sch'.fetch() as Search
	}
	def slt() {
	  'slt'.fetch() as Select
	}
	def opt() {
	  'opt'.fetch() as EnumOption
	}
}
