package Aug17.ArrayTest;

public class ArrayTest06 {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, num6, num7, num8, num9;
		System.out.println("\t Start:::::::::::::");
		num1 = (int) (Math.random() * 9) + 1;
		num2 = (int) (Math.random() * 9) + 1;
		num3 = (int) (Math.random() * 9) + 1;
		num4 = (int) (Math.random() * 9) + 1;
		num5 = (int) (Math.random() * 9) + 1;
		num6 = (int) (Math.random() * 9) + 1;
		num7 = (int) (Math.random() * 9) + 1;
		num8 = (int) (Math.random() * 9) + 1;
		num9 = (int) (Math.random() * 9) + 1;

		boolean check = true;
		while (check) {
			if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num1 == num7
					|| num1 == num8 || num1 == num9) {
				num1 = (int) (Math.random() * 9) + 1;
				num2 = (int) (Math.random() * 9) + 1;
				num3 = (int) (Math.random() * 9) + 1;
				num4 = (int) (Math.random() * 9) + 1;
				num5 = (int) (Math.random() * 9) + 1;
				num6 = (int) (Math.random() * 9) + 1;
				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;

			} else if (num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6 || num2 == num7 || num2 == num8
					|| num2 == num9) {
				num2 = (int) (Math.random() * 9) + 1;
				num3 = (int) (Math.random() * 9) + 1;
				num4 = (int) (Math.random() * 9) + 1;
				num5 = (int) (Math.random() * 9) + 1;
				num6 = (int) (Math.random() * 9) + 1;
				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else if (num3 == num4 || num3 == num5 || num3 == num6 || num3 == num7 || num3 == num8 || num3 == num9) {
				num3 = (int) (Math.random() * 9) + 1;
				num4 = (int) (Math.random() * 9) + 1;
				num5 = (int) (Math.random() * 9) + 1;
				num6 = (int) (Math.random() * 9) + 1;
				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else if (num4 == num5 || num4 == num6 || num4 == num7 || num4 == num8 || num4 == num9) {
				num4 = (int) (Math.random() * 9) + 1;
				num5 = (int) (Math.random() * 9) + 1;
				num6 = (int) (Math.random() * 9) + 1;
				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else if (num5 == num6 || num5 == num7 || num5 == num8 || num5 == num9) {
				num5 = (int) (Math.random() * 9) + 1;
				num6 = (int) (Math.random() * 9) + 1;
				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else if (num6 == num7 || num6 == num8 || num6 == num9) {

				num6 = (int) (Math.random() * 9) + 1;
				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else if (num7 == num8 || num7 == num9) {

				num7 = (int) (Math.random() * 9) + 1;
				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else if (num8 == num9) {

				num8 = (int) (Math.random() * 9) + 1;
				num9 = (int) (Math.random() * 9) + 1;
			} else {
				check = !check;
			}
			System.out.println("중복발생 ");

		} // 중복체크 while
		int[][] multiArry01 = new int[3][3];
		multiArry01[0][0] = num1;
		multiArry01[0][1] = num2;
		multiArry01[0][2] = num3;
		multiArry01[1][0] = num4;
		multiArry01[1][1] = num5;
		multiArry01[1][2] = num6;
		multiArry01[2][0] = num7;
		multiArry01[2][1] = num8;
		multiArry01[2][2] = num9;

		for (int i = 0; i < multiArry01.length; i++) {
			for (int j = 0; j < multiArry01[i].length; j++) {
				System.out.print(multiArry01[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
}
