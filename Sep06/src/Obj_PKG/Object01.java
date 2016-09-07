package Obj_PKG;
//�̰� �� �˾Ƶμž� �� ��
/* Object : ��� Ŭ������ ����
�ڹٿ��� ��� Ŭ������ Object�� �Ϲ������� ����մϴ�.
��ü�� �� ��ȯ�� �����մϴ�.
Parent p = new Child();
�� ���꿡�� ���� �װ� �������� ��ü�� ������ ���� �ٸ� ���
�� ������ ��� ���迡 �ְ� parent�� child�� ���� Ŭ������
��쿡�� �� ��ȯ�� �Ͼ�� �˴ϴ�. ��, ���� Ŭ�������� ����
Ŭ������ �Ҵ��ϴ� ���� �����ϴ�, �� �ݴ��� ���� ���� ����ȯ��
���־�� �մϴ�.
�� ��쿡�� ������ �߻��� �� �ֽ��ϴ�.
�� ������ Child�� parent���� Ȯ���ϴ� �����̱� ������
���� Ŭ������ ���� Ŭ������ �Ҵ��ϴ� ���� ������ ������,
���� Ŭ������ ���� Ŭ�������� ���� ������ �����̱� ������
���� ����ȯ�� ���־�� �մϴ�. 

*/
class Parent{
	public int age = 50;
	public String name ="spc";
	public void print(){
		System.out.println("�θ� ���� : " + age);
		System.out.println("�θ� �̸� : " + name);
	}
}

class Child extends Parent{
	public int age = 12;
	public String name = "�ĸ��ٰ�Ʈ";
	
	public void print1(){//�̰���!
		System.out.println("�ڽ��� ���� : " + age);
		System.out.println("�ڽ��� �̸� : " + name);
	}
}

public class Object01 {
	public static void main(String[] args) {
		Parent p = new Child();
		Parent parent = new Parent();
		//���� Ŭ������ ��ü�� ���� Ŭ������ �ν��Ͻ��� ����������
		//���� Ŭ������ ��� ������ ���� Ŭ������ �������̵� �޼ҵ�
		//ȣ��
		parent.print();
		System.out.println(parent.age);
		System.out.println(parent.name);
		
		//Child c = new Parent();//����
		//Child c = (Child) new Parent();
		//���� Ŭ������ ��ü�� ���� Ŭ������ �ν��Ͻ���
		//�����ϱ� ���ؼ��� ��������ȯ�� �ʿ��մϴ�.
		//�ٷ��ϸ� �������ϴ�.
		//Child child = (Child) parent;
		Child child = (Child) p;
		//��ó�� ���� �ν��Ͻ��� ���� �ν��Ͻ��� �־��� ��
		//���� Ŭ������ �� ��ȯ�Ͽ� �־�� �մϴ�.
		//����� ���� Ŭ������ ��������� �޼ҵ忡 �����մϴ�.
		child.print1();
		System.out.println(child.age);
		System.out.println(child.name);
		
	}

}








