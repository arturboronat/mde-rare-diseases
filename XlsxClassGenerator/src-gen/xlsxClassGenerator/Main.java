package xlsxClassGenerator;
import data_Description.Data_DescriptionFactory;
import data_Description.DataDescription;
import data_Description.CategoricalStat;
import data_Description.NumericalStat;
import data_Description.freqTable;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonGen obj = new JsonGen();
		
		Data_DescriptionFactory factory =  Data_DescriptionFactory.eINSTANCE;
		
		DataDescription dataD = factory.createDataDescription();
		
		dataD.setCategoricalstat(obj.jsonData);
		dataD.setNumericalstat(obj.jsonData);

		//Print the categorical Statistics for the DataSet
		for(CategoricalStat i: dataD.getCategoricalstat()) {
			System.out.println("--  "+i.getColumnId()+ "  --");
			System.out.println("Frequency Table: ");
			for(freqTable j: i.getFrequencyTable()) {
				System.out.println("Data: "+j.getLabel()+" frequency: "+j.getValue());
				
			}
			System.out.println("");
			System.out.println("");
		}
		
		//Print the Numerical Statistics for the DataSet
		for(NumericalStat i: dataD.getNumericalstat()) {
			System.out.println("--  "+i.getColumnId()+ "  --");
			System.out.println("Statistics: ");
			System.out.println("Max = " + i.getMax());
			System.out.println("Min = "  + i.getMin());
			System.out.println("Mean = " + i.getMean());
			System.out.println("Standard deviation = " + i.getStd());
			System.out.println("");
			System.out.println("Frequency Table: ");
			for(freqTable j: i.getFreqencyTable()) {
				System.out.println("data: " + j.getLabel() + " Frequency: " + j.getValue());
			}
			
			System.out.println("");
			System.out.println("");
		
			
					
		}
		
		
	}

}
