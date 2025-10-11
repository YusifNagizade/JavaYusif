package oct4;

public class Main {

	public static void main(String[] args) {
		try {

			int[] num = { 1, 2, 3 };

			try {

				int a = num[1] / 0;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

			System.out.println(num[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
