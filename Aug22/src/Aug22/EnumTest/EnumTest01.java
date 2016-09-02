package Aug22.EnumTest;
//기타 : http://stackoverflow.com/ 꼭 가보셔야할 사이트
//enum:열거타입 : 필드에 저장할 수 있는 값들을 나열/정의
//열거한 값만 쓸 수 있습니다.
//같은 값을 가질 수 없습니다.
//enum은 클래스 이름과 중복될 수 없습니다.
enum SeasonName{Spring, Summer, Fall, Winter};

class Season{
	SeasonName name;
	int startMonth;
	
	public void seasonInfo(){
		this.name = SeasonName.Spring;
		startMonth = 3;
	}
	public void seasinShow(){
		System.out.println("계절은 " + name);
		System.out.println("시작 월은 " + startMonth);
	}
}
public class EnumTest01 {
	public static void main(String[] args) {
		Season season = new Season();
		season.seasonInfo();
		season.seasinShow();
		
	}

}
