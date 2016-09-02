package Aug16.OOP;

import java.util.Scanner;

//이제 드디어 OOP가 시작됩니다.
public class OOPTest02 {//클래스 시작
	public static void main(String[] args) {//메 시
		//alan
		alan a1 = new alan();
		//marc
		marc m1 = new marc();
		
		//엄마가 밥을 먹일까 말까?
		System.out.println("당신은 alan의 엄마입니다.");
		System.out.println("아침밥을 먹일까요?");
		System.out.print("1. 먹인다.     2. 안 먹인다.");
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		if(check == 1 ){
			a1.breakfast = true;
		}
		//marc : 너 아침 먹었어?
		m1.aks();
		//alan : (먹었으면) 먹었어.
			//(안 먹어으면) 같이 먹을까?
		a1.answer();
		//메인 메소드 안에서 작업
		
	}//메인 메소드 끝
}//클래스 끝