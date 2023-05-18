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
	return inFt.owner.__instances
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
	

}