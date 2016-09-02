package Aug11.IF;

import java.io.IOException;

public class IfTest02 {
	public static void main(String[] args) throws IOException {
		//사용자가 입력 : +,-,*,/ 연산자냐?
		//사용자가 입력한 글자가 연산자인지 구분?
		
		//화면에 입력해달라고 써 줘야겠죠
		System.out.println("연산자를 입력해주세요.");
		System.out.print("+,-,*,/만 입력하세요:_");
		//사용자가 입력한 값을 저장
		char yun = (char) System.in.read();
		System.in.read();System.in.read();
		
		//System.out.println(yun);
		
		if (yun == '+' || yun == '*' || yun == '/' || yun == '-') {
			 System.out.println("연산자가 맞습니다.");
		}else{
			System.out.println("연산자가 아닙니다.");
		}
		
	}
}
