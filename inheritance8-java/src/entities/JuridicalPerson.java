package entities;

public class JuridicalPerson extends Contributor {
	private int employees;
	
	public JuridicalPerson() {
		super();
	}

	public JuridicalPerson(String name, double annualIncome, int employees) {
		super(name,annualIncome);
		this.employees = employees;
	}
	
	public void setEmployees(int employees) {
		this.employees = employees;
	}
	
	public int getEmployees() {
		return employees;
	}
	
	@Override
	public double taxLevied() {
		double tax;
		if (employees >= 10) {
			tax = super.getAnnualIncome() * 0.14;
		}else {
			tax = super.getAnnualIncome() * 0.16;
		}
		return tax;
	}

}
