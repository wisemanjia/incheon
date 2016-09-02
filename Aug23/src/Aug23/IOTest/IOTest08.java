package Aug23.IOTest;

import java.io.FileWriter;
import java.io.IOException;

//마지막, FileWriter//파일쓰기
public class IOTest08 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("파일명");
			for (int i = 0; i < 11; i++) {
				String data = i+"번째 \r\n";
				fw.write(data);
				//System.out.print(data);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
