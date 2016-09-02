package Aug19.Cals;

//객체지향으로 바꿔보기
import java.util.Scanner;

public class Calculator02 {
	public static void main(String[] args) {
		String input, reInput;
		int fir, sec;
		Scanner sc = new Scanner(System.in);
		CalLogic1 cl1 = new CalLogic1();

		while (true) {
			System.out.print("어떤 계산을 원하시나요?:");
			input = sc.next();
			if (cl1.check(input)) {
				System.out.print("1수 입력 :");
				fir = sc.nextInt();
				System.out.print("2수 입력 :");
				sec = sc.nextInt();

				cl1.logic(fir, input, sec);

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

class CalLogic1 {
	// 계산 몸뚱이
	public boolean check(String str) {
		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
			return true;
		}else{
			return false;
		}
	}

	public void logic(int a, String b, int c) {
		if (b.equals("+")) {
			System.out.println((a + c));
		} else if (b.equals("-")) {
			System.out.println((a - c));
		} else if (b.equals("*")) {
			System.out.println((a * c));
		} else if (b.equals("/")) {
			System.out.println((a / c));
		} else {
			System.out.println("예상치 못한 오류가 발생하였습니다.");
		}
	}
}