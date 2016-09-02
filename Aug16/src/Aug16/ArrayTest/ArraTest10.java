package Aug16.ArrayTest;
public class ArraTest10 {
	public static void main(String[] args) {
		//배열 : ????
		//배열에 넣어서 하나로 관리합시다.
		//같은 타입, 동일관리 , 주소호출
		//int타입의 칸이 10개인 arr01변수명
		//선언
		int[] arr01 = new int[10];//0~9
		// <-------------이 방향으로
		//정수타입의 칸 10개자리 arr01배열을 만듭니다.
		//초기값..........0
		int a = 10;
		System.out.println(a);
		System.out.println(arr01);//주소값호출
		System.out.println(arr01[0]);//[0]번지의 값
		System.out.println(arr01.length);//10:길이
		
		//길이 1 2 3 4 5 6 7 8 9 10 : 선언시 갯수
		//번지 0 1 2 3 4 5 6 7 8 9 : 길이-1
		//값 입력
		int b;
		b = 10;
		
		arr01[0] = 10;
		//0~9 모두 10을 넣어주세요.
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = i;
		}
		
		//출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번지값 : " +arr01[i]);
		}
		
		
	}
}
