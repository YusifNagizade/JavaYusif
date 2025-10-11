package oct8;

import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		//3?
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		
		//5,6?
		
		
		LocalDate plusFiveDays = today.plusDays(5);
		System.out.println(plusFiveDays);
		
		
		LocalTime minusThreeHours = time.minusHours(3);
		System.out.println(minusThreeHours);
		
		

	}

}
