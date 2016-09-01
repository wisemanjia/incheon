package HW20160901;

import java.util.Scanner;

public class Test01 {

	static int ppumppai(int p1, int p2, String p3) {
		if (p3.equals("4") || p3.equals("/")) {
			return p1 / p2;
		} else if (p3.equals("1") || p3.equals("+")) {
			return p1 + p2;
		} else if (p3.equals("2") || p3.equals("-")) {
			return p1 - p2;
		} else if (p3.equals("3") || p3.equals("*")) {
			return p1 * p2;
		}

		return 0;
	}

	public static void main(String[] args) {
		int a, b, c, temp;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("값 a를 입력하세요");
			a = sc.nextInt();
			System.out.println("값 b를 입력하세요");
			b = sc.nextInt();
			System.out.println("연산자 1:+, 2:-, 3:*, 4:/");
			String d = sc.next();
			d = d.replace("1", "+").replace("2", "-").replace("3", "*").replace("4", "/");
			System.out.println("a" + d + "b = " + ppumppai(a, b, d));
		}
	}
}