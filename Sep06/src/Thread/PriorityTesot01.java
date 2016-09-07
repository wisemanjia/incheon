package Thread;
//Thread 우선순위 Priority
class Thread3 extends Thread{
	String name;
	public Thread3(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name + "우선순위대로");
		}
		super.run();
	}
}


public class PriorityTesot01 {
	public static void main(String[] args) {
		Thread3 t1 = new Thread3("1번째");
		Thread3 t2 = new Thread3("두번째:");
		Thread3 t3 = new Thread3("3번째");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		/*
		t1.setPriority(1);//10이 가장 높은순위?
		t2.setPriority(5);//1~10 어느게 우선순위?
		t3.setPriority(10);//작업의 순위 먹이기.
		*/
		
		t1.start();
		t2.start();
		t3.start();
	}

}






