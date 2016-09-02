package Aug10;
/*자바의 데이터타입
 * 자바 프로그램에서는 변수건 상수건 값을 담기
 * 위해서는 반드시 그 값의 타입에 맞는 변수를 사용
 * 해야 합니다.
 * 
 * R타입
 * 	p타입을 제외한 모든것.
 * 
 * P타입(Primitive Type)
 * 	수치타입 : 숫자(1+2+3.14 = ?)
 * 		정수 - byte, short, int(기본타입), long
 * 		실수 - float, double(기본타입)
 * 		
 * 	문자타입 : 문자 하나를 표현하기 위한 타입
 * 		(문자형 또한 정수형으로 사용됩니다.
 * 		음수값은 없습니다. 0부터 시작합니다)
 * 		char
 * 
 * 	논리타입 : 참/거짓만 표현할 수 있는 타입
 * 		boolean
 * 	
*/
public class DataType {
	
	public static void main(String[] args) {
		//데이터타입 변수명 = 값;
		byte a = 100;
		String str = "안녕하세요";
		int b = 100;
		//(int)b = (int)b + (int)1;
		b = b + 1;
		a = (byte)(a + 1);
		//문제 : 바이트는 -128~127까지만 가질 수 있
		//습니다. 만약 a를 찍으면 몇이 나올까요?
		//101 -1 null
		a = (byte) 129;
		System.out.println(a);
		//-128
		short d = (short) 32769;
		System.out.println(d);
		System.out.println(d + d);
		
		int f = 100;
		f = f + 100;
		System.out.println(f + f + d + a);
		System.out.println("변수명, 숫자, 문자");
		System.out.println(f);
		System.out.println(100-100-200-200);
/*
 * 자바의 변수
 * 변수는 이미 우리 생활에서 익숙한 개념
 * 변수를 사용하는 주 목적은 같은 타입의 값이
 * 프로그램 실행시에 자주 변경되어야 할 때 이를
 * 변수에 담아서 활용하기 위해서입니다.
 * 
 * 변수의 선언
 * 변수는 특정블럭 내부 어디에서건 선언이 가능합니다.
 * 		메서드 내에서 선언되면 지역변수(local)
 * 		클래스 내에서 선언되면 인스턴스변수
 * 
 * 변수가 처음 선언 될 때는 변수의 좌측에 변수타입,
 * 데이터타입이 선언되어야 합니다.
 * 
 * 변수는 한 번 선언되면 그 변수가 포함하고 있는
 * 블럭네에선 절대 재선언이 불가능합니다.
 * 
 * 같은 타입의 변수는 한 라인에 ';'없이 서술하고 
 * ','로 구분되어지며 마지막에 ';'로 종료.
*/	
		//int a,b,d,e,d;
		
		//저는 ***입니다.(엔터)
		//저는 **살이고, **에 살고 있습니다.(엔터)
		String name = "윤승현";
		byte age = 127;
		String addr = "서울";
	System.out.println("저는 " + name + "입니다.(엔터)");
	System.out.print("저는 ");
	System.out.print(age);
	System.out.print("살이고,");
	System.out.print(addr + "에 살고 있습니다.(엔터)");
		
	}
}
