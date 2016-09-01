package HW20160901;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	// 숫자 정렬
	// 박상훈
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 연속 또는 띄어쓰기 단위로 입력(12345 또는 1 2 3 4 5) : ");
		String input = sc.nextLine();
		String spliter = (input.contains(" ") ? " " : "");
		String[] strs = input.split(spliter);
		
		for (int i = 0; i < strs.length - 1; i++) {
			for (int j = i; j < strs.length; j++) {
				int num1 = Integer.parseInt(strs[i]);
				int num2 = Integer.parseInt(strs[j]);
				if (num1 > num2) {
					String tmp = strs[i];
					strs[i] = strs[j];
					strs[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(strs));
		sc.close();
	}
}
