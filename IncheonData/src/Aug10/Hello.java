package Aug10;
//이것은 주석입니다. 한 줄 주석
//주석에 써 있는 내용은 컴파일 되면서 다 무시됩니다.

//이녀석은 클래스입니다.
public class Hello {
	//이녀석은 메소드(메인메소드) 입니다.
	public static void main(String[] args) {
			//이녀석은 명령문장입니다.
			// ""이 안에 있는 녀석은 문자열
			System.out.println("Hello");
			System.out.println("안녕하세요.");
			//화면에 출력할 때 사용하는 명령어
			//결과 : 문자형태의 2가 찍힙
			System.out.println("2");
			//결과 : 숫자형태의 2가 찍힘
			System.out.println(2);
			//자바에서는 데이터타입 변수명 = 값;
			//String문자열 또는 문자 데이터타입
			String str = "안녕하세요";
			//var str = "";
			//문자열 + 문자열 = 문자열
			System.out.println(str + str);
			System.out.print(str + "윤승현입니다.");
/*	블럭주석 만드는 방법 : ctrl + shift + (?)/		
 * 이제 블럭 주석을 처리합니다.
			블럭주석은 여러줄을
			주석으로 만들어줍니다.
			시작이 있으면 반드시 끝이 있어야 합니다.
*/			
			
			System.out.println("출력할 문자열");
			System.out.println("출력할 문자열");
						
			
			/*
			 * 프로그램에서 ;의 의미는?
			 * 프로그램에는 대략 3가지의 명령이 존재합니다.
			 * 선언, 대입, 초기화
			 * 이 외에 특정 명령을 실행하는 명령에 쓰입니다.
			 * 이러한 명령끝에는 반드시 하나의 명령이 끝났다는
			 * 의미로 ';'(세미콜론)을 반드시 사용해야 합니다.
			 * 단 예외가 있습니다. (같은 타입의 변수 연속 선언시)
			 * 
			*/
			
	}
}
