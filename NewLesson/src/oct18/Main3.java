package oct18;

import java.time.LocalDate;

public class Main3 {

	public static void main(String[] args) {

		try {
			User u1 = new User("Yusif", LocalDate.of(2011, 10, 1));
		} catch (UnderAgeException  e) {
			System.out.println(e.getMessage());
		}

	}

}
