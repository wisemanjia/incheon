package Aug29.CollectionTest;

import java.util.ArrayList;

//List : ����� �ٲ� �� �ִ� �迭
public class ListTest02 {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		String s1 = "�ȳ��ϼ���";
		String s2 = "����Ŀ�";
		String s3 = "��������ʹ�.";
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add("����");
		// .size(); ����
		// .add(); ������
		// .get(); �����
		/*
		 * for (String string : s) { System.out.print(string + ","); }
		 */
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println("---------------------------");

		System.out.println("print-------------------------");

		System.out.println(s.remove(0));
		// s.remove(0);//�ش� ������ �� ����
		// 0������ ������ ��.
		s.remove(s3);// ���������� �����ϱ� (��ü)
		s.remove("����");// X
		System.out.println("��� �� ���");
		for (String string : s) {
			System.out.print(string + ",");
		}
		System.out.println("---------------------------");
		System.out.println(s.get(0));

	}

}
