package Sep02.FileOut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

//파일 쓰기
//#스트림들 #write() #예외처리 #close()
//
public class FileOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		String pw = sc.next();
		System.out.print("email : ");
		String email = sc.next();
		
		sc.close();
		
		try {
			FileOutputStream out =
					new FileOutputStream("c:\\temp\\temp1.txt", true);
/*//테스트
			for (int i = 0; i < 10; i++) {
				String data = i+"번 줄입니다. \r\n";
				out.write(data.getBytes());
			}
			//테스트
			 * 
*/			
			String next = "\r\n";
			String subTxt = "id : " + id + next 
							+ "pw : " + pw + next
							+ "email : " + email + next;
			System.out.println(subTxt.getBytes());
			
			//out.write(subTxt.getBytes());
			out.write(subTxt.getBytes(), 0, subTxt.length());
			//file.write(str, 0, str.length());
	        //file.newLine();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
