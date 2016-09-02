package Aug18;
import java.util.Scanner;

public class Amho {
	// 시저의 암호
	// 사용자의 입력(영어)
	// a -> d
	// b -> e
//xyzabcdefghijklnmopqrstuvw
//abcdefghijklnmopqrstuvwxyz

	// 입력하세요.
	// 입력문장 출력 : a
	// 암호화 된 문장 출력 : d
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평문을 입력하세요.");
		String normal = sc.nextLine();
		System.out.println(normal);
		
		char[] encypt = normal.toCharArray();
		//String에 들어온 것을 하나하나 배열로 넘기기
		
		//String to char
		//char c = normal.charAt(0);
		//int to char
		//(char)(int type 변수);
		//System.out.println((char)(98+1));
		
		for (int i = 0; i < encypt.length; i++) {
			//a == 1 && b == 2 : and, a,b참 
			//a == 1 || b == 2 : or, a나 b중 하나라도 참
			if(encypt[i] > 88 && encypt[i] > 91 ||
				encypt[i] > 119 && encypt[i] > 112){
				//x = 120 X = 88
				System.out.print((char)(encypt[i] - 23));
			}else{
				System.out.print((char)(encypt[i] + 3));				
			}
		}
	}

}
