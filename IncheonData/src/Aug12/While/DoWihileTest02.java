package Aug12.While;

import java.util.Scanner;

public class DoWihileTest02 {
	public static void main(String[] args) {
		//여러분이 세 과목 시험을 본다고 합니다.
		//java와 jsp와 android입니다.
		//지금 만드는 프로그램이 성적을 관리하는 프로그램입니다.
		//실행 되면 성적을 입력합니다.
		//1 java :     2. jsp :       3. and :
		//사용자가 성적을 입력하면 프로그램은 올바른 점수인지
		//검사합니다. 잘못 입력한 점수는 재 입력을 유도합니다.
		//이렇게 입력받은 점수를 평균과 합계를 내고 출력합니다.
		//학점은 A,B,F로 합니다.
		//기준 : 90점 이상 A , 80점 이상 B, 나머지는 F
		
		int java, jsp, android, total;
		double avg;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("자바의 점수를 입력하세요 :");
			java = Integer.parseInt(sc.next());
		} while (java < 0 || java > 100);
		
		do {
			System.out.print("jsp의 점수를 입력하세요 :");
			jsp = Integer.parseInt(sc.next());
		} while (jsp < 0 || jsp > 100);
		
		do {
			System.out.print("Android의 점수를 입력하세요 :");
			android = Integer.parseInt(sc.next());
		} while (android < 0 || android > 100);
		
		//총점 = java + jsp + android;
		total = java + jsp + android;
		
		//평균 = 총점 / 과목수;(이거 주의하셔야 정확한 값이 나와요)
		avg = total / 3.0;
		//System.out.println(avg);
		//학점은 스위치 쓰세요(이것도 조심하세요)
		switch ((int)(avg/10)) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;

		default:
			grade = 'F';
			break;
		}
		
		//출력
		System.out.println("당신의 총점은 " + total);
		System.out.println("당신의 평균은 " + avg);
		System.out.println("당신의 학점은 " + grade);

	}

}
