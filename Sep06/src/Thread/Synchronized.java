package Thread;
//Synchronized : ������ ����ȭ�ϱ�
/*
���� �����͸� ������ �� �� ���� ���缭 ����ȭ�� ���� �� �ִ�
������ ����ȭ ���
�ùٸ� �����͸� ����� �� 
�ִ� ���
*/
class Number{//�̳༮�� �����ϰڽ��ϴ�.
	int num = 0;
/*	public void addNum(){
		num++;
	}//���� �ڵ�
	*/
	public synchronized void addNum(){
		num++;
	}
	
	public int getNum(){
		return num;
	}
}

class Thread4 extends Thread{
	Number number;
	
	public Thread4(Number num){
		number = num;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {//50���ݺ� : 15000
			number.addNum();
		}
		super.run();
	}
}

public class Synchronized {

	public static void main(String[] args) {
		Number number = new Number();
		Thread4 t1 = new Thread4(number);
		Thread4 t2 = new Thread4(number);
		Thread4 t3 = new Thread4(number);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();//join�� �ٸ� �����带 ��ٸ�.
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(number.getNum());
	}

}






