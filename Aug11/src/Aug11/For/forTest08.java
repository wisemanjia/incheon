package Aug11.For;

public class forTest08 {
// 구구단을 찍는데.... 각 단의 5까지만
	public static void main(String[] args) {
		A:for (int i = 2; i < 10; i++) {
			B:for (int j = 1; j < 10; j++) {
				if(j > 5){
					break B;
				}
				System.out.println(i + " X " + j + " = " + i * j);
			}
	System.out.println("");
		}
	}
}
