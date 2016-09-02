//패키지는 항상 첫 줄에 씁니다.
//하나의 패키지 안에 있는 클래스들은
//서로 불러올 수 있다.(사용할 수 있다)
//패키지는 오로지 한 개만 씁니다.
package Aug11.yunsanja;

import java.util.Random;
import java.util.Scanner;
//임포트는 패키지 다음 줄에 씁니다.
//여러개 쓸 수 있습니다.
//패키지와 임포트는 클래스 밖에 써야 합니다.
//임포트는 다른 패키지의 함수(명령)을 가져와서
//실행시키기 위해서 넣어줍니다(지금은 이렇게만...)

public class Yonsanja01 {
	public static void main(String[] args) {
		//연산자
		/*
		지금 보여드릴 연산자는 자바 뿐만 아니라
		모든 언어에서 거의 유사하게 작동합니다.
		잘 알아두시기 바랍니다.
		주의할 점은 연산자의 기능/순서입니다.
		1. 최우선 연산자
			.  클래스 / 객체 소유의 변수,
				메서드 등을 호출하는 연산자(!기억!)
			()  산수시간에 나온녀석
			[]  배열(배열 is 객체)
			
		2. 단항 연산자
			!(논리부정, not)
			~(비트반전)
			+/-(연산)
			++/--(선행증감)
			(cast) 캐스팅 연산자
			
		3. 산술연산자
			+, -, *, / %(모듈러:나눈 후 나머지 값)
			
		4. 쉬프트 연산자
			<<, >>, >>>
		
		5. 관계 연산자
			>, <, >=, <=, ==, !=
			
		6. 비트 연산자
			&, |, ^
		
		7. 논리 연산자
			&&(AND), ||(OR), &, |
		
		8. 삼항 연산자
			조건식 ? 참일때 명령 : 거짓일때 명령 
		
		9. 배정 대입연산자
			=, +=, -=, .....
		
		10. 후행증감 연산자
			++ / --
		*/
		int a = 1;
		int b = ++a; //a값을 증가해서 b에 넣어라
		int c = a++; //a값을 c에 넣고 후에 a를 증가
		System.out.println("a : " + a);
		//System.out.println("b : " + b); //a = 1; b = ?;
		System.out.println("c : " + c); //a = 1; c=?
		
		int aa = 1;
		int bb = ++aa; //먼저 빼고 값 대입
		int cc = aa++; //aa를 cc에 넣고 후에 빼기
		System.out.println(bb);
		System.out.println(aa);
		System.out.println(cc);
		
		//%모듈러 연산자
		//나눈 후 나머지 값을 반환
		//특징 : 나누는 값이 더 클 경우, 작은 수 리턴
		//int a = 1; 이미 위에서 선언해서 에러가 남.
		a = 31; //대입 : 1을 a변수에 넣어라
		b = 2; 
		c = a % 2; //몫은 1, 나머지는 0
		//몫은 버립니다.
		System.out.println(c);
		
		//남자와 여자 구분하기
		//1남자 2여자, 주민등록번호 뒤 첫 숫자
		int code = 5;
		int result = code % 2; //1 , 0
		
		if(result == 0){
			//만약, result값이 0이라면
			System.out.println("여자이십니다.");
		}else{
			//만약 result값이 0이 아니라면
			System.out.println("남자이십니다.");
		}		
		//쉬프트 연산자
		int sw1 = 10;
		int sw2 = sw1 << 2; //2자리수를 삭제해라
		System.out.println(sw2);
		
		//논리연산자 boolean
		boolean tt = true;
		boolean ff = false;
		ff = tt;
		if(ff == true){
			System.out.println("ff는 참");
		}else{
			System.out.println("ff는 거짓");
		}
		
		//관리자 구분
		boolean admin = true;
		
		if(admin == false){
			System.out.println("관리자이십니다.");
		}
		//참일 때만 출력하고 거짓이면 출력X
		
		
		//비트반전 : -1 = 1
		int ch = -2;
		ch = ~ch;
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(~ch));
		System.out.println(Integer.toBinaryString(ch));
		
		
		
		//ㅁ문제ㅁ
		//4 + 5 > 2 - 1 * 7 && (12 & 3 * 2) > 7 || -1 != 2
		System.out.println(4 + 5 > 2 - 1 * 7 && (12 & 3 * 2) > 7 || -1 != 2);
	}

}
