package Thread;

class MyThread extends Thread {// 이녀석도... 중요 : 상속
	@Override
	public void run() {// 이녀석도
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);// 이녀석과 익숙해지세요.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);// 0~99
		}
		super.run();
	}

}
//인터페이스 구현
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
			
			System.out.println("안녕(스래드2)");
		}
	}
	
}



public class ThreadTest02 {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt1 = new MyThread();// 객체 생성
		mt1.start();// RUN메소드를 실행
		
		Thread t2 = new Thread(new Mythread2());
		//이렇게 잡아주세요.
		//스래드 객체를 만들면서 그 속에 Mythread2
		t2.start();//실행
		
		for (int i = 0; i < 50; i++) {
			Thread.sleep(2000);//작업속도를 낮추기 위해서
			//자바가 워낙 빠르게 지나가서
			System.out.println("Hi~");
		}
		
	}

}
