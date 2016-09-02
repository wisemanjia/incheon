package Aug25;

public class factorial {
	// 펙토리얼 계산
	// 제귀함수? : 자기 자신을 다시 호출하는 함수
	public static int fac(int a) {
		if(a == 1){
			a = 1;
		}else{
			return a * fac(a-1);
		}
		return a;
					
	}
	public static int fac2(int a){
		int b = 1;
		for (int i = a; i >= 1; i--) {
			 b *= i; 
			// System.out.println(a +""+ b);
		}
		return b;
	}

	// 5라면 5*4*3*2*1 ; 120
	public static void main(String[] args) {
		System.out.println(fac(25));
		System.out.println(fac2(25));
	}
}
