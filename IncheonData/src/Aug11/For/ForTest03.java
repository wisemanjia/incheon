package Aug11.For;

public class ForTest03 {

	public static void main(String[] args) {
		// 1~10까지 더하세요. for문을 사용해서
		//단! 짝수만 더한다면
		System.out.println(2+4+6+8+10);
		int result = 0 ; 
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0){
				result += i;
			}else{
				
			}
			//result = result + i;
		}
		System.out.println(result);
	}

}
