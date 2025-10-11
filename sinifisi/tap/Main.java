package tap;


public class Main {

	public static void main(String[] args) {
		Flyable Helicopter = new Flyable() {
			@Override
			public void fly_obj(String name) {
				System.out.println(name + "ucur");
			}
		};
		Flyable Airplane = new Flyable() {
			@Override
			public void fly_obj(String name) {
				System.out.println(name + "ucur");
			}
		};
		Flyable Spacecraft = new Flyable() {
			@Override
			public void fly_obj(String name) {
				System.out.println(name + "ucur");
			}
		};
		
		Helicopter.fly_obj("Helicopter");
		Airplane.fly_obj("Airplane");
		Spacecraft.fly_obj("Spacecraft");

	}

}
