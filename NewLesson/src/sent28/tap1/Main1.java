package sent28.tap1;

public class Main1 {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		rabbit.name = "b";
        rabbit.surname = "n";
        rabbit.color = "qara";
        rabbit.length = 1.2;
        
        Dog dog = new Dog();
        dog.name = "B";
        dog.surname = "D";
        dog.color = "qara";
        dog.speed = 11.0;
        
        System.out.println(dog.speed);

	}

}
