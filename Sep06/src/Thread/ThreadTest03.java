package Thread;
//�̹����� �������̽�

class Thread2 implements Runnable {
	String name;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "������ �۵�");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "���ڱ�");
		}

	}

	public Thread2(String name) {
		System.out.println(name + "������ ����");
		this.name = name;
	}

}
public class ThreadTest03 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2("1��");
		Thread2 t2 = new Thread2("�� ��");
		Thread2 t3 = new Thread2("��");
		//�������̽��� ������ t1�� �ٽ� ������ ���·� ��üȭ
		//�� �Ŀ� ��ŸƮ �ؾ��մϴ�. ��
		//�������̽��� run�� ������ �־ ����/��ŸƮ�� �Ұ���
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}

}







