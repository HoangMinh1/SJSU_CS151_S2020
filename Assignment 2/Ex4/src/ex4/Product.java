package ex4;

public final class Product {
	private final String name;
	private final String description;
	private final double price;
	private final int maxQuantity;
	
	Product(String name, String description, double price, int quantity){
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return maxQuantity;
	}
	public String toString() {
		return this.maxQuantity + " " + this.description + " "
				+ this.name + " price " + this.price + "$";
	}

}
