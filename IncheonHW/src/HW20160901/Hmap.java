package HW20160901;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hmap {
	public static void main(String[] args){
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("김형중", 182.5);
		map.put("김범", 180.3);
		map.put("금잔디", 163.6);
		map.put("구준표", 187.2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String key = sc.next();
		sc.close();
		
		double height = map.get(key);
		System.out.print(key + "의 신장 : " + height);
		
		System.out.println("\n이름\t신장");
		Set<String> set = map.keySet();
		for(String item : set){
			height = map.get(item);
			System.out.println(item + " \t" + height);
		}
		
	}

}
