package csv_to_vform

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics
import untypedModel.FeatureType
import untypedModel.utils.ERecordUtil

class VFormUtil {
	val extension ERecordUtil util = new ERecordUtil()
	
	// TODO: define as managed helper
	def stats(FeatureType ft) {
		val d = new DescriptiveStatistics()
		for (value : ft.fieldValues) {
			d.addValue(Double.parseDouble(value.toString))
		}
		return d
	}

	// TODO: define as managed helper
	def getFieldValues(FeatureType inFt) {
		return inFt.owner.instances
			.map[record | record.get(inFt.name)]
			.filter[v|v!==null && v!=""]
	}	

	def isNumeric(FeatureType ft) {
		ft.getFieldValues.forall[ v | isNumeric(v)] && ft.fieldValues.toSet.size > 1
	}
	
	def boolean isNumeric(Object value) {
		 if (value instanceof Number) {
	        return true;
	    }
	     if (value instanceof String) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	    return false;
	}
	

	
	
	
	
	
	

//	def isCategoricalType(FeatureType ft) {
//		ft.emfType == ECORE.EString || ft.emfType == ECORE.EDate || (
//						(ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt) && (
//							ft.fieldValues.toSet.size <= 1	
//						)
//					)
//	}

//	def isNumericalType(FeatureType ft) {
//		ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt &&
//			ft.fieldValues.toSet.size > 1
//	}
	
	

//	def getDataType(FeatureType ft) {
//		val data = ft.fieldValues.groupBy[it]
//		val date = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])([/]|[-])(0?[1-9]|1[012])([/]|[-])[0-9]{4}$")
//
//		val dateMatch = Arrays.asList(0)
//		data.entrySet.forEach [
//			if (date.matcher(it.key.toString).find()) {
//				dateMatch.set(0, dateMatch.get(0) + 1)
//			}
//		]
//
//		if (dateMatch.get(0) > 0) {
//			return "Date"
//		} else {
//			return "String"
//		}
//
//	}
}