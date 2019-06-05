package entities;

public class NaturalPerson extends Contributor{


	private double healthExpenditure;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, double annualIncome, double healtExpenditure) {
		super(name, annualIncome);
		this.healthExpenditure = healtExpenditure;
	}
	
	public void setHealtExpenditure(double healtExpenditure) {
		this.healthExpenditure = healtExpenditure;
	}
	
	public double getHealtExpenditure() {
		return healthExpenditure;
	}
	
	@Override
	public double taxLevied() {
		double tax;
		if (super.getAnnualIncome() >= 20000) {
			tax = (super.getAnnualIncome()*0.25)-(healthExpenditure*0.5);
		}else {
			tax = (super.getAnnualIncome()*0.15)-(healthExpenditure*0.5);
		}
		return tax;
	}

}
