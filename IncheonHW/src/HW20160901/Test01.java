package myproject;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//�� 1�� �Է��ϼ����ϰ� ����
		System.out.print("�� 1�� �Է��ϼ��� : ");
		//���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		//�� �����ϱ�
		int input = sc.nextInt();
		//�� 2�� �Է��ϼ��� ��� ����
		System.out.print("�� 2�� �Է��ϼ��� : ");
		//�� �Է¹ޱ�
		int input1 = sc.nextInt();
		//�� �����ϱ�
		//�� �ΰ� ���ϱ�
		int plus = input+input1;
		//�� ����ϱ�
		System.out.println("���Ѱ� �Է��ϼ��� : "+plus);
	}
}
