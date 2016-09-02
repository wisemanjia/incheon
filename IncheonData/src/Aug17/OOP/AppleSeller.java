package Aug17.OOP;

//파는 사람
public class AppleSeller{
	//필요한 정보는?
	//사과 가격
	final int APPLE_PRICE = 1000; //상수처리
	//사과 갯수
	int appleCount = 35;  //단봉낙타 카멜표기법
	//보유 금액
	int sellerMoney = 0;
		//행동
	//사과를 파는 행동
	public int saleApple(int money){
		int num = money / APPLE_PRICE;
		appleCount -= num;
		sellerMoney += money;
		return num;	
	}
	public void tellSeller(){
		System.out.println("남은 사과는 " + appleCount + "개 입니다.");
		System.out.println("수익은 " + sellerMoney + "원 입니다.");
	}
	
}