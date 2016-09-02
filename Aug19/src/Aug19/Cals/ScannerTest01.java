package Aug19.Cals;

import java.util.Scanner;

public class ScannerTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner("가 나 다 라\n마바\n");
		//while (sc.hasNext()) {
			//객체.hasNext() : 반환값이 있으면 참, 없으면 거짓
		//	String str = sc.next();
			//System.out.println(str);
	//next() : 첫 단어 앞 공백, 개행문자 모두 무시
			//단어의 뒤 개행문자 그래도 둠
		//}
		String str1;
		while (sc.hasNext()) {
			str1 = sc.nextLine();
			System.out.println(str1);
		//nextline() : 개행문자까지 한 줄로 인식 
			//공백도 처리해줌
			//
		}
	}
}
