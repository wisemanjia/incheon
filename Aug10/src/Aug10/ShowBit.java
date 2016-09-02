package Aug10;
//비트로 변환해서 보여주기
public class ShowBit {
	public static void main(String[] args) {
		int a = -123456798;
		System.out.println(a);
		// 이건 010100010 같은 2비트
		System.out.println(a + "의 비트찍기 : " + Integer.toBinaryString(a));
		// 16진수로
		System.out.println(a + "16진수 : " + Integer.toHexString(a));
		// 8진수 = 옥타~~octa
		System.out.println(Integer.toOctalString(a));

		// 11111000101001000011001011100010의 길이
		System.out.println("11111000".length());

		String num = "11111000"; // 16번과 동일하나
		// 변수처리해서 보여드립니다.
		System.out.println(num.length());
		int i = 0;
		int j = 0;
		for (int j2 = 0; j2 < 10; j2++) {
			//j2이녀석은 
			//for에서만 불러올 수 있습니다.	
			j = j2;
			System.out.println(j2);
		}
		//j2불러올 수 없습니다.
		System.out.println(j); //10? 9?
	}
}
