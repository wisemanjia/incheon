package Wrapper;
/*
Wrapper? AutoBoxing?
Java는 데이터를 클래스나 객체 외에 
(int, double, char 및 boolean과 같은) 기초 타입을 가진다.
따라서 Java에서는 기본형 타입과 객체 참조 같은 
두가지 타입의 관리 데이터를 가지게 된다. 
예를 들어 데이터를 저장할 때, 기본형 타입의 변수에 
저장할 수 있고, 다양한 객체들을 저장할 수 있는 컨테이너 역할을
 하는 객체를 생성할 수도 있다.
그러나 어떤 상황에서는 기본형 타입을 객체로 
사용해야 하는 경우가 있다. 이러한 경우에 기본형 타입 값을
 객체로 포장할 필요가 있다.
포장 클래스(wrapper class)는 특정 기본형 타입을 나타낸다.
 예를 들어 Integer 클래스는 간단한 정수 값을 나타낸다.
Integer 클래스로부터 생성된 객체는 하나의 int 값을
 저장할 수 있다. Wrapper class의 구성자는 저장할 
 기본형 타입 값을 받는다.
Integer age = new Integer(30);
Double avg = new  Double("3.145");
Integer 선언으로 객체가 선언되면 age 객체는 정수 30을
 객체로 나타내며 기본형 타입이 아닌 객체가 필요한 곳에
  사용될 수 있다.
Java의 각 기초 타입에 대해 Java 클래스 라이브러리 내에
 상응되는 wrapper class가 존재한다. 
 모든 wrapper class는 java.lang 패키지에 정의된다.
* Java 클래스 라이브러리의 wrapper class

기본형 타입	wrapper class 
byte  			Byte 
short 			Short 
int 			Integer 
long 			Long 
float 			Float 
double 			Double 
char 			Charater 
boolean 		Boolean 
void 			Void 

void 타입을 나타내는 wrapper class 도 존재하는 것을 볼 수 있다.
그러나 다른 wrapper class와 달리 void 클래스는 
실체화될 수 없으며 단지 공 참조 개념을 나타낸다.


* Boxing 과 UnBoxing

Wrapper 클래스는 산술연산을 위해 정의된 클래스가 아니기 때문에,
 이 클래스의 인스턴스에 저장된 값은 변경이 불가능하며, 
 값을 저장하는 새로운 객체의 생성 및 참조만 가능하다.

- Boxing : 기본 자료형을 Wrapper 클래스의 객체로 변경하는 과정
ex) Integer age = new Integer(30);
- Unboxing : 각각의 객체를 기본 자료형으로 변경/사용하는 과정
ex) int age2 = age.intValue();


* AutoBoxing, AutoUnBoxing
JDK 1.5 버전 이후에는 자동으로 Boxing과 UnBoxing을
 처리하도록 AutoBoxing 과 AutoUnBoxing을 제공

- AutoBoxing
Integer obj = 61;
숫자 61을 Integer 객체에 넣기 위해서는
(Boxing) new Integer(61) 과 같이 객체를 생성해야 하지만, 
위와 같이 대입하면 AutoBoxing이 자동으로 진행된다.

- AutoUnBoxing
Integer obj2 = new Integer(69);
int num1 = obj2;

Integer 객체에 있는 int 값을 가져오기 위해서는(UnBoxing)
obj2.intValue() 메소드를 사용하여 가져와야 하지만, 
위와 같이 int 형 변수에 Integer 객체를 대입하면 
자동으로 UnBoxing이 진행된다.


AutoBoxing과 AutoUnBoxing 은 단지 기본형 타입과 상응하는 
Wrapper class에만 일어난다. 다른 경우에 대입을 시도하면 
컴파일 에러가 발생한다.
- Integer는 intValue(), Double은 doubleValue() 등만 
AutoBoxing과 AutoUnBoxing이 발생한다.

ex> Double obj = 3.14;
      int num1 = obj.intValue() ;   (O)
 int num1 = obj;                   (X)


* Wrapper 클래스의 기본 메소드들

메소드			반환값 		설명 
booleanValue()	boolean		기본형 데이터를 문자열로 
							바꾼 뒤에 반환 
byteValue()		byte		객체의 값을 byte 값으로 변환 
doubleValue()	double		객체의 값을 double 값으로 변환 
floatValue() 	float		객체의 값을 float 값으로 변환 
intValue()		int			객체의 값을 int 값으로 변환 
longValue() 	long		객체의 값을 long 값으로 변환 
shortValue()	short		객체의 값을 short 값으로 변환 

Wrapper class 객체에서 해당 메소드를 사용은 형변환이
가능한 메소드만 사용이 가능하다.
 */
public class Wrapper01 {

	public static void main(String[] args) {

	}

}
