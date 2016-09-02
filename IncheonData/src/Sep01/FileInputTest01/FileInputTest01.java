package Sep01.FileInputTest01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

//파일을 읽어와서 필요 데이터 출력하기
/*
아이디는 wisejia입니다.
비밀번호는 Ding020178569입니다.
이메일은 wisejia@nnnnn.com입니다.
*/
public class FileInputTest01 {
	public static void main(String[] args) {
		String name = null;
		String pw = null;
		String email = null;
		String fileName = "c:\\temp\\temp.txt";
		ArrayList<String> als = new ArrayList<String>();

		try {
			BufferedReader br = new BufferedReader(
					new FileReader(fileName));
			String line = "";
			while ((line = br.readLine()) != null) {
				als.add(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

/*		for (int i = 0; i < als.size(); i++) {
			System.out.println(als.get(i));
		}
*/
		
		System.out.println(als.get(0));
		System.out.println(als.get(1));
		System.out.println(als.get(2));
	}

}
