package Aug12.Array;


public class ArrayTest02 {
	public static void main(String[] args) {
		//그럼요. 저기 메인 메소드 옆에 있는
		//args도 불러 올 수 이나요?
		
		//배열의 값 초기화 생성식
		int[] arr01 = new int[100]; //(이걸로 해주세요.)
		int arr11[] = new int[100]; //(되긴 합니다.만..)
		
		int[] arr02 = {1,2,3,4,5,6,7,8};
		for (int i = 0; i < arr02.length; i++) {			
			System.out.println(i);
		}
		
		int[] arr03 = new int[]{4,5,6,7,8,9};
		int[] arr04 = new int[6];
		
		//arr03의 값을 arr04에 넣어주세요.
		arr04[0] = arr03[0];
		
		
		//향상for문
		for (int i : arr04) {
			System.out.print(i+",");
		}
	}
}
