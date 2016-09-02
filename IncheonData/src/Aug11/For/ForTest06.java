package Aug11.For;
public class ForTest06 {
	//loop구문, 반복구문
	/*
	 * 프로그램에서는 필요에 따라서 특정 구문을
	 * 반복적으로 수행할 경우가 있습니다.
	 * 이때 반속되는 작업을 수행하는 구문을
	 * 반복구문 / 루프구문이라 합니다.
	 * 종류로는 for, while, do~while이라고 합니다.
	 * 정말 중요합니다. 완벽히 이해하시길 바랍니다.
	 * 
	 * for문법
	 * for(변수초기화식 ; 조건식 ; 변수증감식){
	 * 조건식이 참일경우 반복 수행될 구문
	 * }
	*/
	public static void main(String[] args) {
		//for 속에 for
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(
						i+" X "+ j +" = " + i*j );
			}
			System.out.println("");
		}
	}
}
