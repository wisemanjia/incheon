package Aug16.OOP;
//이제 드디어 OOP가 시작됩니다.
public class OOPTest01 {//클래스 시작
	public static void main(String[] args) {//메 시
		//alan
		alan a1 = new alan();
		//marc
		marc m1 = new marc();
		
		//marc : 너 아침 먹었어?
		m1.aks();
		//alan : (먹었으면) 먹었어.
			//(안 먹어으면) 같이 먹을까?
		a1.answer();
		//메인 메소드 안에서 작업
		
	}//메인 메소드 끝
}//클래스 끝

class alan{
	//변수 : 정보 / 아침밥
	boolean breakfast = false; 
	//메소드 : 행동 / 대답
	void answer(){
		//만약에 alan이 밥을 먹었으면 먹었다
		//안 먹었으면 안 먹었다.
		if(breakfast == true){
			System.out.println("Ya, 이미 먹었어.");
		}else{
			System.out.println("No, 안 먹었어.");
		}
	}
}

class marc{
	//변수 : 정보 / ?
	//메소드 : 행동 / 물어보는거
	void aks(){
		System.out.println("hi. alan, 밥 먹었어?");
	}
}
