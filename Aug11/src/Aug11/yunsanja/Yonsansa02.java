package Aug11.yunsanja;

import java.io.IOException;
import java.util.Scanner;

public class Yonsansa02 {
	public static void main(String[] args){
		System.out.print("당신의 성별을 코드를 입력하세요:(1,2)_");
		int code = System.in.read() - 48;
		// System.out.println(code);
		System.in.read();
		System.in.read();
		// 나이를 입력받고
		// 나이에 따라서 가격을 차등하기 위함

		// 어린아이는 할인, 성인은 기본, 노인은 2배
		//0 ~ 2 :할인, 3 ~ 5기본, 6~9 2배
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		age = age / 10; // 33 -> 3, 99 -> 9
		//System.out.println(age);
		//2, 기본, 3, x2===========스위치추가
		//정수관련된 것 많이 사용함
		switch (age) {
		case 0:
		case 1:
		case 2:
			//age가 0~2일때 실행할 문장
			age = 1;
			break;
		case 3:
		case 4:
		case 5:
			//age가 3~5일때 실행할 문장
			age = 2;
			break;
			
		default:
			//6~9일때 실행할 문장
			age = 3;
			break;
		}

		int price = 50000;
		int user; // 사용자가 입력한 값에 따라 지불할 가격
		// if code값이 1일경우
		if (code == 1 && age == 1) {//남자이고 0~20대
			// 참일경우
			System.out.println("당신은 0~20대 남자입니다.");
			user = price / 2;
			
		} else if(code == 1 && age == 2){ //남자, 3~50대
			System.out.println("당신은 3~50대 남자입니다.");
			user = price;
			
		}else if(code == 1 && age == 3){ //남자, 99세
			System.out.println("당신은 6~90대 남자입니다.");
			user = price * 2;
			
		}else if(code == 2 && age == 1){//여자, 0~20대
			System.out.println("당신은 0~20대 여자입니다.");
			user = price / 2;
			
		}else if(code == 2 && age == 2){//여자, 3~50대
			System.out.println("당신은 3~50대 여자입니다.");
			user = price;
			
		}else{
			// 거짓일경우
			System.out.println("당신은 6~90대 여자입니다.");
			user = price * 2;
		}
		System.out.println("당신이 지불할 가격입니다.");
		System.out.println("티켓가격 : " + user);
		
		/*
		if(식1 && 식1-1){ //두개 모두 참일경우만 and
			식1이 참이고, 식1-1이 참일때
		}else if(식2 || 식2-2){ //식 어느것 하나만 참 or
			if첫문장이 거짓이라 이곳으로
			식2나 식2-2각각 참이면 실행
		}else if(식3){
			식1과 2는 거짓이지만 식 3이 참일때
		}else{
			그 외 나머지
		}
		*/
		
	}
}
