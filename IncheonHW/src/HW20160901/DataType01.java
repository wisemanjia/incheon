package HW20160901;

public class DataType01 {
	public static void main(String[] args) {
		//char (ĳ����)
		//�ݺ���
		//boolean
		
		//Ÿ�� ������; // ������ = ��;
		//Ÿ�� ������ = ��;
		int a; //����, intŸ���� a������ ����ڽ��ϴ�.
		a = 1;
		
		char c; //A, ��, a, ň String = ���ڿ�
		c = '��'; //"�� �ƴ϶� '
		//String g="������";
		//Char d='��';
		char c1 = 'A';//
		char c2 = 98;//�ƽ�Ű�ڵ�
		char c3 = '\ub148';//�����ڵ�
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		int num;
		num = c1;
		System.out.println(num);
		//���~ 0~127;
		for (int i = 48; i < 123; i++) {
			char cha = (char)i; //��� pro, ��->��
			// 0 : *** //���� + ���ڿ� + char
			System.out.println(i + " : " +cha);
		}
	}
}
