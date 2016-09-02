package Aug17.OOP;

import java.util.Scanner;

//문제 : 이번에는 만들으신 셀러와 바이어를 
//활용해서
//1 바이어에게 일정금액의 용돈을 주고 
//2 사용자가 금액을 입력하면 그 금액만큼
//사과를 구매하는 시스템을 만들어주세요.
public class OOPTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AppleBuyer ab = new AppleBuyer();
		AppleSeller as = new AppleSeller();
		
		System.out.println("당신의 배우자에게 용돈을");
		System.out.println("줄 수 있습니다. 얼마를 주");
		System.out.print("시겠습니까? :");
		
		ab.buyerMoney = sc.nextInt();

		System.out.println("당신의 배우자가 사과를 사오");
		System.out.println("겠다며 이쁜짓을 합니다. 몇 원");
		System.out.print("어치 사로라고 하시겠습니까? :");
		
		ab.buyApple(as, sc.nextInt());
		
		System.out.println("바이어가 말합니다.");
		ab.tellBuyer();
		System.out.println("셀러가 말합니다.");
		as.tellSeller();
	}

}
