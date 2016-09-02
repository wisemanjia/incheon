package Aug23.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//다시 복습 : 파일 읽어서 화면에 출력하기
public class IOTest06 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(
					"C:\\workspace\\Readme.txt");
			int data = 0;
			while ((data = fis.read()) != -1) {
				char c = (char)data;
				System.out.print(c);
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
