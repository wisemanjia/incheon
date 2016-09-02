package Aug12.If;

import java.io.IOException;

public class Iftest01 {
	public static void main(String[] args) throws IOException {
		// 사용자에게 숫자 3개를 입력하게 함.
		// 그리고 그 수를 가장 큰 수 부터 화면출력.
		// 1번 변수 이름 num1. 3
		// 2번 변수 이름 num2. 5
		// 3번 변수 이름 num3. 8
		// 로직 -> 가장 큰 수를 1번(8)에,
		// 2번에(5), 3번에 (3)
		// 이걸 출력 : 8 >= 5 >= 3
		int num1, num2, num3, temp;
		
		// 사용자가 입력할 수 있도록 화면에 출력
		System.out.print("첫번째 값을 입력하세요:");
		num1 = System.in.read() - 48;
		System.in.read();
		System.in.read();

		System.out.print("두번째 값을 입력하세요:");
		num2 = System.in.read() - 48;
		System.in.read();
		System.in.read();

		System.out.print("세번째 값을 입력하세요:");
		num3 = System.in.read() - 48;
		System.in.read();
		System.in.read();
		
		

		// 로직만들기 -> 정렬시키기 = if문으로
		if (num2 >= num1 && num2 >= num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}else if(num3 >= num1 && num3 >= num2){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num3 >= num2){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		//좋은 프로그램이란 무엇인가?
		

		// 출력
		System.out.println(num1 + " >= " + num2 + " >= " + num3);

	}
}
