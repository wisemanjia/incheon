package Aug17.ArrayTest;
public class ArrayTest01 {
	public static void main(String[] args) {
	//문제 배열3X3 multiArr01에
	//1~9 숫자를 랜덤하게 집어넣어주세요.
	//단, 매번 재실행시 변경되어야 합니다.
		//배열
		int[][] multiArr01 = new int[3][3];
		
		//생각의 변화가 필요합니다.
		//기존 방식으로 넣으면 무한반복됩니다.
		//다른 방법을 찾으셔야 합니다.
		//배열에 랜덤값을 넣는건 무한이라면... 어떤방법?
		//랜덤은 중복이 발생합니다.
		
	//출력은 이중 for문
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				System.out.print(multiArr01[i][j]+",");
			}
			System.out.println("");
		}
	/*
	1,2,3,
	4,5,6,
	7,8,9,
	*/	
	}
}
