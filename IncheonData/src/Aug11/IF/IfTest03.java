package Aug11.IF;
import java.util.Scanner;
public class IfTest03 {
	public static void main(String[] args) {
		// 사용자가 숫자 2개 입력
			// 첫수가 두번째수보다 큽니다.
			//두번째수가 첫수보다 큽니다.
			//두 수가 같습니다.
		Scanner sc = new Scanner(System.in);
		//사용자가 숫자를 입력하는 화면
		//첫 수를 입력해주세요:
		System.out.print("첫수를 입력 :");
		int a = sc.nextInt();
		//두번째 수를 입력해주세요:
		System.out.print("두번째 수를 입력 :");
		int b = sc.nextInt();
		//두 수 판정하기
		//화면에 보여주기
		System.out.println("=====================");
		if(a > b){
			System.out.println("첫 수가 큽니다.");
		}else if(a < b){
			System.out.println("두번째 수가 큽니다.");
		}else{
			System.out.println("두 수가 같습니다.");
		}
		
		//자바의 제어문
		/*
			제어문이란?
			프로그램이 실행될때 특정 조건, 반복을 수행
			또는 멈추게 하기 위한 명령어 구문
			
			제어문 종류
			1. 조건문 : 조건에 따라 분기 되는 조건문
			2. 반복문 : 특정 구문을 반복적으로 수행
			
			
			if(조건식){
				조건식이 참일때
			}else if(조건식){
				조건식이 참일때
			}else if(조건식){
				조건식이 참일때
			}else if(조건식){
				조건식이 참일때
			}else{
				그 외 나머지
			}
			
			switch라는 녀석도 사용합니다.
			if는 조건문의 필요에 따라 구성이 변합니다.
			if문 하나로 정의해도 되고, 여러 if문을
			else if로 나열해도 되고,
			여러가지 모양으로 변경될 수 있습니다.
			 
		
			
			
		*/

	}

}
