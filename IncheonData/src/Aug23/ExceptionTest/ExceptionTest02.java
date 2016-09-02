package Aug23.ExceptionTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/*
예외처리
try를 활용하여 오류를 막고 다른 부분까지 실행되게
할 수 있다.

처리방법
1. 직접처리
	try{
		Exception이 발생할 만한 코드
	}catch (exception e){
		exception이 발생하면 실행할 코드
	} finally{
		예외 발생여부와 상관없이 공통적으로 실행할 코드
	}
	
2. 던지기(throw)
	메소드 뒷 부분에 throw 처리할 타입을 적어줌.
	메소드가 실행되다가 exception을 만나면 메소드를
	호출한 쪽으로 예외를 던짐
	main메소드는 VM으로 던짐
	
3. 직접 Exception을 만들어서 처리
	예외 객체를 만들어서 처리하기
	throw 객체명;
	
		@Override
		public void printStrackTrace(){
		System.out.print("계산불가");
		super.printStrackTrace();
		}

*/
public class ExceptionTest02 {
	public static void main(String[] args) {
		//배열의 오류
		
		try{
			int[] arr01= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr01[arr01.length]);
			//ArrayIndexOutOfBoundsException
			//0으로 나누기 오류
			System.out.println(10/0);
			
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열출력문 예외발생");
		}catch (ArithmeticException e){
			System.out.println("0으로 나누기 예외");
		}finally {
			System.out.println("여긴 finally~");
			System.out.println("0으로 나눠도 여긴 실행");
		}
		
		//파일 없음 오류
		Scanner sc = new Scanner(System.in);
		System.out.println("c:\\Setup.log라고 입력하세요");
		try {
			String ser = sc.next();
			FileReader fr = new FileReader(ser);
			System.out.println("파일 있음");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함.");
		}finally {
			sc.close();
		}

	}
}
/*
						Object
 						   |
 						Throwable
 						   |
 			|--------------------------|
 		Exception					Error
 			|						  |
 |----------------|			|------------------|
 IOE~~~			RuntimeE~~	각종 에러들		OutOfMemoryE
 
*/
