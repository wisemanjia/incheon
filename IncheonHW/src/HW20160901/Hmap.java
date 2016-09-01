package HW20160901;

import java.util.HashMap;
import java.util.Scanner;

public class Hmap {
	public static void main(String[] args){
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.print((i + 1) + "번째 값 입력(abc,123) : ");
			String[] kv = sc.nextLine().replaceAll(" ", "").split(",");
			map.put(kv[0], kv[1]);
		}
		
		System.out.print("키 입력 : ");
		String get = sc.next();
		System.out.println("값 : " + map.get(get));
		sc.close();
		
	}

}
