package HW20160901;

import java.util.ArrayList;

public class HK20160829leejaehoon {
public static void main(String[] args) {
		
		
		//1. ArrayList 
		 
		ArrayList<Integer> su = new ArrayList<Integer>();
		
		int sum = 0;
		

		for (int i = 0; i < 46; i++) {
			su.add(i);
			
			if(i % 2 == 0){
				System.out.print(su.get(i) + " 번째, ");
				
			}
			
			if(i % 2 != 0){
				System.out.println(su.get(i));
				sum += i;
			}
		}
		System.out.println("Result " + sum);
		
		for (int i = 0; i < su.size(); i++) {
			System.out.print(i + "번째");
			System.out.println(su.get(i));
		}
		
		
		
	}
}
