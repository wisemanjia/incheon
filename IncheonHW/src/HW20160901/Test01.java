package myproject;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//값 1을 입력하세요하고 쓰기
		System.out.print("값 1을 입력하세요 : ");
		//먼저 입력받기
		Scanner sc = new Scanner(System.in);
		//값 저장하기
		int input = sc.nextInt();
		//값 2를 입력하세요 라고 쓰기
		System.out.print("값 2를 입력하세요 : ");
		//값 입력받기
		int input1 = sc.nextInt();
		//값 저장하기
		//값 두값 더하기
		int plus = input+input1;
		//값 출력하기
		System.out.println("더한값 입력하세요 : "+plus);
	}
}
