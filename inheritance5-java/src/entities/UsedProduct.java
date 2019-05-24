package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name,price);
		this.setManufactureDate(manufactureDate);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String toString () {
		sb.append(super.getName() + " (used) ");
		sb.append("$ ");
		sb.append(super.getPrice() + " ");
		sb.append(" (Manufacure Date:  " + sdf.format(manufactureDate) + ")");
		
		return sb.toString();
	}
}
