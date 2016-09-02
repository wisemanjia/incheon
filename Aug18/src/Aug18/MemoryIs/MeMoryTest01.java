package Aug18.MemoryIs;
//그동안 못했던 메모리 정리하기
/*
중요: 호출스택은 예외처리때 필요합니다. 기억해주세요~

메소드 영역
		클래스데이터(클래스변수)
		프로그램 실행 중 어떤 클래스가 사용되면 JVM은
		해당 클래스 파일을 읽어서 클래스데이터를
		이곳에 저장하며 동시에 클래스 변수도 이곳에 생성

호출스택
		메인메소드(지역변수)
		메서드 작업에 필요한 메모리 공간을 제공
		메서드가 호출되면 호출스택에 메서드 활용을 위한
		메모리가 할당됨.
		메모리에서 메서드가 작업을 수행하는 동안
		지역변수와 연산의 중간결과가 저장됨.
		메서드가 작업을 마치면 할당되었던 메모리 공간은 
		반환되어 비워집니다.
		호출스택은 제일 상위에 있는 메서드가 지금 실행중
		메서드입니다.
		나머지는 모두? 대기를 탑니다.
		*언제나 호출스텍의 제일 위에 있는 메서드가
		*지금 실행중인 메서드입니다.
		*아래에 있는 메서드가 바로 위에 있는 메서드를 
		*호출해서 사용중인 메서드입니다.

힙영역heap
		 인스턴스(인스턴스 변수)
		 인스턴스는 이곳에 생성됩니다.

리턴타입이 있는 메서드는 종료되기 직전 결과값을 반환함
누구에게 반환? 자신을 호출한 메서드에게 결과값 반환.
누구? 대기타고 있는 호출메서드가 받아서 프로그램 진행함.
*/
public class MeMoryTest01 {
	public static void main(String[] args) {
	System.out.println("Main Method Start");
	firstMethod();
	System.out.println("Main Method End");
	}
	
	static void firstMethod(){
		System.out.println("First Method Start");
		secondMethod();
		System.out.println("First Method End");
	}
	static void secondMethod(){
		System.out.println("Second Method Start");
		System.out.println("Second Method Work");
		System.out.println("Second Method End");
	}

}
