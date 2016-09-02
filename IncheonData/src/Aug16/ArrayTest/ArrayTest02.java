package Aug16.ArrayTest;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
	// 부탁드립니다.
	//사용자가 숫자를 입력해서 그 값을 arr01이라는
	//배열에 저장하고 출력하는 문장을 만들어주세요.
	//입력칸 :  3개, 타입은 int, 배열명은 arr01
		
		int[] arr01 = new int[3];
		//사용자에게 값 입력받기
		System.out.println("값을 입력하세요");
		System.out.print("첫번째 정수 :");
		Scanner sc = new Scanner(System.in);
		//스케너 값 배열 arr01에 저장하기
		arr01[0] = sc.nextInt();
		System.out.print("두번째 정수 :");
		arr01[1] = sc.nextInt();
		System.out.print("세번째 정수 :");
		arr01[2] = sc.nextInt();
		
		//출력하기
		for (int i : arr01) {
			System.out.println("값 : " + i);
		}
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
	}

}
