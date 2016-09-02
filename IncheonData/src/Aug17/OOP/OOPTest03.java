package Aug17.OOP;
//드뎌 객체지향 2
public class OOPTest03 {
	public static void main(String[] args) {
	david david1 = new david();
	sunja sunja1 = new sunja();
	
	for (int i = 0; i < 15; i++) {		
		david1.ask();
		System.out.println(sunja1.lovePoint);
		sunja1.answer();
	}
		
		
	}
}

class david{
	int lovePoint = 10;
	void ask(){
		System.out.println("you, 나 사랑해?");
	}
	//void answer(){fdsafdsafa}
}

class sunja{
	int lovePoint = 60;
	
	void answer(){
		if(lovePoint > 50){
			System.out.println("사랑해");
		}else{
			System.out.println("사랑 안 해");
		}
		lovePoint--;
	}
	
}
