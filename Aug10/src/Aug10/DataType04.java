package Aug10;
import java.io.IOException;

//이번에 할 것은 사용자가 입력한 값을 저장하고
//그것을 출력하도록 하기.
public class DataType04 {
	public static void main(String[] args) throws IOException {
		//1. 변수 만들기
		int num;
		
		//2. 사용자 입력받기
		System.out.print("숫자 하나만 입력 :_");
		num = System.in.read(); //키보드로 입력된
		//예외처리/ 만약 입력이 없다면 에러 도출
		
		//3. 출력하기
		System.out.println(num - 48);
		
		//정리
		/*문자 데이터 타입 : char : 문자 하나를 표현
		 * 반드시 값으로는 문자 하나만 존재해야하며
		 * 하나이상일 경우에는 String타입으로 선언해야 함.
		 * char타입은 정수형 타입입니다. 0~
		 * 크기는 0~ 56535까지입니다.
		 * 문자값을 표현할 때는 반드시 '로 감싸야 합니다.
		 * 정수이기 때문에 int로 프로모션됩니다.
		 * 반대로 int또한 문자로 바뀔 수 있습니다.(casting)
		 * 문제: char 타입의 y '1'과. String 타입 z "1"을
		 * System.out.print(y + z);한다면 결과는?
		*/
	}

}
