package Aug18;
//메소드
//어떤 것을 처리할 때 이것을 묶어서 하나로 처리하고 싶을
//때 : 어떤 값이 입력되었을 때 그 처리값을 리턴~ :한번에

public class MethodTest01 {
	
	public int sum(int a, int b){//더하기가 가능한 메소드
		return a + b;//숫자 두개만 가능 ㅠㅠ
	}
	/*
	public 리턴자료형 메소드명(입력자료형 입력변수, 입력자료형 입력변수, 입력자료형 입력변수..){
		return 리턴값
	}
	*/
	public String sayHi(){
		return "안녕하세요";
		//System.out.println("hahahah");
	}
	
	public void hap(int a, int b){
		System.out.println("합은" + (a+b) + "입니다");
	}
	
	public void say_nick(String nick){
		if("fool".equals(nick)){
			return;
		}
		System.out.println("당신의 별명은 \"" + nick +"\"이군요");
	}
	
	//return의 또 다른 쓰임새
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 19;
		
		MethodTest01 method01 = new MethodTest01();
		c = method01.sum(a, b);
		System.out.println(c);
		
		method01.say_nick("fool");
		method01.say_nick("어이 김군");
		//당신의 별명은 "어이김군"입니다.
		
	}
}
