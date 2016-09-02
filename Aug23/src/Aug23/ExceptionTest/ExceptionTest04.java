package Aug23.ExceptionTest;

import java.io.BufferedReader;
import java.io.FileReader;
//ctrl + shift + 영문자 o : 필요한 import만 남깁니다.


//이렇게 치면 안 된다.
//예외처리할 수 있다.
public class ExceptionTest04 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("none"));
			br.readLine();
			br.close();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("파일이 없습니다.");
		}
//========================================다른 예외
		int ar;
		try{
		ar = 5 / 0;
		}catch (ArithmeticException e){
			System.out.println("0으로 나누지마.");
			ar = -1;
		}
		System.out.println(ar);
//==========================================
//트렌젝션 : 묶음. 여러 명령어들을 하나로 묶어서 처리
//5개의 명령어가 들어있는 트렌젝션이 있습니다.
//여기서 4개가 성공하고 1개가 오류 이 경우 : 오류!
/*
상품발송(){
	try{
		포장();
		영수증발행();
		발송();
	{catch (예외) {
		모두취소();
	}
}

포장() throws 예외{.ar..ar..}

영수증발행() throws 예외{.getClass().getName()...}

발송() throws 예외{.getClass().getName().}
*/
		
		
		
	}
}
