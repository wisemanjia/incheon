package HW20160901;

import java.util.Scanner;

public class Sos {

	// 복습1
	// 사용자가 입력한 두 수를 더해서 화면에 출력하기
	public static void main(String[] args) {
		int str1;

		// 값 1을 입력하세요라고 쓰기
		System.out.println("갑 1을 입력하세요");
		// 먼저입력받기
		Scanner input01 = new Scanner(System.in);
		int a = input01.nextInt();

		// 값 2를 입력하세요라고 쓰기
		System.out.println("갑 2를 입력하세요");
		// 값 입력받기
		Scanner input02 = new Scanner(System.in);
		int b = input02.nextInt();
		// 값 계산하기

		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);

			}
		} else {
			for (int j = b; j <= a; j++) {
				System.out.println(j);

			}

		}

	}

}