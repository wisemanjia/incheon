package Aug16.ArrayTest;

import java.util.Arrays;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
	int[] arr01 = new int[3];
	arr01[0] = 919;arr01[1] = 119;arr01[2] = 190;
	
	for (int i : arr01) {
		System.out.print(i+",");
	}
	System.out.println("====================");
	int[] arr02 = new int[3]; 
	
	//arr02 = arr01;
	
	for (int i = 0; i < arr01.length; i++) {
		arr02[i] = arr01[i];	
	}
	Arrays.sort(arr02);
	for (int i : arr02) {
		System.out.print(i+",");
	}
	System.out.println("++++++++++++++++++++");
	int[] arr03 = new int[3];
	System.arraycopy(arr02, 0, arr03, 0, 3);
	/*
	src = 원본 대상
	srcPos = 어느 위치부터 값을 읽을건지
	dest =  값을 담을 배열
	destPos = 어느위치에 저장할것인지
	length = 어느 길이만큼 읽어올것인지
			== 배열의 길이라고 하죠.
	*/
	for (int i : arr03) {
		System.out.print(i + ",");
	}
	//clone 
	//깊은 복사 얕은 복사에 대해 알아오세요.
	int[] arr04 = new int[3];
	arr04 = arr03.clone();
	
	for (int i : arr04) {
		System.out.print(i+",");
	}
	}

}
