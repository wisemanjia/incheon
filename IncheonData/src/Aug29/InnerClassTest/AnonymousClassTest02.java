package Aug29.InnerClassTest;
/*
 * �͸�Ŭ����
����Ŭ������ ������
class��� ������ class���� ������ �ʰ�, ��ü�� ������
������� ���Ǹ� ������.
����ũ����ó�� �ҼӵǾ��ִ� �޼�����
��� �������� ����ϱ� ���ؼ��� ������ �տ�
final�� �ٿ����Ѵ�. 
����Ŭ������ Ư���޼ҵ带 �������̵��Ͽ� ������ �����ϴ�.
*/
class AnonymousTest{
	public void abc(){
		System.out.println("abc�޼����Դϴ�.");
	}
}
class Test4{
	
}
public class AnonymousClassTest02 {
	void joo(){
		//AnonymousTest at = new AnonymousTest(){};�̷���
		//��ü �����ڵ� �ڿ� ";"�� �� ���Դϴ�.
		//�͸�Ŭ������ ��ȸ������ �ڵ带 ª�� ���� ���� �ϸ�
		//�ȵ���̵� ���ø��鶧�� java�ڵ峻����
		//�̺�Ʈ ó��, ������ ���� �� �� ���� ���ɴϴ�.
		//AnonymousTest(){};�� �ȿ��� �̹� �����ϴ� Ŭ������
		//�޼��带 �������̵��ϰ� ���� �� ������ ���ݴϴ�.
		AnonymousTest at = new AnonymousTest(){
			public void abc(){
				System.out.println("�������̵��� abc");
			} 
		}; // <--�̷���
		at.abc();
	}
	public static void main(String[] args) {
		AnonymousClassTest02 at2 =
				new AnonymousClassTest02();
		
		at2.joo();
		System.out.println("���� main�޼ҵ��Դϴ�.");
	}
}




