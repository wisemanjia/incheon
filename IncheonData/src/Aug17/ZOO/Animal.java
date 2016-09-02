package Aug17.ZOO;
//동물농장

interface Scream{//이 녀석은 인터페이스
	//동물들이 내는 소리를 여기에서 구현해주겠습니다.
}

//이것은 추상클래스입니다. animal을 상속받은 Predator
abstract class Predator extends Animal{
	//클래스 내용 구현 + 상위 animal의 기능을 쓸 수 있음
}

public class Animal {
	String name;//이름이라고 선언만 함
	
	public void setName(String name){ //이름설정 메소드
		this.name = name;//실제 대입
		//this, super????
	}
	
	
	public static void main(String[] args) {		
		Dog dog1 = new Dog();
		//클래스를 만들고 -> 객체를 생성합니다.
		// 클래스명 변수명 = new 클래스명();
		//객체의 속성으 클래스에서 설정한다.
		//설정한 속성 출력은 아래 문장
		System.out.println(dog1.age);
		System.out.println(dog1.name);
		
		//클래스는 멤버를 가질 수 있다 -> 변수와 메소드
		
		//클래스의 메모리 활용
		//-스택 -> 메인에서 설정한 클래스명 변수명을 설정
			//Dog dog1 = new Dog();
		//-힙 ->객체 생성
		//		클래스를 활용하여 힙 영역에 공간을 설정
		//클래스로 만들어진 객체를 "인스턴스"라고 합니다.
		//객체 = 인스턴스(힙에 설정된 클래스공간)
		//			객체를 만드는 코드를 만나면 클래스대로
		//			메모리 힙heap 영역에 공간을 만듬
		//			(참조형)
		
		
		//dog1 = 객체~
		String name = ""; //객체
		/*
		OOP특징
			캡슐화 = 보안 = 보호
				콘텍600
				관련된 데이터(필드)와 기능(메소드)가
				하나의 묶음으로 처리
				
			상속
				코드의 재활용 = 이미 작성된 클래스(부모)를
				이어받아서 새롭게 만드는(자식) 것
				자식클래스는 부모클래스의 모든 속성(필드)과
				동작(메소드)를 사용할 수 있다.
				필요한 기능은 자식매소드에서 추가해서 사용
				
			추상화
				불필요한 것을 제외하고 필요한 것만 유지
				실제 객체를 인스턴스화 할때
				필요한 내용만 남기고 나머지는 제외하는것
			
			다형성
				객체의 동작이 변경되는것
				매게변수나 상황에 따라 동작이 변경되는것
				
				
|||||||||||||||객체지향 프로그램의 원칙|||||||||||||||||
1. Single Responsibility Principle(단일 책임 원칙)
		모든 클래스는 하나의 책임을 가져야 한다.
		= 클래스를 수정하는 목적은 하나여야 한다.
		
2. Open Closed Principle (개방-폐쇄의 원칙)
		기능을 변경하거나 확장할 수 있지만(개방),
		수정에 대해서는 폐쇄되어야 한다.
		
3. Lisov Substitution Principle(리스코프 치환법칙)
		자식클래스는 언제나 자신의 부모 클래스를 교체
		할 수 있다.

4. Interface Segregation Principle(인터페이스 분리 원칙)
		인터페이스는 그 인터페이스를 사용하는 클라이언트를
		기준으로 분리되어야 한다.

5. Dependency Inversion Principle(의존성 역전 법칙)
		상위클래스는 하위 클래스에 의존해서는 안 된다.

		*/
	}
	
}

class Dog{
	int age = 1;
	String name = "R2D2";
}
