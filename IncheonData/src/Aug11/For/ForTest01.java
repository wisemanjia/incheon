package Aug11.For;

public class ForTest01 {
	public static void main(String[] args) {
		//이제 정말 무시무시한 for문이 시작됩니다.
		//Data Scope : 데이터스코프
		// 간단하게 정의해드리면 선언된 변수가
		//어떤 범위(중요)까지 유지되는지를 말함
		//정말 중요합니다.
		//{}
		int a = 9;
		//변수는 선언된 후 사용가능
		//= 선언되기 전에는 사용 불가
		//= {}괄호 안에서만 값이 이동가능
		//{a{a}} Yes!
		//{{b}b} No!
		int show = 3;
		for (int i = 1; i < 10; i++) {
			//값이 0인 i가 10까지 반복하면서
			//문장을 실행
			//System.out.println(i + "번째 반복");
//			구구단 3단
//			3 * 1 = 3
//			3 * 2 = 6
			System.out.println(show + " * " + i + " = " + show * i);
		}
		
	}
}
