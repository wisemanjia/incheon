package HW20160901;

public class DataType01 {
	public static void main(String[] args) {
		//char (캐릭터)
		//반복문
		//boolean
		
		//타입 변수명; // 변수명 = 값;
		//타입 변수명 = 값;
		int a; //선언만, int타입의 a변수를 만들겠습니다.
		a = 1;
		
		char c; //A, 가, a, 흫 String = 문자열
		c = '가'; //"가 아니라 '
		//String g="하하하";
		//Char d='하';
		char c1 = 'A';//
		char c2 = 98;//아스키코드
		char c3 = '\ub148';//유니코드
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		int num;
		num = c1;
		System.out.println(num);
		//제어문~ 0~127;
		for (int i = 48; i < 123; i++) {
			char cha = (char)i; //모든 pro, 오->왼
			// 0 : *** //숫자 + 문자열 + char
			System.out.println(i + " : " +cha);
		}
	}
}
