package Sep01.Collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapTest02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, Double> ht = 
				new HashMap<String, Double>();
		ht.put("김형중", 182.5);
		ht.put("김범", 180.3);
		ht.put("금잔디", 163.6);
		ht.put("구준표", 187.2);
		//System.out.println(ht);
		
		System.out.print("이름을 입력하세요: ");
		String key = input.next();
		input.close();
		double height = ht.get(key);
		
		System.out.println(key + "의 신장 : " + height);
		
		System.out.println("\n이름\t 신장");
		Set<String> set = ht.keySet();
		for (String item : set) {
			height = ht.get(item);
			System.out.println(item + " \t" + height);
		}

	}
}