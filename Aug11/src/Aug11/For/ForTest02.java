package Aug11.For;

public class ForTest02 {

	public static void main(String[] args) {
		// 1~10까지 더하세요. for문을 사용해서
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		int result = 0 ; 
		for (int i = 1; i <= 10; i++) {
			result += i;
			//result = result + i;
		}
		System.out.println(result);
	}

}
