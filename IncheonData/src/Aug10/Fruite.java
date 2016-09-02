package Aug10;
//나중에 클래스 명도 바꿀겁니다.
public class Fruite {

	public static void main(String[] args) {
		// 문제
		/*
		 * 여러분은 과수원을 경영하고 있습니다. 과일로는 사과, 오랜지, 포도를 심었습니다. 각 과일은 하루에 5개 7개 5개를
		 * 생산합니다. 그럼 하루에 과수원에서 생산되는 과일의 수를 출력하시고 하루 기준으로 시간당 몇개의 과일이 생산되는지 평균
		 * 개수를 출력해보세요. 1. 최대한 많은 변수를 활용해주세요. 2. 평균을 담아내는 변수는 반드시 float으로 3. 반드시
		 * 한 번의 캐스팅이 나와야 합니다. 리터럴 : int a = 10; <- 이게 리터럴
		 */
		int app = 5;
		int ora = 7;
		int gra = 5;
		int total;
		float result;
		String start = "하루동안 총 ";//이건 X
		String end = "개가 생산됩니다."; //이건 X
		total = app + ora + gra;
		System.out.println(start + total + end);
		
		//result = (float)total / (float) 24;
		result = (float)(total / 24.0);
		//여기서 오류잡으시면 됩니다.
		System.out.println(start + result + end);
		
		
		

	}

}
