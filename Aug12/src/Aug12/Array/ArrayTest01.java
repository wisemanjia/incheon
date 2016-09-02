package Aug12.Array;

public class ArrayTest01 {
	public static void main(String[] args) {
		// 배열이란?
		// 배열 생성
		int b = 10;
		int[] a = new int[3]; //길이가 3인 int 배열을 만듬
		System.out.println(b);
		System.out.println(a);//[I@15db9742이렇게 나와요.
		//이유는 : 주소값
		//배열은 길이를 가지고 있습니다.
		System.out.println(a.length); //a배열의 길이를 알려줘
		//길이가 3     [] [] [] = 3
		// [0] [1] [2]
		System.out.println(a[2]);
		
		//값 대입
		a[0] = 100; //a배열의 주소 0번에 100을 넣습니다.
		a[1] = 50;
		a[2] = 1;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		int[] arr01 = new int[100];
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = i;
			System.out.println(arr01[i]);	
		}
		System.out.println(arr01[0]);
		
		//arr01의 홀수의 값을 모두 0처리
		for (int i = 0; i < arr01.length; i++) {
			if (i % 2 == 1) {
				arr01[i] = 0;
			}
			System.out.println(i+"번째:"+arr01[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
