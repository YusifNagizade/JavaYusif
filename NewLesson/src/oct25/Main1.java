package oct25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main1 {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Bmw", 340));
		cars.add(new Car("Mercedes", 120));
		cars.add(new Car("Toyota", 140));
		
		cars.sort(Comparator.comparingInt(Car::getSpeed));
		
		
		cars.forEach(System.out::println);

	}

}
