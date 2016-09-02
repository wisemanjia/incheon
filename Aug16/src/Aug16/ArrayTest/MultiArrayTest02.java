package Aug16.ArrayTest;

import java.util.Scanner;

//학생성적관리
		//입력할 학생 수 : 10
		// java , jsp, android
		//출력
			/*		java	jsp		android
		1번학생 : 
		2번학생 : 
		3번학생 :
			*/
public class MultiArrayTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력");
		//[2]의 경우 한 행의 갯수 : 행이 2개 
		//[2][3]의 경우 앞은 열, 뒤는 행,
		//00 01 02
		//10 11 12
		int[][] multiArr01 = new int[sc.nextInt()][3]; 
		for (int i = 0; i < multiArr01.length; i++) {
			System.out.println(i+1+"번째 학생의 점수를 입력하세요.");
			System.out.print("java점수 입력 : ");
			multiArr01[i][0] = sc.nextInt();
			System.out.print("jsp점수 입력 : ");
			multiArr01[i][1] = sc.nextInt();
			System.out.print("android점수 입력 : ");
			multiArr01[i][2] = sc.nextInt();
		}
		System.out.println("java \t jsp \t android");
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				System.out.print(multiArr01[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
