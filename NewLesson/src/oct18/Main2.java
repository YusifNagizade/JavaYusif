package oct18;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        numbers.remove(0);
        numbers.remove(1);
	
        
        System.out.println(numbers.size());
	}

}
