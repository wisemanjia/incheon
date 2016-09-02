package Aug18.SpellCheck;
import java.util.Scanner;

//사용자가 입력한 값을 35자까지 자르고 오버된 내용을 제거하고 보여줌
//그리고 오버한 내용을 보여줌
//재 입력받음
//재입력받기//반복하기
//Microsoft Corporation
//Corporate Headquarters One Microsoft Way Redmond, WA 98052-6399 UNITED STATES
public class SpellCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주소를 입력하세요 : ");
		String str = sc.nextLine();
		//System.out.println("주소 : " + str);
		System.out.println("길이는 : " + str.length());
		/*
		 * System.out.println(str.charAt(0)); System.out.println(str.charAt(1));
		 * System.out.println(str.charAt(2));
		 */
		char[][] strArray = new char[3][35];
		for (int i = 0; i < str.length(); i++) {
			if (i <= 34) {
				strArray[0][i] = str.charAt(i);
			}else if(i >= 35 && i <= 69){
				strArray[1][i-35] = str.charAt(i);
			}else{strArray[2][i-70] = str.charAt(i);}
		}
		for (char[] cs : strArray) {
			for (char c : cs) {System.out.print(c+"");}
			System.out.println("");
		}
	
	}
}


/*
Corporate Headquarters One Microsoft
Way Redmond, WA 98052-6399 UNITED ST
ATES
*/


