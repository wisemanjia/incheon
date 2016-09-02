package Aug22.AbstractTest;
//abstract 추상클래스로 바꾸기
public abstract class Predator extends Animal{
	public abstract String getName();
	//추상메소드는 앞에 abstract를 추가해야한다.
	//인터페이스처럼 메소드 몸통(구현부)가 없다.
	//	 = 상속받은 녀석들이 구현해야 합니다.(필수)
}
