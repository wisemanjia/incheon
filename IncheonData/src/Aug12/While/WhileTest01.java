package Aug12.While;

import java.io.IOException;

public class WhileTest01 {
	public static void main(String[] args) throws IOException {
		/*While?
		
		while(조건식){
			조건식이 참일때 실행할 문장
		}
		while은 보통 무한반복을 실행하다가 특정 조건이되면
		탈출하도록 합니다. 많이 활용됩니다.
		알아두시면 편합니다.
		채팅이나 게임 등의 무한 반복되는 로직에서 활용합니다.
		무한loop돌게 할 수 있습니다.
		*/
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("게임을 시작합니다.");
			System.out.println("게임 플레이 중");
			System.out.print("게임을 더 하시겠습니까?(Y/N)");
			
			char user = (char) System.in.read();
			
			System.in.read();System.in.read();
			
			if(user == 'n' || user == 'N'){
				System.out.println("게임을 종료합니다.");
				isQuit = !isQuit;
			}
		}
		
		
		
	}
}
