package Aug10;
import java.util.Scanner;

//이 프로그램을 실행시키기 위해 필요한 자바
//명령어를 불러 올때 사용

//bmi계산기
public class DataType06 {

	public static void main(String[] args) {
		//1. 입력 : 키, 몸무게
		//새로운 입력방법 : 스케너
		//int a = 10;
		//사용자가 엔터키 치기 전까지의 값
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 미터로 입력하세요(1.7m):_");
		double ki = sc.nextDouble();
		
		System.out.print("몸무게를 입력하세요(kg):_");
		double mom = sc.nextDouble();
		
		//2. 계산하기
			/*
			체중/(키 * 키) 
			*/
		double result = mom / (ki*ki);
		//3. 출력
		System.out.println(result);

	}

}
