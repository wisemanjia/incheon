package Aug19.Cals;
//객체지향을 사용하지 않고 계산기 만들기
//입력순서, if정리, 객체비교문, 등등등 수정하세요...
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String input, reInput;
		int fir, sec;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("어떤 계산을 원하시나요?:");
			input = sc.next();//공백 제거, 엔터키 제거 그리고 저장
			//nextline(); 공백포함, 엔터키 제거. 엔터키 중 라인 바꿈 저장

			if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
				System.out.print("1수 입력 :");
				fir = sc.nextInt();
				System.out.print("2수 입력 :");
				sec = sc.nextInt();

				if (input.equals("+")) {
					System.out.println("결과는 : " + (fir + sec));
				} else if (input.equals("-")) {
					System.out.println("결과는 : " + (fir - sec));
				} else if (input.equals("*")) {
					System.out.println("결과는 : " + (fir * sec));
				} else if (input.equals("/")) {
					// 만약 입력값이 0이라면
					if (fir == 0 || sec == 0) {
						System.out.println("나눌 수 없습니다.");
					} else {
						System.out.println("결과는 : " + (fir / sec));
					}
				} else {
					System.out.println("잘못된 입력입니다.");
				}

				System.out.print("다시 계산할까요?(Y/N):");
				reInput = sc.next();

				if (reInput.equals("n") || reInput.equals("N")) {
					System.out.print("계산기 종료. 안녕히 가세요.");
					sc.close();
					break;
				}

			}

		}
	}

}

