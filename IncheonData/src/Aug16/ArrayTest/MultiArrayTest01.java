package Aug16.ArrayTest;

public class MultiArrayTest01 {
	public static void main(String[] args) {
		//2차원 배열
		//1차원 int, arr01, 길이(칸)는 10개;
		int[] arr01 = new int[10];
		//2차원 배열 선언(생성식)
		int[][] arr02 = new int[2][3]; //2x3
		int[] arr03 = {1,1,2};
		//2차원 배열 초기화식(값 넣기)
		int[][] multiArr02 = {{1,2,3},{4,5,6}}; //2X3
		int[][] multiArr03 = new int[2][3];
		multiArr03[0][0] = 0;
		//multiArr03의 구조
		//		1		2		3
		//1 [0][0]	[0][1]	[0][2]
		//2 [1][0]	[1][1] 	[1][2]
		System.out.println(multiArr03[0][0]);
		
		for (int i = 0; i < multiArr03.length; i++) {
			for (int j = 0; j < multiArr03[i].length; j++) {
				System.out.println(i+"X"+j+":"+multiArr03[i][j]);
			}
		}
		
		
		
	}
}
