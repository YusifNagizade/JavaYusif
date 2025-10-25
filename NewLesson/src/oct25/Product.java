package oct25;

public class Product implements Comparable<Product> {

	private String name;
	private double price;

	@Override
	public int compareTo(Product o) {
		return Double.compare(this.price, o.price);
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
        return name;
    }
	
	public double getPrice() {
        return price;
    }
}
