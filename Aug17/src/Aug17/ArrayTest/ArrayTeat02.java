package Aug17.ArrayTest;

public class ArrayTeat02 {
	public static void main(String[] args) {

		int[][] multiArr01 = new int[3][3];

		// 입력값
		for (int as = 1; as < 10; as++) {

			int a = (int) (Math.random() * 3) ;
			int b = (int) (Math.random() * 3) ;
			if (multiArr01[a][b] == 0) {
				multiArr01[a][b] = as;
			} else {
				as--;
			}
		}

		// 출력값
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {

				System.out.print(multiArr01[i][j] + ",");

			}

			System.out.println("");

		}
	}
}