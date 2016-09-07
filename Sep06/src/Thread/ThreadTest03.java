package Thread;
//이번에는 인터페이스

class Thread2 implements Runnable {
	String name;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "스래드 작동");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "잠자기");
		}

	}

	public Thread2(String name) {
		System.out.println(name + "스래드 생성");
		this.name = name;
	}

}
public class ThreadTest03 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2("1번");
		Thread2 t2 = new Thread2("이 번");
		Thread2 t3 = new Thread2("삼");
		//인터페이스로 생성된 t1을 다시 스래드 형태로 객체화
		//그 후에 스타트 해야합니다. 꼭
		//인터페이스는 run만 가지고 있어서 슬립/스타트가 불가능
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}

}







