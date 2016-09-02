package Aug23.ExceptionTest;

import java.io.IOException;

//예외 : Exception
/*예외, 자바에서는 예외라는 것을 정의해 놓고 프로그램
구현시나 실행시에 발생 될 수 있는 문제를 예견할
수 있거나 없는 문제 등을 처리할 수 있도록 할 수 있습니다.
예외는 자바에서 객체로 표현됩니다. 

예외 발생순서
소스코드 => 컴파일(컴파일러는 알려진 예외가 있는지 검사,
만약 알려진 예외가 있음에도 처리(Handling)하지
않으면 컴퍼일러 에러 유발 => 실행 => 예외발생
 => VM의 해당 예외 내용을 파악 후 예외 객체를 실행해서
코드 밖으로 던짐(throw)	=> 프로그램 비정상 종료

만약, 위에서 예외 발생시 VM이 던진 예외를 프로그램상에서
잡아낸다면(catch), 이 프로그램은 정상적으로
계속 실행됨.

위와 같이 예외를 처리하는 것을
예외핸들링(Exception Handling), 예외처리라고 합니다.

try {
			//예외가 발생할 것 같은 문장
		} catch (Exception e) {
			//예외가 발생했을 경우 처리문장
		} finally {
			//예외가 발생하더라고 꼭 처리해야 할 문장
			//DB닫기, 파일닫기, 접속종료문구....
		}
		
*/
public class ExceptionTest01 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		System.out.println("첫 수 입력");

		try {
			a = System.in.read() - 48;
			System.in.read();System.in.read();
		} catch (IOException e) {
			System.out.println("입출력 문제가 발생");
			e.printStackTrace();
		}
		System.out.println("두번째 수");

		try {
			b = System.in.read() - 48;
			System.in.read();System.in.read();
		} catch (IOException e) {
			System.out.println("두번째 수 문제 발생");
			e.printStackTrace();
		}

		System.out.println(a + b);

	}
}
