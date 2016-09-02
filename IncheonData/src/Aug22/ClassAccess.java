package Aug22;
//정적멤버, 클래스멤버 ; 객체를 통하지 않고 사용할 수
//있는 맴버
//모든 객체를 통틀어서 하나만 생성되고 모든 객체가
//이것을 공유한다.
/*
인스턴스 멤버 : 인스턴스 생성시 갖게 되는 자신의 변수
				별도의 기억공간을 가지고 객체마다 각각
				다른 값을 가진다.

정적 멤버 : 모든 객체가 공통적으로 사용하는 변수
			클래스.변수명으로 호출
			인스턴스를 생성하지 않고 사용가능
			하나의 클래스에 하나의 변수만 가능
			객체보다는 클래스에 의지(연결)
			static을 붙이면 됩니다.
			
정적멤버처럼 정적 메소드도 만들 수 있습니다.
main에 static이 붙은 이유?
					객체 생성없이 메인을 호출하기 위해

사용시 주의사항
객체가 생성되지 않은 상태에서 호출되는 메서드이므로
객체 안에서만 존재하는 인스턴스변수들을 사용할 수 없다.
정적 변수와 지역변수만 사용가능합니다

정적 메소드에서 인스턴스메소드를 호출하면 오류납니다.
인스턴스메서드로 객체가 생성되어야만 사용할 수 있기 때문

정적 메서드에서 정적 메서드를 호출하는 것은 가능합니다.
정적 메소드는 this를 키워드로 사용할 수 없습니다.
		: this가 참조할 인스턴스가 없기 때문입니다.
정적 메서드에서는 정적(static)메서드로
 호출해서 부를 수 있습니다. 

final을 붙인 상수는 모두 다 같이 쓰는 변수인데......
객체를 만들지 않고 쓰면 좋겠습니다. 
그래서 static을 붙여주면 좋겠죠.
*/

//자동차를 만드는데... count
class Car {
	private String model;
	private String color;
	private int speed;
	private int id;
	static int numbers = 0;

	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.id = ++numbers;
	}


}

public class ClassAccess {

	public static void main(String[] args) {
		Car car1 = new Car("티코", "빨강", 70);
		Car car2 = new Car("소나타", "검정", 170);
		Car car3 = new Car("그랜다이져", "노랑", 300);
		
		System.out.println(Car.numbers);
		System.out.println();
		
	}
}