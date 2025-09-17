package task6;

public class Person {
	String name;
	String surname;
	static String city;
	
	
	Person(String name,String surname,String city){
		this.name = name;
		this.surname = surname;
		this.city = city;
	}
	
	public void printInfo() {
		System.out.println("ad " + name);
		System.out.println( "soyad " + surname);
		System.out.println("seher " + city);
	}
		
	
}
