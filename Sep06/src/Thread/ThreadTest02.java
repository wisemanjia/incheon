package Thread;

class MyThread extends Thread {// �̳༮��... �߿� : ���
	@Override
	public void run() {// �̳༮��
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);// �̳༮�� �ͼ���������.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);// 0~99
		}
		super.run();
	}

}
//�������̽� ����
class Mythread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			
				try {
					Thread.sleep(1050);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println("�ȳ�(������2)");
		}
	}
	
}



public class ThreadTest02 {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt1 = new MyThread();// ��ü ����
		mt1.start();// RUN�޼ҵ带 ����
		
		Thread t2 = new Thread(new Mythread2());
		//�̷��� ����ּ���.
		//������ ��ü�� ����鼭 �� �ӿ� Mythread2
		t2.start();//����
		
		for (int i = 0; i < 50; i++) {
			Thread.sleep(2000);//�۾��ӵ��� ���߱� ���ؼ�
			//�ڹٰ� ���� ������ ��������
			System.out.println("Hi~");
		}
		
	}

}
