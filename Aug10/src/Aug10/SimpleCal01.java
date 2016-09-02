package Aug10;
import java.io.IOException;

//간단한 계산기 만들기
// 사용자가 입력한 두 수를 무조건 + 하기
public class SimpleCal01 {
	public static void main(String[] args) throws IOException {
		//사용자가 값을 입력하게 만들어줌.
		System.out.println("값을 입력하세요.");
		System.out.print("첫번 째 :_");
		int first = System.in.read() -48;
		System.in.read();System.in.read();//엔터처리
		//1이라고 치면 1, 엔터, 엔터
		//엔터는 (리턴) : \r + \n
		//엔터키도 입력되는 값으로 인지합니다.
		//따라서 입력은 2번 받게 되어 second에
		//입력되지 않게 되므로 엔터를 처리해줘야 합니다.
		//System.in.read();를 두번 써주면 엔터처리 완료
		System.out.print("두번 째 수 :_");
		int second = System.in.read()-48;
		System.in.read(); System.in.read();
		
		//연산자입력 = +
		System.out.println("+를 입력해주세요");
		char yun = (char) System.in.read();
		System.in.read();System.in.read();
		
		//계산 하기 +
		int result = first + second;
		
		//출력하기
		System.out.println("결과는");
		//1. 변수 없이 계산하기
		//System.out.println(first + second);
		
		//2. 변수로 계산하기 1 + 2 = 결과
		//숫자 + 숫자 = 숫자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		//문자 + 숫자 = 문자
		System.out.println(""+first + yun + second +
				" = " + result);
		
		/*p타입의 연산에서 주의할 점
		자바에서는 p타입 연산시 특징이 있습니다.
		(boolean제외)
		모든 타입은 연산자를 만나면 연산자 전에
		기본타입이하를 먼저 검사합니다.
		그래서 기본타입이하라면
		기본타입으로 변환시키고 계산, 
		기본타입으로 되돌려줍니다.
		
		만약 기본타입보다 큰 타입과 연산한다면
		가장 큰 타입 이하의 데이터를 가장 큰타입으로
		변환 후 계산, 결과를 돌려줍니다.
		
		프로모션(중요) : 각 타입이 계산 될 때 
		작은 타입이 큰 타입에 자동대입되는 형태
		
		캐스팅 : 큰타입의 데이터를 작은 타입으로 
		대입할 때
		주의 - 큰 타입이 캐스팅 될때 값의
		절삭이 발생합니다.
		 
		*/
	}

}
