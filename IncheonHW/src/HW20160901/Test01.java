package HW20160901;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("값 a를 입력하세요");
			a = sc.nextInt();
			System.out.println("값 b를 입력하세요");
			b = sc.nextInt();
			if (b < a) {
				int temp = a;
				a = b;
				b = temp;
			}
			for (int i = a; i <= b; i++) {

				System.out.print(i + " ");
			}System.out.println("");
		}
	}
}
