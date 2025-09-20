package task3;

public class Car {
	String brand;
	int price;
	String model;
	
	
	public Car(String model,int price,String brand) {
		this.model = model;
		this.price = price;
		this.brand = brand;
		
	}
	
	public String tostring() {
		return "brand" + brand + "price" +price + "model" + model;
	}
}
