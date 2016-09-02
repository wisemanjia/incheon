package Aug11.For;

import java.util.Scanner;

public class ForTest07 {
	public static void main(String[] args) {
		//사용자에게 두 수를 입력받을 것
		//두 수위 차이를 계산해서 누적 합을 출력
		Scanner sc = new Scanner(System.in);
		//첫 수를 입력하세요: 요청 : 스케너 사용
		System.out.print("첫 수를 입력 :");
		//변수를 만들어서 저장
		int fir = sc.nextInt();
		//두번째 수 입력하세요: 요청 : 스케너 사용
		System.out.print("두번째 수 입력 :");
		int sec = sc.nextInt();
		//for 시작은 첫번째 수, 끝은 두번째 수
		//정렬 임시변수를 만들어서 정렬시키기
		int temp;
		//항상 작은 값을 fir에 넣기 : 값 치환시키기
		if(fir > sec){
			temp = fir;
			fir = sec;
			sec = temp;
		}else if(){
			
		}
		
		int result = 0;
		for (int i = fir; i <= sec; i++) {
			//총합은 result로 저장하기
			result += i;
		}
		//출력 : 총 합은 ***입니다.
		System.out.printf("총 합은 %d 입니다.", result);
	}

}
