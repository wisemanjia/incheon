package Aug18;
//메소드 내에서 선언된 변수의 범위는?
public class MethodTest02 {
	public int vartest(int a){
		a++;
		return a;
	}
	//변수 a에 1을 대입. 그 후 vartest메소드에서 a로
	//대입, 그 후 a출력
	//
	public static void main(String[] args) {
		int a = 1;
		MethodTest02 mt1 = new MethodTest02();
		a = mt1.vartest(a);
		System.out.println(a);
		
	}
	//왜? 이유는 메소드 내에서 새로 만들어진 변수는
	//메소드 안에서만 쓰여지는 변수입니다.
	// = 메소드 밖에서 쓸 수 없는 변수입니다.
	

}
