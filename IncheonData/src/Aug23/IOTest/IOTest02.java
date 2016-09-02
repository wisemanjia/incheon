package Aug23.IOTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

//다시 만들어보기
public class IOTest02 {
	public static void main(String[] args) {
		/*
		read(byte[] b); :스트림으로 부터 b배열만큼 읽어서
		새롭게 읽은 데이터의 갯수를 int 타입으로 리턴
		데이터의 끝일경우 -1 리턴한다.
		*/
		byte[] out = {1,12,2,3,4,5,6,7,8,9};
		byte[] in = null;
		
		//데이터를 읽는 바이트 배열 생성하기
		byte[] temp = new byte[3];
		
		ByteArrayInputStream input =
				new ByteArrayInputStream(out);
		ByteArrayOutputStream output =
				new ByteArrayOutputStream();
		
		int data;
		//read(byte[] b);를 이용하셔야 합니다.
		//모든 배열값을 읽은 후 출력시키는 문장을 만드세요
		//while문장을 활용하세요.
		
			try {
				data = input.read(temp);
				output.write(temp);
				System.out.println("||||||||||||||||||");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		System.out.println(
				Arrays.toString(output.toByteArray()));
		
		
		
		
		
		try {
			while ((data = input.read(temp)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.println(temp[i]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
