package DateFormat;

import java.util.Calendar;

//date��� ���� Calendar
public class Date01 {
	/**�̰� �����Դϴ�.]
	 * �� �������� �� Ŭ����(��ü)�� ȣ���Ϸ��� 
	 * toString();�� ȣ���ϸ� ���� ���� �Ͼ�ϴ�.*/
	public static void main(String[] args) {
		// �⺻������ ���� ��¥�� �ð����� ����
		Calendar today = Calendar.getInstance();
		System.out.println("�� ���� �⵵ : "
					+ today.get(Calendar.YEAR));
		System.out.println("�� �� ���� : "
				+ today.get(Calendar.MONTH));
		//0~11 // +1 0������ �����մϴ�. �׷��� 1���� 0��
		System.out.println("�� ���� �� ��° ��? : "
				+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ��° ��? : "
				+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� ��ĥ : " 
				+ today.get(Calendar.DATE));
		System.out.println("�� ���� �� �� : "
				+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� �� : "
				+ today.get(Calendar.DAY_OF_YEAR));
		//����
		System.out.println("���� : "
		+ today.get(Calendar.DAY_OF_WEEK));
		//1�� 2�� 3ȭ 4�� 5�� 6�� 7��
		
		System.out.println("�̴��� �� ° ����"
				+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//����0 ����1
		System.out.println("���� ����" + today.get(Calendar.AM_PM));
		
		//�ð�
		System.out.println("�ð�" + today.get(Calendar.HOUR));//12
		System.out.println("�ð�" + today.get(Calendar.HOUR_OF_DAY));//24
		//��0~59
		System.out.println("�� : " + today.get(Calendar.MINUTE));
		//��0~59
		System.out.println("�� : " + today.get(Calendar.SECOND));
		//�� : õ���� 1��
		System.out.println("1/1000sec : " +today.get(Calendar.MILLISECOND));
		//õ���� 1�ʸ� �ð����� ǥ���ϱ� ���ؼ� 3600000���� ����
		//1�ð��� 60�� * 60��
		// = Timezone (-12 ~ +12)
		System.out.println("Ÿ����" + today.get(Calendar.ZONE_OFFSET));
		
		//�� ���� ��������
		System.out.println("������ �� : "
		+ today.getActualMaximum(Calendar.DATE));
		
		
		//���ó�¥ : ���� - �� - �� - ���� - ����/���� - �ð� - �� - ��
		System.out.println(
				"2016 - 09 - 08 - ����� - ���� - 11�� - 37�� - 11��");
		 
		
		
		
		
		
	}

}
