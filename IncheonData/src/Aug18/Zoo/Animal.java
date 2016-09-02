package Aug18.Zoo;
//getter, setter
public class Animal {
	//private : 변수나 메소드는 해당 클래스에서만 접근
	//접근지정자
	private String name;
	private int age;
	public void sound(){
		System.out.println("동물이 소리지릅니다.");
	} 
	public void eat(){
		System.out.println("동물이 먹습니다.");
	}
	
	public void setName(String name){//이름지정하도록
		this.name = name;
	}
	
	public void setAge(int age){//나이 지정하도록
		this.age = age;
	}
	
	public String getName(){//이름에 접근할 수 있도록
		return name;
	}
	public int getAge(){//나이에 접근할 수 있도록
		return age;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setName("동물");
		animal.setAge(10);
		animal.sound();
		animal.eat();
		
		Dog r2d2 = new Dog();
		r2d2.setName("R2D2");
		r2d2.setAge(1);
		r2d2.sound();
		r2d2.eat();
		//강아지 이름
		System.out.println("강아지 이름은 " + r2d2.getName() + " 입니다.");
		//강아지 나이
		System.out.println("강아지 나이는 " + r2d2.getAge() + " 입니다.");
		
		Cat treePo = new Cat();
		treePo.setName("3PO");
		treePo.setAge(2);
		treePo.sound();
		treePo.eat();
		
		Cat cat = new Cat();
		cat.setName("Garfield");
		cat.setAge(5);
		cat.sound();
		cat.eat();
	}
}

class Dog extends Animal{//상속 : extend 부모클래스
	//이미 부모게에 있는 메소드, 상속받아서 재정의
	//재정의 : 오버라이딩 
	public void sound(){//부모에게 있는 구성요소를
		//다시 가져와서 재 정의하는것 : 오버라이딩
		System.out.println("bowwow");
	}
	public void eat(){
		System.out.println("개사료 & 개껌");
	}
	
}

class Cat extends Animal{
	public void sound(){
		System.out.println("Meow");
	}
	public void eat(){
		System.out.println("고양이사료 & 생선");
	}
}
/*
자바를 처음 배울때 게터와 세터라고 말하는데
이것들이 무엇을 이야기 하는지 궁금합니다.
다들 아무렇지 않게 사용하고, 당연히 사용하는데 
이것이 무엇이고 왜 써야 하는 건가요?

맴버변수를 지키는 역할
클래스를 새로 만들개 되면 맴버 변수도 만들게 됩니다.
그리고 그 맴버 변수는 .(점)을 통해 접근하게 됩니다.
class 사람{
	int 키 = 170;
	int 몸무게 = 60;
}
이 클래스의 키와 몸무게를 사용하기 위해서는?
사람.키, 사람.몸무게로 접근 가능합니다.
하지만 이렇게 직접접근하게 될 경우 큰 문제가 발생합니다.
사람 클래스에서 사용되는 키와 몸무게를 아무나 접근해서
수정할 수 있습니다.

보통인 사람 170에 60인 사람을 만들고자 객체를 생성했는데
누군가 수정해서 키20 몸무게180인 사람이 만들어질 수 있습
니다.
그래서 가장 일반적으로 클래스의 맴버 필드에는 클래스에서만
접근하여 수정이 가능한 private로 선언합니다.

class 사람{
	private int 키 = 170;
	private int 몸무게 = 60;
}
이렇게 되면 객체에서는 키와 몸무게를 변경할 수 없어요.
그래서 접근할 수 있도록 해주는 것이 getter, setter

class 사람{
	private int 키 = 170;
	private int 몸무게 = 60;
	
	public void set키(int a){
		키 = a;
	}
	pulbic void set몸무게(int b){
		몸무게 = b;
	}
	public int get키(){
		return 키;
	}
	
	public int get몸무게(){
		return 몸무게;
	}
}
get키가 게터, set키가 세터메소드입니다.
키를 변경하기 위해서는 사람.키가 아니라 메소드를 통해서
접근해야 합니다.

사람 사람1 = new 사람();
사람1.set키(175);

또한, 사람의 키를 알아내기 위해서는 
출력문(사람1.get키());라고 해야 합니다.

*/

class Human extends Animal{
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}