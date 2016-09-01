package HW20160901;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값1 : ");
		int num1 = sc.nextInt();
		System.out.print("값2 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1  + " + " + num2 + " = " + (num1 + num2));
	}
}
