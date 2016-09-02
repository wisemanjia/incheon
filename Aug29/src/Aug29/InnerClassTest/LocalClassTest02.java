package Aug29.InnerClassTest;

/*
 �ܺ� Ŭ������ �޼��峪 �ʱ�ȭ �� �ȿ� ����Ǿ�����
 �������� ��Ģ�� ����մϴ�.
*/
public class LocalClassTest02{
	void joo(){
		final int G = 300;
		class LocalJoo{
			public void hoo(){
				System.out.println(
						"Local Class, ����Ŭ�����Դϴ�");
				System.out.println(" G : " + G);
			}
		}
		
		System.out.println("joo �޼����Դϴ�.");
		LocalJoo lj = new LocalJoo();
		lj.hoo();
	}
	public static void main(String[] args) {
		LocalClassTest02 j = new LocalClassTest02();
		j.joo();
		//System.out.println("static���� : " + j.joo);
	}
}

