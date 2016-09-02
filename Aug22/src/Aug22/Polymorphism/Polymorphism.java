package Aug22.Polymorphism;

//다형성 폴리모피즘
/*
다형성은 동적 바인딩 : 런타임때 최종 타입이 결정되는 것
다형성을 지원하려먼 그 언어가 동적 바인딩을 지원해야 함.

컴파일 타임때 에러판정이 남
컴파일 타임때 Hero타임 -> Hero클래스에서 makeSuit()
메소드를 확인
*다형성의 한계: 상위 클래스에 만들어진 메소드에 한해 가능

*/
//hero
class Hero {
	public String name;

	public void attack() {
		System.out.println("공격");
	}
}

// ironman
class Ironman extends Hero {
	public String spot = "하늘";
	public int suitCount;

	public void makeSuit() {
		System.out.println("javis, 슈트 만들어줘.");
	}

	@Override
	public void attack() {
		System.out.println("레이저공격");
		super.attack();
	}

}

// spiderman
class Spiderman extends Hero{
	public String spot = "바다";
	@Override
	public void attack() {
		System.out.println("거미줄 공격");
		super.attack();
	}
}

// hulk
class Hulk extends Hero{
	public String spot = "땅";
	@Override
	public void attack() {
		System.out.println("주먹....");
		super.attack();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Hero h1; //컴파일타임
		h1 = new Ironman();//런타입
		//반드시 상위 클래스가 앞으로 와야 합니다.
		
		h1.attack(); // 어떤 것이 출력?
//하위클래스에서 정의 한 멤버나 메소드를 사용하려면?
		
		//방법 1.
		((Ironman)h1).makeSuit(); //형변환 (int)10;
		//상위클래스에 없는 경우는 형변환을 시켜서 사용
		//이름지정?
		h1.name = "토니";
		System.out.println(h1.name);
		
		//방법2.
		int a = 10;
		byte ii = (byte)a;
		
		Ironman i = (Ironman)h1;
		System.out.println(i.name);
		i.makeSuit();
		
		System.out.println("========절취선=========");
		//배열... 각 영웅 넣기
		Hero[] avangers = new Hero[3];
		avangers[0] = new Hulk();
		avangers[1] = new Spiderman();
		avangers[2] = new Ironman();
		
		for (Hero hero : avangers) {
			hero.attack();
		}
		
		for (int j = 0; j < avangers.length; j++) {
			avangers[j].attack();
		}
		
		
		
	}
}
