package oct4;

public class Min3 {

	public static void main(String[] args) {
		try {
			int a = 2 / 0;
			String str = null;
			System.out.println(str.length());
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
