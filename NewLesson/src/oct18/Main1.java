package oct18;

import java.util.ArrayList;
import java.util.List;


public class Main1 {

	public static void main(String[] args) {
		Person p1 = new Person("Yusif");
		Person p2 = new Person("Rehman");
		Person p3 = new Person("Aliimran");
		Person p4 = new Person("Ali");
		Person p5 = new Person("Ahmed");
		
		List<Person> student = new ArrayList<>();
        student.add(p1);
        student.add(p2);
        student.add(p3);
        student.add(p4);
        student.add(p5);
        
//        for(Person p : student) {
//        		p.printInfo();
//        }
        
        System.out.println(student);

	}

}
