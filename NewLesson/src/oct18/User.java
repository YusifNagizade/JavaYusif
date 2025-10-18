package oct18;

import java.time.LocalDate;
import java.time.Period;

public class User {
	String name;
	LocalDate birth;
	
	public User(String name,LocalDate birth) {
		this.name = name;
		this.birth = birth;
	}
	
	int age = Period.between(birth, LocalDate.now()).getYears()
	
	
	if (age < 18) {
        throw new UnderAgeException ("yas kicikdir!");
    }
}
