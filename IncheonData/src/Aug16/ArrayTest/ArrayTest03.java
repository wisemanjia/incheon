package Aug16.ArrayTest;

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
		//사용자가 입력한 숫자만큼 배열을 생성
		//그 숫자만큼 값을 입력받아서
		//출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("길이를 입력해주세요.");
		System.out.println("입력한 길이만큼 숫자를 입력해야 합니다.");
		System.out.print("입력예 : 10  길이 입력 : ");
		int[] arr02 = new int[sc.nextInt()];
		//입력
		for (int i = 0; i < arr02.length; i++) {
			System.out.println("값을 입력하세요.");
			System.out.print(i + "번째 숫자 입력:");
			arr02[i] = sc.nextInt();
		}
		//출력
		for (int i : arr02) {
			System.out.println(i);
		}
	}

}
