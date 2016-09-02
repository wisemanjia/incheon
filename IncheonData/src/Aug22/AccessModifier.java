package Aug22;
//접근지정자, 접근제어자
/*
public : 모든 접근 허용. 어떤 클래스가 접근하던 다 OPEN
protected : 상속받은 클래스, 또는 같은 패키지내에서만 접근
default : 기본제어자, 아무것도 붙지 않을 수 있습니다.
			클래스 내부와 같은 패키지 내에서 접근 가능
private : 외부에서 접근 불가능. 같은 클래스 내에서 접근

			클래스 내부	| 동일패키지 | 하위클래스 | 그외
public			가능		가능		가능		 가능
protected		가능		가능		가능		 X
default			가능		가능		X			 X
private   		가능		X			X			 X


*/

class GetterSetter{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class AccessModifier {
	public static void main(String[] args) {
		GetterSetter getterSetter = new GetterSetter();
		getterSetter.setName("엘군");
		getterSetter.getName();
	} 
}
