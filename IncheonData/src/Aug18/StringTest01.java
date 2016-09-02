package Aug18;
//스트링 버퍼String Buffer
// 문자열을 추가하거나 변경할 때 주로 사용되는 자료형
public class StringTest01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("가나다 ");
		sb.append(" 라마바사아");
		sb.append("하갸갸겨겨 ");
		sb.append(" 자차카타파하");
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.append("더? ");
		sb.append(" 123456");
		System.out.println(sb.toString());
		//String Buffer는 append라는 메소드를 통해
		//계속 이어나갈 수 있다.
		
		String ss = "가나다"; //추천
		String s1 = new String("가나다");
		//"가나다라마법사"
		ss += "라마법사";
		
		
		sb.insert(0, "insert");//해당 주소부터 입력
		//substring
		System.out.println(sb.substring(0,3));
		
		System.out.println(sb.toString());
		//잘라서 보여주기 (시작위치, 끝위치)
		
		System.out.println(ss);
		System.out.println(ss.substring(4,7));
		
		
	}
}
