package Wrapper;
public class Wrapper02 {
//Wraper Class is?
/*Java는 데이터를 클래스나 객체 이외(int, byte, boolean 등등)과
 * 같은 기초 타입을 가진다. 따라서 java에서는 기본타입과 객체
 * 참조 같은 두가지 타입의 관리 데이터를 가지게 됩니다.
 * 예를 들어 게이터를 저장할 때 기본형 타입의 변수에
 * 저장할 수 있고, 다양한 객체들을 저장할 수 있는 컨테이너
 * 역할을 하는 객체를 생성할 수 있다.
 * 그러나 어떤 상황에서는 기본형 타입을 객체로 사용해야 할
 * 경우가 있습니다.
 * 이러한 경우에 기본형 타입 값을 객체로 포장해야 할 필요가
 * 있습니다.
 * 
 * 포장클래스Wrapper 클래스는 특정 기본형 타입을 나타냅니다.
 * Integer클래스는 간단한 정수타입을 표현합니다.
 * Integer클래스로부터 생성된 객체는 하나의 int값을 저장합니다.
 * Wrapper 클래스의 구성자는 저장할 기본형 타입 값을 받습니다. * 
 */
	public static void main(String[] args) {
		Integer age = new Integer(30);
		//그럼 문제, 3.14값을 저장하는 더블타입의 변수명 pi
		//double pi = 3.14; 이거 아님;;;
		Double pi = new Double(3.14);
		//바이트 -128~127 by 127
		//byte by = 127; 이거 아님;;;
		Byte by = new Byte((byte) 127);
		/*
		Integer 선언으로 객체가 선언되면 age 객체는 정수 30을
		객체로 나타내며 기본 타입이 아닌 객체가 필요한 곳에
		사용할 수 있습니다.
		Java의 각 기초타입에 대해 Java클래 라이브러리 내에
		상응되는 Wrapper Class가 존재합니다.
		모든 Wrapper클래스는 java.****패키지 안에 정의 됩니다.
		
		void 타입을 나타내는 Wrapper클래스도 있습니다.,
		그러나 다른 Wrapper클래스와 달리 void는 실체화될 수
		없고 단지 공(空, 비어있다) 참조 개념을 나타냅니다.
		*/
		
		//Boxing and UnBoxing
		/*Wrapper 클래스는 산술연산을 위해 정의된 클래스가
		 * 아니기 때문에 값을 저장하는 새로운 객체의 생성 및 
		 * 참조만 가능합니다.
		 * 
		 * Boxing : 기본형 자료를 Wrapper클래스 객체로 변경하는 
		 * 			과정을 말합니다. 
		*/
		Integer age2 = new Integer(30);
		/* UnBoxing : 각각의 객체를 기본 자료형으로
		 * 			  변경/사용하는 과정
		*/
		int age3 = age2.intValue();
		//AutoBoxing and AutoUnBoxing
		/*1.5버전 이후에는 자동으로 박싱/언박싱을 처리할 수
		 * 있도록 AutoBoxing과 AutoUnBoxing을 제공합니다.
		 * AutoBoxing : 
		*/
		Integer age4 = 33;
		/*숫자 33을 Integer로 선언된 age4에 넣기 위해서는
		 * 객체를 생성해야 하지만, 바로 대입하면
		 * AutoBoxing가 자동으로 해줍니다.
		 * 
		 *  AutoUnBoxing
		*/
		Integer age5 = new Integer(34);
		int num = age5;
		/* Integer객체에 있는 int 값을 가져오기(UnBoxing)
		 * 위해서는 변수명.intValue();메소드를 이용해서 
		 * 뽑아야 하지만, int형 변수에 Integer 객체를 대입하면
		 * 자동으로 AutoUnBoxing됩니다.
		*/
		
		
		
		/**중요
		 * AutoBoxing과 AutoUnBoxing은 단지 기본형 타입과
		 * 상응하는 Wrapper 클래스에서만 일어납니다.
		 * 다른 경우에는 대입을 시도하면 컴파일 에러가 발생합니다.
		 * Integer는 intValue()로, Double은 doubleValue()로 해야
		 * AutoBoxing과 AutoUnBoxing이 일어납니다.
		*/
		Double pi2 = 3.14;
		int num1 = pi2.intValue(); //?
		//int num2 = pi2;
		
		/**
		 * Wrapper 클래스의 기본 메소드들
		 * 메소드			반환값		설명
		 * booleanValue()	boolean		기본형 데이터를 문자열로
		 * 								바꾼 뒤에 변환
		 * byteValue()		byte		객체의 값을 byte 값으로 변환
		 * doubleValue()	double		객체의 값을 double값으로 변환
		 * floatValue()		float		객체의 값을 float값으로 변환
		 * intValue()		int			객체의 값을 int값으로 변환
		 * longValue()		long		객체의 값을 long으로 변환
		 * shortValue()		short		객체의 값을 short으로 변환
		 * 
		 *  Wrapper클래스 객체에서 해당 메소드 사용은 형변환이 가능한
		 *  메소드만 가능합니다.
		 *  
		 *  
		 * */
		
		
		
		
		
		
		
	}

}
