package csm.comtech;

public class ElectricBill {
	private double unitCharge;
	public double amount;
	

	public ElectricBill(double unitCharge) {
		super();
		this.unitCharge = unitCharge;
	}
	public double totalElectricity() {
		if(unitCharge<50) {
		    	return unitCharge*0.50;
		}
			else if(unitCharge<=150 ){
				return 50*0.50+(unitCharge-50)*0.75;
			}
			else if(unitCharge<=250) {
				return (100*0.75)+(50*0.50)+(unitCharge-150*1.20);
			}
			else if(unitCharge>250) {
		        return (100*0.75)+(50*0.50)+(100*1.20)+(unitCharge-250*1.50);
			}
		return 0;
			
		
	}
	

}
