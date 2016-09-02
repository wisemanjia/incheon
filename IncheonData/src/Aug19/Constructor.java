package Aug19;
//생성자 : 인스턴스의 초기 설정값을 설정할 수 있다.
//힌트 : 생성자를 만들지 않으면 ***가 자동생성합니다.
//생성자가 하나라도 있다면 자동생성X
//생성자는 메소드
// 클래스명과 동일
//생성자는 return이 없음

public class Constructor {
	public static void main(String[] args) {
		Cat cat = new Cat(100);
		System.out.println(cat.age);
		System.out.println(cat.height);
	}
}
class Cat{
	int age;
	int height;
	
	public Cat(int height) {
		super();
		this.height = height;
	}
	
	public Cat(){
		System.out.println("나이");
		age = 1;
	}
	
	
}
