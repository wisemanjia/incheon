package Aug12.Random;

public class RandomTest05 {
	// 로또번호 생성기
	public static void main(String[] args) {
		// 1~45숫자 6개 생성 = 랜덤 활용
		// 단, 중복 없이 생성 = if문 비교
		// 정렬해서 화면에 보여주기 =
		int num1, num2, num3, num4, num5, num6;
		System.out.println("\t Start:::::::::::::");
		num1 = (int) (Math.random() * 45) + 1;
		num2 = (int) (Math.random() * 45) + 1;
		num3 = (int) (Math.random() * 45) + 1;
		num4 = (int) (Math.random() * 45) + 1;
		num5 = (int) (Math.random() * 45) + 1;
		num6 = (int) (Math.random() * 45) + 1;

		// 중복체크
		boolean check = true;
		while (check) {
			if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6) {
				num1 = (int) (Math.random() * 45) + 1;
				num2 = (int) (Math.random() * 45) + 1;
				num3 = (int) (Math.random() * 45) + 1;
				num4 = (int) (Math.random() * 45) + 1;
				num5 = (int) (Math.random() * 45) + 1;
				num6 = (int) (Math.random() * 45) + 1;
			} else if (num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6) {
				num2 = (int) (Math.random() * 45) + 1;
				num3 = (int) (Math.random() * 45) + 1;
				num4 = (int) (Math.random() * 45) + 1;
				num5 = (int) (Math.random() * 45) + 1;
				num6 = (int) (Math.random() * 45) + 1;
			} else if (num3 == num4 || num3 == num5 || num3 == num6) {
				num3 = (int) (Math.random() * 45) + 1;
				num4 = (int) (Math.random() * 45) + 1;
				num5 = (int) (Math.random() * 45) + 1;
				num6 = (int) (Math.random() * 45) + 1;
			} else if (num4 == num5 || num4 == num6) {
				num5 = (int) (Math.random() * 45) + 1;
				num6 = (int) (Math.random() * 45) + 1;
			} else if (num5 == num6) {
				num6 = (int) (Math.random() * 45) + 1;
			} else {
				check = !check;
			}
		} // 중복체크 while
		System.out.println("중복채크 완료");

		// 이제 정렬
		boolean sort = true;
		while (sort) {
			if (num1 < num2) {
				int temp = 0;
				temp = num1;
				num1 = num2;
				num2 = temp;
			}else if (num2 < num3) {
				int temp = 0;
				temp = num2;
				num2 = num3;
				num3 = temp;
			}else if (num3 < num4) {
				int temp = 0;
				temp = num3;
				num3 = num4;
				num4 = temp;
			}else if (num4 < num5) {
				int temp = 0;
				temp = num4;
				num4 = num5;
				num5 = temp;
			}else if (num5 < num6) {
				int temp = 0;
				temp = num5;
				num5 = num6;
				num6 = temp;
			}else if (num1 > num2 
					&& num2 > num3 
					&& num3 > num4 
					&& num4 > num5 
					&& num5 > num6
					) {
				sort = !sort;
			}else{				
				System.out.println("정렬완료.");
			}
			System.out.println("순환 중.");
		} // sort끝
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
	}
}
