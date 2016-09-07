package Obj_PKG;
//이건 꼭 알아두셔야 할 것
/* Object : 모든 클래스의 조상
자바에서 모든 클래스는 Object를 암묵적으로 상속합니다.
객체도 형 변환이 가능합니다.
Parent p = new Child();
이 연산에서 왼쪽 항과 오른쪽의 객체의 유형이 서로 다른 경우
두 유형이 상속 관계에 있고 parent가 child의 상위 클래스인
경우에만 형 변환이 일어나게 됩니다. 즉, 하위 클래스에서 상위
클래스로 할당하는 것은 가능하다, 그 반대의 경우는 강제 형변환을
해주어야 합니다.
이 경우에는 오류가 발생할 수 있습니다.
그 이유는 Child는 parent에서 확장하는 개념이기 때문에
상위 클래스에 하위 클래스를 할당하는 것은 문제가 없으나,
상위 클래스는 하위 클래스보다 좁은 범위의 개념이기 때문에
강제 형변환을 해주어야 합니다. 

*/
class Parent{
	public int age = 50;
	public String name ="spc";
	public void print(){
		System.out.println("부모 나이 : " + age);
		System.out.println("부모 이름 : " + name);
	}
}

class Child extends Parent{
	public int age = 12;
	public String name = "파리바게트";
	
	public void print1(){//이것은!
		System.out.println("자식의 나이 : " + age);
		System.out.println("자식의 이름 : " + name);
	}
}

public class Object01 {
	public static void main(String[] args) {
		Parent p = new Child();
		Parent parent = new Parent();
		//상위 클래스의 객체에 하위 클래스의 인스턴스를 대입했으니
		//상위 클래스의 멤버 변수와 하위 클래스의 오버라이드 메소드
		//호출
		parent.print();
		System.out.println(parent.age);
		System.out.println(parent.name);
		
		//Child c = new Parent();//에러
		//Child c = (Child) new Parent();
		//하위 클래스의 객체에 상위 클래스의 인스턴스를
		//대입하기 위해서는 강제형변환이 필요합니다.
		//바로하면 오류납니다.
		//Child child = (Child) parent;
		Child child = (Child) p;
		//이처럼 하위 인스턴스를 상위 인스턴스에 넣어준 뒤
		//하위 클래스로 형 변환하여 넣어야 합니다.
		//결과는 하위 클래스의 멤버변수와 메소드에 접근합니다.
		child.print1();
		System.out.println(child.age);
		System.out.println(child.name);
		
	}

}








