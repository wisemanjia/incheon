package Sep01;

public class ForTest {

	public static void main(String[] args) {
		int a = 1;
		int b = 8;
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		for (String string : args) {
			
		}
		
		if(a == b){
			System.out.println("같습니다.");
		}else{
			System.out.println("다릅니다.");
		}
		
		System.out.println((a == b ? "같습니다.":"다릅니다."));
		
		(조건식 ? 참 : 거짓)

	}

}
