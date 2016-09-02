package Aug19;
import java.util.Scanner;

//3x3배열로 사용자와 컴퓨터가 서로 번갈아가면서 돌을 둠
//먼저 3개를 한 줄로 놓으면 승리
//더이상 둘 공간이 없으면 재시작

public class Othello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean changeStone = true;
		ViewBoard vb = new ViewBoard();
		char[][] game = {
				{ '　', '　', '　' },
				{ '　', '　', '　' },
				{ '　', '　', '　' }
				};
		System.out.println("사용자 먼저");
		while (true) {			
			vb.VBoard(game);//print
			System.out.print("어디다가?:[1,1]");
			String point = sc.next();
			a =  point.charAt(0)-49;
			b =  point.charAt(2)-49;
			//System.out.println(a +""+b);
			
			sc.
			if (!changeStone) {
				int c = (int) (Math.random()*3);
				int d = (int) (Math.random()*3);
			}
			
			sc.close();
		}
	}

}

class ViewBoard {
	char[][] game;
	boolean changeStone = false;
	
	public boolean stoneCheck(String name, int a, int b) {
		if (name.equals("human")) {
			if (game[a][b] == '●' || game[a][b] == '○') {
				System.out.println("이미 놓였습니다.");
				changeStone = false;
			} else {
				game[a][b] = '●';
				changeStone = true;
			}
		} else {
			if (game[a][b] == '●' || game[a][b] == '○') {
				System.out.println("이미 놓였습니다.");
				changeStone = false;
			} else {
				game[a][b] = '○';
				changeStone = true;
			}
		}
		return changeStone;
	}
	
	public void VBoard(char[][] game){
	System.out.println("　　┌─┬─┬─┐");
	System.out.println("　　│ 1│ 2│ 3│");
	System.out.println("┌─┼─┼─┼─┤");
	for (int i = 0; i < game.length; i++) {
		System.out.print("│ "+(i+1)+"│");
		for (int j = 0; j < game[i].length; j++) {
			System.out.print(game[i][j]+"│");
		}
		System.out.println("\n├─┼─┼─┼─┤");
	}
	System.out.println("");
	}
}
