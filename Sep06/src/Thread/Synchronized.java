package Thread;
//Synchronized : 스래드 동기화하기
/*
서로 데이터를 공유할 때 한 쪽을 멈춰서 동기화를 맞출 수 있는
데이터 동기화 방법
올바른 데이터를 출력할 수 
있는 방법
*/
class Number{//이녀석을 공유하겠습니다.
	int num = 0;
/*	public void addNum(){
		num++;
	}//예전 코드
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
		for (int i = 0; i < 5000; i++) {//50번반복 : 15000
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
			t1.join();//join은 다른 스래드를 기다림.
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(number.getNum());
	}

}






