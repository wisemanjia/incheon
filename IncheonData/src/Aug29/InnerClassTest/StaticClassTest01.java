package Aug29.InnerClassTest;
/*����Ŭ���� : ����Ŭ����(Static Class)
inner Class�� static�� ����Ǿ�� �Ѵٸ�
inner Class���� static class�� ����Ǿ�� �մϴ�.
���� : staticŬ������ �ݵ�� ��ø������ ���� �����մϴ�.
*/

class Outer1 {
	static int out1 = 20;
	private void outDo() {

	}

	static class Inner1 {
		static int in1 = 10;
		public void doSome() {
			//System.out.println(in1);
			System.out.println(out1);
		}
	}

}

public class StaticClassTest01 {
	public static void main(String[] args) {
		Outer1.Inner1 in1 = new Outer1.Inner1();
		in1.doSome();
	}
}
