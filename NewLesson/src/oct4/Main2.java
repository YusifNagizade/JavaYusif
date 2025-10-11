package oct4;

public class Main2 {

	static void methodB() {
		int misal = 10 / 0;
		System.out.println("Netice" + misal);
	}

	static void methodA() {
		methodB();
	}

	public static void main(String[] args) {
		try {
			methodA();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
