package Thread;
//Thread ������
/*thread : ���α׷��� ����, �帧. ���α׷��� �����ϴ� �������
�ڹٴ� ��Ƽ�����带 ����
���ݱ����� : ���Ͻ������ �۾�
��Ƽ������ : �۾��� �����ؼ� �������� �۾��� ���ÿ� �����ϱ�

SingleThread : �ϳ��� �۾��ϴ� �� 
MultiThread : �۾��� ���ÿ� �ϴ� �� - �ú����۾�(Time sharing)

JVM�� thread�� �ϳ� ���� main()�޼ҵ�� ���� -> main Thread
�����带 ���� ���� �� ���� ���ÿ� �������� �۾��� �� �� ����
-> Sub Thread

��Ƽ���������
1. ThreadŬ������ ��ӹ޾Ƽ� ����ϱ� / run()�������̵� �ϱ�
	1. Thread�� ����� ���ؼ��� ���� Ŭ������ Thread
	2. run�� �������̵�
	3. �������̵� �� run �ȿ� ���α׷��� �־��ֱ�
	
2. �������̽� Runnable�� �����ؼ� run()�޼ҵ带 �������̵��ϱ�
	1. Runnable interface�� �����ϱ�
	2. run�� �������̵��ϱ�
	3. �������̵��� run�ȿ� ���α׷� �־��ֱ�
	*. �������̽� ������ ��õ�帳�ϴ�.
	


*/
class Thread01 extends Thread {// thread��ӹ޾Ƽ� ����ϱ�
	String name;

	public Thread01(String name) {
		System.out.println(name + "������ ����");
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + "��° : " + name + "�޷�!");
			
			try {
				sleep(1000);
				//1000�и��� = 1��
				System.out.println(name + "����");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("1�� ������");
		//��ü ����
		Thread01 t2 = new Thread01("2�� ������");
		Thread01 t3 = new Thread01("3�� ������");
		//��ü ����
		t1.start();
		t2.start();
		t3.start();
		
		}
}
/*
new		������� ���� ����
Runnable���� �����ѻ���
waiting	������
timed_waiting	�����尡 Ư���ð����� ������
blocked	�����尡 ��� Ǯ���⸦ ��ٸ��� ����
terminated �����尡 ����� ����
*/






