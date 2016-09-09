package Wrapper;
public class Wrapper02 {
//Wraper Class is?
/*Java�� �����͸� Ŭ������ ��ü �̿�(int, byte, boolean ���)��
 * ���� ���� Ÿ���� ������. ���� java������ �⺻Ÿ�԰� ��ü
 * ���� ���� �ΰ��� Ÿ���� ���� �����͸� ������ �˴ϴ�.
 * ���� ��� �����͸� ������ �� �⺻�� Ÿ���� ������
 * ������ �� �ְ�, �پ��� ��ü���� ������ �� �ִ� �����̳�
 * ������ �ϴ� ��ü�� ������ �� �ִ�.
 * �׷��� � ��Ȳ������ �⺻�� Ÿ���� ��ü�� ����ؾ� ��
 * ��찡 �ֽ��ϴ�.
 * �̷��� ��쿡 �⺻�� Ÿ�� ���� ��ü�� �����ؾ� �� �ʿ䰡
 * �ֽ��ϴ�.
 * 
 * ����Ŭ����Wrapper Ŭ������ Ư�� �⺻�� Ÿ���� ��Ÿ���ϴ�.
 * IntegerŬ������ ������ ����Ÿ���� ǥ���մϴ�.
 * IntegerŬ�����κ��� ������ ��ü�� �ϳ��� int���� �����մϴ�.
 * Wrapper Ŭ������ �����ڴ� ������ �⺻�� Ÿ�� ���� �޽��ϴ�. * 
 */
	public static void main(String[] args) {
		Integer age = new Integer(30);
		//�׷� ����, 3.14���� �����ϴ� ����Ÿ���� ������ pi
		//double pi = 3.14; �̰� �ƴ�;;;
		Double pi = new Double(3.14);
		//����Ʈ -128~127 by 127
		//byte by = 127; �̰� �ƴ�;;;
		Byte by = new Byte((byte) 127);
		/*
		Integer �������� ��ü�� ����Ǹ� age ��ü�� ���� 30��
		��ü�� ��Ÿ���� �⺻ Ÿ���� �ƴ� ��ü�� �ʿ��� ����
		����� �� �ֽ��ϴ�.
		Java�� �� ����Ÿ�Կ� ���� JavaŬ�� ���̺귯�� ����
		�����Ǵ� Wrapper Class�� �����մϴ�.
		��� WrapperŬ������ java.****��Ű�� �ȿ� ���� �˴ϴ�.
		
		void Ÿ���� ��Ÿ���� WrapperŬ������ �ֽ��ϴ�.,
		�׷��� �ٸ� WrapperŬ������ �޸� void�� ��üȭ�� ��
		���� ���� ��(��, ����ִ�) ���� ������ ��Ÿ���ϴ�.
		*/
		
		//Boxing and UnBoxing
		/*Wrapper Ŭ������ ��������� ���� ���ǵ� Ŭ������
		 * �ƴϱ� ������ ���� �����ϴ� ���ο� ��ü�� ���� �� 
		 * ������ �����մϴ�.
		 * 
		 * Boxing : �⺻�� �ڷḦ WrapperŬ���� ��ü�� �����ϴ� 
		 * 			������ ���մϴ�. 
		*/
		Integer age2 = new Integer(30);
		/* UnBoxing : ������ ��ü�� �⺻ �ڷ�������
		 * 			  ����/����ϴ� ����
		*/
		int age3 = age2.intValue();
		//AutoBoxing and AutoUnBoxing
		/*1.5���� ���Ŀ��� �ڵ����� �ڽ�/��ڽ��� ó���� ��
		 * �ֵ��� AutoBoxing�� AutoUnBoxing�� �����մϴ�.
		 * AutoBoxing : 
		*/
		Integer age4 = 33;
		/*���� 33�� Integer�� ����� age4�� �ֱ� ���ؼ���
		 * ��ü�� �����ؾ� ������, �ٷ� �����ϸ�
		 * AutoBoxing�� �ڵ����� ���ݴϴ�.
		 * 
		 *  AutoUnBoxing
		*/
		Integer age5 = new Integer(34);
		int num = age5;
		/* Integer��ü�� �ִ� int ���� ��������(UnBoxing)
		 * ���ؼ��� ������.intValue();�޼ҵ带 �̿��ؼ� 
		 * �̾ƾ� ������, int�� ������ Integer ��ü�� �����ϸ�
		 * �ڵ����� AutoUnBoxing�˴ϴ�.
		*/
		
		
		
		/**�߿�
		 * AutoBoxing�� AutoUnBoxing�� ���� �⺻�� Ÿ�԰�
		 * �����ϴ� Wrapper Ŭ���������� �Ͼ�ϴ�.
		 * �ٸ� ��쿡�� ������ �õ��ϸ� ������ ������ �߻��մϴ�.
		 * Integer�� intValue()��, Double�� doubleValue()�� �ؾ�
		 * AutoBoxing�� AutoUnBoxing�� �Ͼ�ϴ�.
		*/
		Double pi2 = 3.14;
		int num1 = pi2.intValue(); //?
		//int num2 = pi2;
		
		/**
		 * Wrapper Ŭ������ �⺻ �޼ҵ��
		 * �޼ҵ�			��ȯ��		����
		 * booleanValue()	boolean		�⺻�� �����͸� ���ڿ���
		 * 								�ٲ� �ڿ� ��ȯ
		 * byteValue()		byte		��ü�� ���� byte ������ ��ȯ
		 * doubleValue()	double		��ü�� ���� double������ ��ȯ
		 * floatValue()		float		��ü�� ���� float������ ��ȯ
		 * intValue()		int			��ü�� ���� int������ ��ȯ
		 * longValue()		long		��ü�� ���� long���� ��ȯ
		 * shortValue()		short		��ü�� ���� short���� ��ȯ
		 * 
		 *  WrapperŬ���� ��ü���� �ش� �޼ҵ� ����� ����ȯ�� ������
		 *  �޼ҵ常 �����մϴ�.
		 *  
		 *  
		 * */
		
		
		
		
		
		
		
	}

}
