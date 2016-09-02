package Aug29.InnerClassTest;

/*
 * ����Ŭ���� / ������øŬ����
���� Ŭ������ ���Ǻΰ� Outer�� Ư�� �޼��忡 ���� �� ����
�̷��� �ϴ� �� ������?
����Ŭ������ Ȱ�뵵�� outŬ������ Ư�� �޼��忡���� �����
���ѵ� �� ����մϴ�.

���� : ����Ŭ�������� ������ �� �ִ� outer �޼����� ������
�ݵ�� final(!)�� ����� ������ ���� �����մϴ�.

*/
class Outer3 {
	int out3 = 100;

	public void doSome() {
		final int LV = 200;

		class LocalClass {
			int li = 300;

			public void localDo() {
				System.out.println(out3);
				System.out.println(LV);
				System.out.println(li);
			}//Local Ŭ������ localDo���Դϴ�.
		}
		new LocalClass().localDo();//��������� LocalClass
	}//���Ⱑ doSome�� ���Դϴ�. �����ϼ���.
}//Outer���Դϴ�.

public class LocalClassTest01 {

	public static void main(String[] args) {
		Outer3 out3 = new Outer3();
		out3.doSome(); //�����Դ� 29�� ���� ������
	}

}
