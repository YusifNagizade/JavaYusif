package oct25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main2 {

	public static void main(String[] args) {
		 List<String> adlar = new ArrayList<>();
		 
		 adlar.add("Alma");
		 adlar.add("Armud");
		 adlar.add("Qar");
		 adlar.add("Kitab");
		 adlar.add("Qelem");
		 
		 
		 Iterator<String> yoxla = adlar.iterator();

	        while (yoxla.hasNext()) {
	            String name = yoxla.next();
	            if (name.startsWith("A")) {
	                yoxla.remove();
	            }
	        }
	        
	        System.out.println(adlar);

	}

}
