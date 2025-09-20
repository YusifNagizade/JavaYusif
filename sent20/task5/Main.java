package task5;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank(2000);
		
		 System.out.println("balans" + bank.get());
		 System.out.println("artirildi" + bank.increase(300));
		 System.out.println("azaldi" + bank.decrease(500));
	}

}
