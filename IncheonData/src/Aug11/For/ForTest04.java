package Aug11.For;

public class ForTest04 {
	public static void main(String[] args) {
		//재미있는 369게임 만들기
		//단, 컴퓨터가 혼자 하는 369게임
		//1,2,박수,4,5,박수,7,8,박수,
		//1~100까지 합니다.
		
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println("박수, ");
			}else{
				System.out.println(i + ", ");
			}
		}
	}
}
