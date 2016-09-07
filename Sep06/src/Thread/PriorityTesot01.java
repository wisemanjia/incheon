package Thread;
//Thread �켱���� Priority
class Thread3 extends Thread{
	String name;
	public Thread3(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name + "�켱�������");
		}
		super.run();
	}
}


public class PriorityTesot01 {
	public static void main(String[] args) {
		Thread3 t1 = new Thread3("1��°");
		Thread3 t2 = new Thread3("�ι�°:");
		Thread3 t3 = new Thread3("3��°");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		/*
		t1.setPriority(1);//10�� ���� ��������?
		t2.setPriority(5);//1~10 ����� �켱����?
		t3.setPriority(10);//�۾��� ���� ���̱�.
		*/
		
		t1.start();
		t2.start();
		t3.start();
	}

}






