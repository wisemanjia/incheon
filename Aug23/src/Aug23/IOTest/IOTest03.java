package Aug23.IOTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

//다시
public class IOTest03 {
	public static void main(String[] args) {
		byte[] in = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] out = null;

		byte[] temp = new byte[3];

		ByteArrayInputStream input = new ByteArrayInputStream(in);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		try {
			while (input.available() > 0) {
				System.out.println(input.available() + "input길이");
				int len = input.read(temp);
				System.out.println(len + "temp속 길이");
				output.write(temp, 0, len);
				//아까는 바로 썼지만 지금은 temp, 시작점, 길이
			}
		} catch (IOException e) {
		}
		out = output.toByteArray();
		System.out.println("원본 : " + Arrays.toString(in));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("사본 : " + Arrays.toString(out));
	}
}
