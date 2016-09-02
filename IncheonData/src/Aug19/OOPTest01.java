package Aug19;
//오버라이딩 : 상위 클래스에 잇는 매소드와 동일한
//			메소드를 만들어 기능만 재정의하는것
//오버로딩 : 한 클래스 내에서는 같은 이름의 
//			메소드가 있으면 안 됨.
//			단 파라메터가 다르면 같은 메소드명을 사용
//			┗파라메터의 갯수나 타입이 다르면 가능
//			└메서드를 호출할 때 파라미터로 구분				

public class OOPTest01 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.add(1, 2);
		h1.add(10, 3.14);
		h1.add(1,2,5,9); //int
		h1.add("가나", (byte)2, 'A', 10, 3.14);
		//String, byte, char, int, double
		h1.add(1,2,3,4,5,6,7,8,9,10);
		
	}
}
class Human{
	public void add(int a, int b){
		int c = a + b;
		System.out.println(c);
	}
	public void add(int a, double b){
		double c = a + b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c, int d){
		int f = a + b + c + d;
		System.out.println(f);
	}
	public void add(String a, byte b, char c, int d, double e){
		System.out.println(a+b+c+d+e);
		
	}
	//만약 무한이라면......?
	public void add(int... i){
		int result = 0;
		for (int j = 0; j < i.length; j++) {
			result += i[j];
		}
		System.out.println(result);
	}
}
