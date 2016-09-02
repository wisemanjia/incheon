package Aug22.AbstractTest;
//이번에도 어려운, 이번에도 자바의 고급계열인
//추상메소드입니다.
/*
추상클래스 : 인터페이스의 역할도 하면서 클래스같은
			돌연변이 같은 클래스
			
추상클래스를 만들기 위해서는 class앞에 abstract를 붙인다.
내부의 매소드에도 abstract를 붙여야 한다.
인터페이스와 동일하게 메소드 몸통(구현)이 없다.
 = abstract 클래스를 상속받는 클래스에서 해당 메소드를 
 	구현해야한다.
 	


*/
abstract class Hero{
	public abstract void attack();
	public abstract void end();
}

class Superman extends Hero{

	@Override
	public void attack() {
		System.out.println("공격");
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}
	
}

//클래스
public class AbstractTest01 {
	//메소드
	public static void main(String[] args) {
		//각종 지역변수들.......
		Superman superman = new Superman();
		superman.attack();
		/*
		추상클래스 : 객체를 만들 수 없는 클래스
						추상메서드를 하나라도 가지고 있는
						= 미완성된 기능이 있기 때문에
						객체를 만들 수 없습니다.
		
		추상메소드 : 내용이 없는 메소드
		 				미완성된, 구현이 없는 메소드
		  				= 하위클래스에서 구현(오버라이딩)
		  				해야 합니다.
		  				하위클래스에서 구현을 강제시킴
		  				= 프로그램 구조가 확실해집니다.
//추상클래스		  				
abstract A{
	//추상메소드
	 public abstract void attack();
}
*/
		}

}
