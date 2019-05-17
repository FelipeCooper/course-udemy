package entities;

public class OrderItem {
	private Integer quantity;
	Product product;
	private double price;
	
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity, Product product, double price) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double subTotal() {
		return (price*quantity);
	}
}
