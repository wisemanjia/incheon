package DateFormat;
//��¥ �����ϱ�
import java.util.Calendar;

public class Date02 {

	public static void main(String[] args) {
		//������ 1���� �����ϱ⿡ 
		final String[] DAY_OF_WEEK
		= {"","��", "��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		//Month�� 0���� �����ϱ� ������ -1�ؾ� �մϴ�.
		//date1.set(2005,Calendar.SEPTEMBER, 8);
		date1.set(2025,8,15); //202�� 9�� 15��
		System.out.println("date1��" 
				+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]
				+"����");
		System.out.println("date2��"
				+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]
				+"����");
		
		//�� ��¥ ������ ���̸� ��� ���ؼ���
		//getTimelnMillis()�̿��ؼ� õ���� 1�� ������ ��ȯ
		long dff = (date1.getTimeInMillis()
				- date2.getTimeInMillis())/1000;
		System.out.println("���ݺ��� 2025�����: "
				+ dff +"�ʰ� ���ҽ��ϴ�.");
		
		//��¥�� ����ϱ� 1���� 24 * 60 * 60
		System.out.println("�Ϸ� ����ϸ� "
					+ dff/(24*60*60) + "�� ���ҽ��ϴ�.");
	}

}

