package Aug22;
import java.util.Scanner;
//오셀로 오델로
//3x3배열로 사용자와 컴퓨터가 서로 번갈아가면서 돌을 둠
//먼저 3개를 한 줄로 놓으면 승리
//더이상 둘 공간이 없으면 재시작

//게임계산 : 누가 이겼는지 아직 구현 못 함.
//컴퓨터가 두는 것.... 아직 구현 못 함.
//이기면 멈추는 것.... 아직 구현 못 함.

public class Othello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String point;

		Board board = new Board();
		Play play = new Play();
		
		
		System.out.println("사용자 먼저");
		while (play.isCheckGame()) {
			board.board();// print
			System.out.print("어디다가?:[1,1]");
			point = sc.next();
			//System.out.println((int)point.charAt(0)+""+(int)point.charAt(2));
/*			if (point.charAt(0) - 49 < 0 || point.charAt(0) - 49 < 4 && point.charAt(2) - 49 < 0
					|| point.charAt(2) - 49 < 4) {
				a = point.charAt(0) - 49;
				b = point.charAt(2) - 49;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				continue;
			}*/
			a = (int)(point.charAt(0) - 49);
			b = (int)(point.charAt(2) - 49);
			System.out.println(a+""+b);
			
				play.input("human", a, b);
			
				// System.out.println(a +""+b);

		}
		sc.close();
	}

}

class Play extends Board {
	private boolean changeHuman = true;
	private boolean changeComputer = true;
	private boolean checkGame = true;
	
	public boolean isChangeHuman() {
		return changeHuman;
	}

	public boolean isChangeComputer() {
		return changeComputer;
	}

	public boolean isCheckGame() {
		return checkGame;
	}

	public boolean checkNum(int a, int b){
		if(a > -1 && a < 3 && b > -1 && b < 3){
			return true;
		}else{
		System.out.println("입력범위를 넘어갔습니다.");
		return false;
		}
	}
	
	public void input(String name, int a, int b) {
		if (name.equals("human")) {
			if (Board.game[a][b] == '●' || Board.game[a][b] == '○') {
				System.out.println("이미 놓였습니다.");
				changeHuman = false;
			} else {
				Board.game[a][b] = '●';
			}
		} else {
			if (Board.game[a][b] == '●' || Board.game[a][b] == '○') {
				System.out.println("이미 놓였습니다.");
				changeHuman = false;
			} else {
				Board.game[a][b] = '○';
			}
		}
	}

	public void cheackGame() {
		checkGame = !checkGame; 
	}

	public void endGame() {
	}
}

class Board {
	static char[][] game = { { '　', '　', '　' }, { '　', '　', '　' }, { '　', '　', '　' } };

	public void board() {
		clearScreen();
		System.out.println("");
		System.out.println("　　┌─┬─┬─┐");
		System.out.println("　　│ 1│ 2│ 3│");
		System.out.println("┌─┼─┼─┼─┤");
		for (int i = 0; i < game.length; i++) {
			System.out.print("│ " + (i + 1) + "│");
			for (int j = 0; j < game[i].length; j++) {
				System.out.print(game[i][j] + "│");
			}
			if(i < 2){
				System.out.println("\n├─┼─┼─┼─┤");
			}else{
				System.out.println("\n└─┴─┴─┴─┘");
			}
		}
		System.out.println("");
	}
	public void clearScreen(){
		int x, y;
		for(y=0;y<25;y++) {
		for(x=0;x<80;x++) System.out.print(" ");
		System.out.println("");
		}
	}
}
/*class ClearScreen {

    static {System.loadLibrary("Clear");}
    
    public native static void clearScreen();

    public static void main(String[] args) {
        clearScreen();
    }
    
}*/
