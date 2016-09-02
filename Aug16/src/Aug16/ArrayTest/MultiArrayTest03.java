package Aug16.ArrayTest;

import java.util.Scanner;

public class MultiArrayTest03 {
	public static void main(String[] args) {
		// 2차원 배열 활용 [사용자입력][6]
		/*
		 * 이름		java	jsp		android	합계	평균
		 * ================================================
		 * 김길동	100		100		100		300		100 
		 * 홍길동	50		50		50		150		50
		 * ...... 이렇게 해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력해주세요. \n입력 :");
		String[][] multiArray03 = new String[sc.nextInt()][6];
		String line = ":::::::::::::::::::::::::::::::::::::::::::";
		System.out.println(line);

		for (int i = 0; i < multiArray03.length; i++) {
			System.out.print((i + 1) + "번째 학생 이름 입력:");
			multiArray03[i][0] = sc.next();
			System.out.print(multiArray03[i][0] + "학생의 java점수 : ");
			multiArray03[i][1] = sc.next();
			System.out.print(multiArray03[i][0] + "학생의 jsp점수 : ");
			multiArray03[i][2] = sc.next();
			System.out.print(multiArray03[i][0] + "학생의 jsp점수 : ");
			multiArray03[i][3] = sc.next();
			//평균 : int형태로 계산해서 String타입으로 저장하기
			//Integer.parseInt(String)
			//Double.parseDouble(String)
			multiArray03[i][4] = String.valueOf((Integer.parseInt(multiArray03[i][1]) 
					+Integer.parseInt( multiArray03[i][2]) 
					+Integer.parseInt(multiArray03[i][3]))); 
			//총점 : 더블형태로 계산해서 string타입으로 저장하기
			//String.valueOf(int)
			multiArray03[i][5] = String.valueOf(((Double.parseDouble(multiArray03[i][1])
					+ Double.parseDouble(multiArray03[i][2])
					+ Double.parseDouble(multiArray03[i][3]))/3.0));
		}
		
		//print
		System.out.println(line);
		System.out.println("이름 \t java \t jsp \t android \t 합계 \t 평균");
		System.out.println("====================================================");
		for (int i = 0; i < multiArray03.length; i++) {
			for (int j = 0; j < multiArray03[i].length; j++) {
				System.out.print(multiArray03[i][j]+" \t ");
			}
			System.out.println("");
		}
	}
}
