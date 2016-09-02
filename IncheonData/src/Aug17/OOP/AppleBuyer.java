package Aug17.OOP;
//사는 사람
public class AppleBuyer{
	//정보
	//돈
	int buyerMoney = 5000;
	//사과
	int countApple = 0;
	
	//행동
	//사는 행동
	public void buyApple(AppleSeller seller, int money){
		countApple += seller.saleApple(money);
		buyerMoney -= money;
	}
	//결과 말하기
	public void tellBuyer(){
		System.out.println("남은돈은 "+ buyerMoney +"원 입니다.");
		System.out.println("구매한 사과는 "+ countApple +"개 입니다.");
	}
}