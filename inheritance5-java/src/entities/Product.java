package entities;

public class Product {
	public final StringBuilder sb = new StringBuilder();
	private double price;
	private String name;
	
	public Product() {
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString () {
		sb.append(name + " ");
		sb.append("$ ");
		sb.append(price);
		
		return sb.toString();
	}
}
