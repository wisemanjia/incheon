package Aug17.OOP;
public class OOPTest05 {
	public static void main(String[] args) {
	//여러분이 집에가면서 사과파는 과일장수를 봤습니다.
	//사과를 사고 집으로 가는 프로그램입니다.
	//사과를 사면 내게 사과가 + 되고, 돈이 -됩니다.
	//사과를 파는 사람 객체만들기
		AppleSeller seller1 = new AppleSeller();
		AppleBuyer buyer1 = new AppleBuyer();
		AppleSeller seller2 = new AppleSeller();
	//파는 사람은 사과-, 돈+
	//사는 사람은 사과+, 돈-,
		buyer1.buyApple(seller1, 1000);
		buyer1.buyApple(seller2, 3000);
		
	//객체는 사과 파는 사람, 사과 사는 사람
		
	//결과값 이야기하기
		seller1.tellSeller();
		buyer1.tellBuyer();
		seller2.tellSeller();
		
		
		
	}
}




