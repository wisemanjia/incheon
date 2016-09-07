package Thread;
//Thread 쓰래드
/*thread : 프로그램의 실행, 흐름. 프로그램을 구성하는 실행단위
자바는 멀티스래드를 지원
지금까지는 : 단일스래드로 작업
멀티스래드 : 작업을 분할해서 여러개의 작업을 동시에 수행하기

SingleThread : 하나만 작업하는 것 
MultiThread : 작업을 동시에 하는 것 - 시분할작업(Time sharing)

JVM이 thread를 하나 만들어서 main()메소드로 던짐 -> main Thread
쓰래드를 직접 여러 개 만들어서 동시에 여러가지 작업을 할 수 있음
-> Sub Thread

멀티스래드사용법
1. Thread클래스를 상속받아서 사용하기 / run()오버라이딩 하기
	1. Thread를 만들기 위해서는 상위 클래스로 Thread
	2. run을 오버라이딩
	3. 오버라이딩 한 run 안에 프로그램을 넣어주기
	
2. 인터페이스 Runnable을 구현해서 run()메소드를 오버라이딩하기
	1. Runnable interface를 구현하기
	2. run을 오버라이딩하기
	3. 오버라이딩한 run안에 프로그램 넣어주기
	*. 인터페이스 구현을 추천드립니다.
	


*/
class Thread01 extends Thread {// thread상속받아서 사용하기
	String name;

	public Thread01(String name) {
		System.out.println(name + "스래드 생성");
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + "번째 : " + name + "달려!");
			
			try {
				sleep(1000);
				//1000밀리초 = 1초
				System.out.println(name + "멈춤");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("1번 스래드");
		//객체 생성
		Thread01 t2 = new Thread01("2번 스래드");
		Thread01 t3 = new Thread01("3번 스래드");
		//객체 실행
		t1.start();
		t2.start();
		t3.start();
		
		}
}
/*
new		실행되지 않은 상태
Runnable실행 가능한상태
waiting	대기상태
timed_waiting	스래드가 특정시간동안 대기상태
blocked	스래드가 잠겨 풀리기를 기다리는 상태
terminated 스래드가 종료된 상태
*/






