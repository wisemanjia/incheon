package Aug23.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//파일인풋스트림
public class IOTest05 {
	public static void main(String[] args) {
		// 파일경로를 주고 해당 파일을 읽어오는 예제
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(
					"C:\\workspace\\Readme.txt");
			fos = new FileOutputStream(
					"C:\\workspace\\Write.txt");
			int data = 0;
			byte[] temp = new byte[5];
			
			while ((data = fis.read(temp)) != -1) {
				fos.write(temp, 0, data);
			}
			//byte[5]배열을 생성해서 파일을 읽고
			//temp 값을 그대로 Write.txt에 씀.
			System.out.println("파일생성완료.");
			
			while ((data = fis.read(temp)) != -1) {
				char c = (char)data;
				fos.write(c);
			}
			fis.close();
			fos.close();//꼭 열어주었으면 닫아주어야 합니다.
			//다음에 그 파일을 못 쓸지도 모릅니다.
			//열어준 순서대로 닫아주세요.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
