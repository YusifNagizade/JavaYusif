package task5;

public class Bank {
	double balance;
	
	public Bank(double balance) {
		this.balance = balance;
	}
	
	public double increase(double price) {
		return balance = balance + price;
	}
	public double decrease(double price) {
		 return balance = balance - price;
	}
	public double get() {
		return balance;
	}
}
