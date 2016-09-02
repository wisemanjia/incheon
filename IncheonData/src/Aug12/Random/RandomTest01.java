package Aug12.Random;

public class RandomTest01 {
	public static void main(String[] args) {
//렌덤 무작위 난수표
		//렌덤은 math.random 0.02220505~0.999999999
		//변수
		//double r = Math.random();
		//System.out.println(r);
		
		//만약, 내가 원하는 값은 1.000101~3.0002000
		//double r2 = Math.random() * 4;
		//System.out.println(r2);
		
		for (int i = 0; i < 10; i++) {//1,2,3
			//System.out.println(Math.random() * 3 + 1);
			//System.out.println((int)(Math.random() * 3 + 1));
			//형변환~~~~
			//if문장을 사용하셔서 1. 가위 2.바위 3.보
			//10번 돌리고 
			int com1 = (int)(Math.random() * 3 + 1);
			//이 문장을 정확히 고쳐드립니다.
			int com = (int)(Math.random() * 3) + 1;
			
			if(com == 1){
				System.out.println("가위");
			}else if(com == 2){
				System.out.println("바위");
			}else{
				System.out.println("보");
			}
		}
	}
}
