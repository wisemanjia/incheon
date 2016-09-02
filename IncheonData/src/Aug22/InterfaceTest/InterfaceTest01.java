package Aug22.InterfaceTest;
//인터페이스 : 다른 언어에서는 찾기 힘든 자바의 고급!기능
//왜? 나왔을까?
//어떻게 써야할까?
//인터페이스의 특징은 무엇일까?
/*
인터페이스란?
추상클래스 = 추상화, 추상적, 
추상클래스는 일반 메소드와 추상메소드를 둘 다 가질 수 있다.
인터페이스는 오로지 추상메소드와 상수만을 가질 수 있다.

인터페이스 내에 존재하는 메소드는 무조건
Public abstract로 선언된다.

인터페이스 내에서 존재하는 변수는 무조건
public static final로 선언된다.

인터페이스는 다중 상속과 비슷한 기능을 제공한다.

인터페이스를 잘 쓰면 편해집니다. 
인터페이스는 외부를 서로 이어주는 통로역할을 합니다.

물리적 세계 	자바세계
컴퓨터			ZooTrainer
USB 포트		Predetor
HDD, Printer	Lion, Dog, Leopard

USB포트는 기기들이 지켜야할 규격, 규칙입니다. 


interface 인터페이스명{
	void 추상메소드(); //구현부가 없습니다.
}

class 클래스명 implements 인터페이스명{
	인터페이스에서 미 구현된 추상메소드 오버라이드
}


인터페이스 구현시 주의할 점
클래스에 인터페이스 상속시 인터페이스 내에 정의된 모든
추상메소드를 구현해야 한다.

*/
// 그럼? 상속과 인터페이스의 차이점은 뭔가요?
//상속 : class A extends B 
//B라는 클래스를 상속받아 A의 기능을 더한다. 
//순수상속 : 부모로부터 모든 권한과 재산 능력을 가져오기

//인터페이스 : class A implements B
//B라는 인터페이스를 구현하겠다.
//권한 상속 : 인터페이스만 가져오기 : 비어있는 것을
			//가져와서 내가 그 속을 만들기



interface Sayhi{//인터페이스 정의
	public void SayHello();//추상메소드, 몸통이 없어요.
	public void SayBye();
}//인터페이스 끝.

//여기서 인터페이스 가져오기
class SayHiMethod implements Sayhi{
	//이곳에서 인터페이스가 가지고 있던
	//미완의 SayHi를 완성시켜주면 됩니다.
	@Override
	public void SayHello() {
		System.out.println("안녕?");
	}
	public void SayBye(){
		System.out.println("잘가~");
	}
	
}
//실행


//동물원
//당신은 사육사 입니다.
//만약, 육식동물이 오면 고기를 줍니다.
//호랑이가 와도, 사자가 와도, 치타가 와도, 표범....

//부모클래스 상속은 extends, 인터페이스는 implements
public interface InterfaceTest01 {
	
}
