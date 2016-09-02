package Aug12.Random;

import java.util.Scanner;

public class RandomTest03 {
//up down game (컴퓨터가 마스터)
	public static void main(String[] args) {
		//컴퓨터가 두자리 숫자를 뽑아서 변수에 저장
		System.out.println("Up Down Game!");
		System.out.println("Input Number(1~99):");
		
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 89) + 10;
		int count = 0;
		boolean game = true;
		//System.out.println(com);
		//사용자가 두자리 숫자를 입력하면
		
		//무한돌려야 합니다.
		while (game) {
			System.out.print("Your Number:");
			int user = sc.nextInt();
			
			//비교는if
			if(user > com){
				System.out.print("Down! ");
				count++;
			}else if(user < com){
				System.out.print("Up! ");
				count++;
			}else{
				System.out.print("Bingo! ");
				count++;
				game = !game;
			}
			// 몇 번에 맞췄는지까지 
			System.out.println(count + "번 시도했습니다.");
		}
	}

}
