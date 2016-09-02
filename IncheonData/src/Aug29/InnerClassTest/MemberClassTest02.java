package Aug29.InnerClassTest;
//���Ŭ���� ����2
class Test2{
	int a = 10;
	
	class Joo{
		int b = 2;
		public void joo(){
			System.out.println("joo ���Ŭ����");
		}
	}
}
public class MemberClassTest02 {

	public static void main(String[] args) {
		Test2 t2 = new Test2(); //out Ŭ������ ��ü�� ����
		Test2.Joo joo = t2.new Joo(); //���Ǳ�� ���ּ���.
		joo.joo();
	}

}




