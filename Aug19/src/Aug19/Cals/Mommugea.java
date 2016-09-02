package Aug19.Cals;

import java.util.Scanner;

//객체지향 없이 프로그래밍하기
public class Mommugea {
//표준체중 구하기
//표준체중 : (키-100)*0.9
//비만도 구하기 
//비만도 ((실체중-표준체중)/표준체중) * 100
//키입력
//몸무게 입력
//이름입력
//비만도 범위
	//30이상 : 비만
	//20이하 허약
	//그 중간이 정상
	
//표준체중 : 70
//비만도 : 100
//누구누님 당신은 정상입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비만도를 출력하는 프로그램입니다.");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("키를 입력하세요:");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요:");
		int weight = sc.nextInt();
		//계산
		double standardWeight = (height-100) * 0.9;
		
		double biManDo = ((weight-standardWeight)/standardWeight) * 100;
		
		/*System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);*/
		System.out.println("======================");
		System.out.printf("표준체중 : %3.2f \n", standardWeight);
		System.out.printf("비 만 도 : %3.1f \n", biManDo);
		System.out.print(name + "님은 ");
		
		if(biManDo > 30){
			System.out.println("비만입니다.");
		}else if(biManDo < 20){
			System.out.println("말랐습니다.");
		}else{
			System.out.println("정상입니다");
		}
		
	}

}
