package entities;

public abstract class  Contributor {
	private String name;
	private double annualIncome;
	
	public Contributor() {
		
	}
	
	public Contributor (String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public double getAnnualIncome() {
		return annualIncome;
	}
	
	public abstract double  taxLevied();
	
}
