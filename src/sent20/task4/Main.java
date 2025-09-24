package task4;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		int cemCut = 0;
		int cemTek = 0;
		while(i < 100) {
			if(i % 2 == 0) {
				cemCut +=i;
			}else {
				cemTek +=i;
			}
			i++;
		}
		
		int ferq = cemCut - cemTek;
		
		System.out.println(ferq);

	}

}