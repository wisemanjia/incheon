package Sep01.Test;

import java.util.Scanner;

//복습1
//사용자가 입력한 두 수를 더해서 화면에 출력하기
//#로직만들기, #흐름 생각하기, #나중에는알고리즘
public class Test01 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		// 값 1을 입력하세요라고 쓰기
		System.out.print("Input 1st Number :");
		// 먼저 입력받기
		int fir = sc.nextInt();
		// 값 저장하기
		// 값 2를 입력하세요 라고 쓰기
		System.out.print("Input 2nd Number :");
		// 값 입력받기
		// 값 저장하기
		int sec = sc.nextInt();
		// 연산자를 입력받아서 그 연산자가

		System.out.print("Input 연산자:");
		String y = sc.next();
		// +면 더하기
		// -면 빼기
		// + - / *
		// 값 출력하기
		if (y.equals("+")) {
			System.out.println("더하기 계산 결과는 : " + (fir + sec));
		} else if (y.equals("-")) {
			System.out.println("더하기 계산 결과는 : " + (fir - sec));
		} else if (y.equals("*")) {
			System.out.println("더하기 계산 결과는 : " + (fir * sec));
		} else if (y.equals("/")) {
			System.out.println("더하기 계산 결과는 : " + (fir / sec));
		}
	}
}
