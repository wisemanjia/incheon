package Aug12.Random;
import java.util.Scanner;
public class RandomTest02 {
	public static void main(String[] args) {
		// 사용자의 가위바위보를 입력받아 int처리
		System.out.println("가위바위보 게임입니다.");
		boolean isQuit = true;
		int win = 0; //승리 카운트
		int lose = 0; // 패 카운트 / 비겼을 때 // 예외 숫자 들어오
		//확률까지 구하기
		
		while (isQuit) {
			// 랜덤을 이용해서 컴퓨터 가위바위보를 int처리
			int com = (int) ((Math.random() * 3) + 1);
			System.out.print(com);
			
			System.out.println("1.가위   2.바위   3.보    4.종료");
			System.out.print("원하는 숫자를 눌러주세요:");

			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			
			//종료검사 : 4를 눌렀을때 종료하기
			if(user == 4){
				isQuit = !isQuit;
			}
			// 둘을 비교
			// 결과문 출력 "당신이 이겼습니다./컴퓨터가~ / 비겼"
			if (user == com) {
				System.out.println("비겼습니다.");
				System.out.printf("%d승 %d패", win, lose);
				
			} else if (user - com == -1 || user - com == 2) {
				System.out.println("컴퓨터가 이겨습니다.");
				lose++;
				System.out.printf("%d승 %d패", win, lose);
				
			} else if(user == 4) {
				//
			}else{
				System.out.println("당신이 이겼습니다.");
				win++;
				System.out.printf("%d승 %d패", win, lose);
			}	
			System.out.println("");
			
		}
		System.out.println("게임을 종료합니다. \n 안녕히 가세요.");

	}

}
