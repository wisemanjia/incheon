package Aug29.InnerClassTest;
//���Ŭ���� : ��ü ���� �� �۵�??
//Outer Ŭ�������� Inner�� ������ ��
//�ݵ�� Inner ��ü�� ���� �� ����
class Outer2{
	int out2 = 20;
	private void outDo(){
		Inner2 in2 = new Inner2();
		System.out.println(out2);
		System.out.println(in2.in2);
	}
	
	class Inner2{
		int in2 = 10;
		public void doSome(){//innerŬ���������� �����Ӱ�
							//Outer �ʵ带 ������ �� �ִ�.
							//�Ϲ��� private��
			System.out.println(out2);
			System.out.println(in2);
			outDo();// <-
		}
	}
}

public class MemberClassTest01 {

	public static void main(String[] args) {
		//Inner ��ü �����ϴ� ���
		//�ݵ�� Outer ��ü�� ���������� �����ؾ� �մϴ�.
		Outer2 outer2 = new Outer2();
		Outer2.Inner2 in2 = outer2.new Inner2();
		in2.doSome();
	}

}




