package entities;

public class ImportedProduct extends Product{
	private double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customsFee = customFee;
	}
	
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double getCustomsFeee() {
		return customsFee;
	}
	public String toString () {
		sb.append(super.getName() + " ");
		sb.append("$ ");
		sb.append(super.getPrice() + " ");
		sb.append(" (Coustoms Fee: $ " + customsFee + ")");
		
		return sb.toString();
	}
}
