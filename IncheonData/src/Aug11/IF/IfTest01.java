package Aug11.IF;

public class IfTest01 {

	public static void main(String[] args) {
		//if문 익숙해지기
		boolean t = true;
		boolean f = false;
		
		if (t == true && f == false) {//&&~이고, and
			System.out.println("t가 참입니다.");
		}
		
		if(t == true || f != false){//||~이거나, or
			//둘 중에 어느것이 참이면 보여지는 문장
			System.out.println("t나, f가 식에 맞을경우");
		}
		
		
		int a, b;
		a = 10;
		b = 13;
		if(a == 11 && b == 13){
			//a10,b13일 경우
			System.out.println("a11 and b13");
		}else if(a == 11 || b == 13){
			//둘중에 어느것 하나라도 참이면
			System.out.println("a11 or b13");
		}else{
			System.out.println("나머지경우");
		}
		
		
		
		
		
	}

}
