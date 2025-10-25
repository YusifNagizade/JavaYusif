package oct25;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main3 {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Phone", 14.0));
		products.add(new Product("Tv", 120.0));
		products.add(new Product("mouse", 110.0));
		products.add(new Product("Laptop", 600.0));
		
		
		
		 Collections.sort(products);
		 
		 products.forEach(System.out::println);
	}

}
