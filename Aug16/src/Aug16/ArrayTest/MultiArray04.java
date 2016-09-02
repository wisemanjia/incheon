package Aug16.ArrayTest;
public class MultiArray04 {
	public static void main(String[] args) {
		//톱니바퀴 배열 / 동적가변배열
		//배열을 처음 생성할 때 타입과 외측의 크기를
		//먼저 설정하고 내부측 배열은 동적으로
		//필요한 만큼 생성해서 사용하는 배열
		char[][] stars = new char[10][];
		//외측 배열의 모든 index를 돌면서 내측 생성
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i+1];
			//그 속을 *로 채움
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
				//출력
				System.out.print(stars[i][j]);
			}
			System.out.println("");
		}
	}

}
