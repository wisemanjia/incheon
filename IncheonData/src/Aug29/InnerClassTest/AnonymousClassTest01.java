package Aug29.InnerClassTest;
/*
Anonymous �͸�Ŭ����
���� ���̴� Ŭ�����Դϴ�. �� �˾Ƶνñ⸦ �ٶ��ϴ�.
�� Ŭ������ �� �״�� Ŭ������ �̸��� ���� Ŭ�����Դϴ�.
���� Ŭ������ ������ ���·� Ư�� �޼ҵ忡�� �����ؼ�
����ϴ� �ͱ����� ����Ŭ������ �����ϴ�.
������ �ַ� ���Ǵ� ������ �ܺο� Ŭ������ �����صΰ�
�ش� Ŭ������ Ư�� �޼��� ���� Ư�� �޼��忡�� �� �����Ͽ�
�� ���� ����ϴ� Ư¡�� �ֽ��ϴ�.
�� Ŭ������ �ܺ� �޼��忡 �̴� ���� ���� �� final��
�͸� Ŭ������ ������ �����մϴ�. 
*/
interface Ain{
	void doSome();
	interface Ain2{
		
	}
}
abstract class AnoInner{
	int y = 20;
	public AnoInner(){
		this.disp();
	}
	public void disp(){}
}


public class AnonymousClassTest01 {
	public void doSome(AnoInner a){
		
	}
	public void do2(){
		doSome(new AnoInner() {
		});
	}
	
	public static void main(String[] args) {
		final int X = 10; 
		//�͸�Ŭ������ ����
		new Ain() {
			
			@Override
			public void doSome() {
			
			}
		};
		new AnoInner() {
			//�̳༮�� �������̵��ε�
			//�� �� ������ �װ� �̻��ϳ׿�.
			public void disp(){
				System.out.println("�⺻������");
				System.out.println("Y : " + y);
				System.out.println("x : " + X);
			}
		}; 
	}

}
