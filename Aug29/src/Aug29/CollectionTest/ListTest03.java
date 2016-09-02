package Aug29.CollectionTest;

import java.util.ArrayList;

//ArrayList�� ģ������
public class ListTest03 {
	public static void main(String[] args) {
		/*
		 * 1.ArrayList ����ñ�
		 * 
		 * 2. ����Ʈ �ȿ� 1~45���� ���ʴ�� �ֱ�
		 * 
		 * 3. ArrayList ������ ¦���� �༮�� ���ϱ� (a.get(2...4..6...8));
		 * 
		 */
		int sum = 0;
		ArrayList<Integer> ai = new ArrayList<Integer>();
		for (int i = 1; i < 46; i++) {
			ai.add(i);
			if (i % 2 == 0) {
				sum += i;
				// System.out.print(i);
			}
		}
		// ???
		for (int i = 0; i < ai.size(); i++) {
			System.out.println(ai.get(i));
		}

		System.out.println("¦����° ������? : " + sum);

	}
}
