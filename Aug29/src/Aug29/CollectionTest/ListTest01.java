package Aug29.CollectionTest;

import java.util.ArrayList;

/*
Collection > List (ArrayList) : �ߺ�, ����

Ŭ���� ����ο� <E>, <T>, <K, V>�� �پ� �ִ� ���� �ֽ��ϴ�.
�̷� �������̽�, �߻�Ŭ����, Ŭ������ ���׸��̶�� �մϴ�.
���׸��� java 1.5���� ���Խ��ϴ�.
<E>�� Element, <T>�� Type, <K,V>�� Key and Value�Դϴ�.
�� ��ȣ�� ����Ͽ� �������� ���� ������ Ÿ���� ���� �� �ֽ�
�ϴ�.
������ ������ Ÿ���� ���׸����� ���� ��ü�� ������ �� ����
�˴ϴ�.
*/
public class ListTest01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("ȫ�浿"); //ArrayList������.add();
		//���� ���� X
		al.add(123);
		al.add("������");
		//ArrayList������.get(�ּ�);
		//System.out.println(al.get(0));
		
		String name = (String) al.get(0);//����ȯ�� �ʿ��մϴ�.
		//���� �߿��մϴ�. ���� ã���ּ���.
		System.out.println(name);
		
		int num = (int) al.get(1);
		System.out.println(num);
		
		for (Object name1 : al) {
			System.out.println(name1+",");
		}
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("ȫ����");
		al2.add("ȫ����");
				
		name = al2.get(0);
		System.out.println(name);
		
		//String type�� ArrayList�� ������ּ���
		for (String string : al2) {
			System.out.print(string + "," );
		}
}

}



