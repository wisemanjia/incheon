package Aug17.ArrayTest;

public class ArrayTeat03 {
	public static void main(String[] args) {

		int[][] multiarr01 = new int[3][3];

		for (int i = 1; i < 10; i++) {

			int a = (int) (Math.random() * 3);// 2
			int b = (int) (Math.random() * 3);// 2
			if (multiarr01[a][b] == 0) {
				multiarr01[a][b] = i;
				System.out.println("뽑힌 번지" + a + "," + b);
			} else {
				i--;
				System.out.println("중복발생 다시 뽑기");
			}
		}
		System.out.println("뽑기 완료. 출력 준비");
		for (int j = 0; j < multiarr01.length; j++) {
			for (int j2 = 0; j2 < multiarr01[j].length; j2++) {
				System.out.print(multiarr01[j][j2] + ", ");
			}
			System.out.println(" ");
		}
	}
}