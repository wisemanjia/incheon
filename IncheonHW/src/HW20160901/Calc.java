package HW20160901;

import java.util.Scanner;

public class Calc {
	// 계산기
	// 박상훈
	public static void main(String[] args){
		new Calc().main2();
	}
	
	public void main2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산식을 입력하세요(1+2) : ");
		String func = sc.nextLine().replaceAll(" ", "");
		sc.close();
		// String[] funcList = func.split("");
		
		String oper = func.replaceAll("[0-9]", "");
		
		if(oper.length() == 0 || oper.replaceAll("[+-/*]", "").length() > 0){
			System.out.println("입력이 잘못됐습니다.");
			return;
		}
		String[] nums = func.split("\\" + oper);
		int num0 = Integer.parseInt(nums[0]);
		int num1 = Integer.parseInt(nums[1]);

		System.out.println("결과 : " + calcValue(num0, num1, oper));

	}
	
	public String calcValue(int num0, int num1, String oper){
		String result = "";
		
		if (oper.equals("+")) {
			result = Integer.toString(num0 + num1);
		} else if (oper.equals("-")) {
			result = Integer.toString(num0 - num1);
		} else if (oper.equals("/")) {
			result = Double.toString((double)num0 / num1);
		} else if (oper.equals("*")) {
			result = Integer.toString(num0 * num1);
		}
		
		return result;
	}
}
