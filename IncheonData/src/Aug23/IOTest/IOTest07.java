package Aug23.IOTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//이제서야 IO를 정리합니다.
/*

*/
public class IOTest07 {
	public static void main(String[] args) {
		//파일을 생성하기 위해서는 FileOutputStream
		//객체 생성과 함게 파일의 이름을 기입해줍니다.
		FileOutputStream fos;
		
		try {// IO에서는 자주 보시게 될 예외처리입니다.
			//파일이 없거나, 파일을 못 쓰거나 할 때(예외)
			//처리하기 위함입니다.
			fos = new FileOutputStream(
					"C:\\workspace\\Readme.txt");
			for (int i = 0; i < 10; i++) {
				String data = i +"번째 줄 \r\n"; //확인
				fos.write(data.getBytes());
				//fos스트림을 통해 21번째 줄에 써 있는
				//파일에 직접 쓰기를 함.
			}
			fos.close();
/*중요
FileOutputSteam에 값을 쓸 때는 byte배열로 써야 합니다.
위에 보시면 String을 byte배열로 변환하는 getByte()메소드
를 이용해야만 쉽게 사용가능합니다.
윈도우는 \r\n 줄바꿈 문자 : unix에서는 \n만 있으면 됩니다.

FileWriter를 이용하면 byte배열대신 문자열을 직접
파일에 쓸 수 있습니다.

*/			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// '\'는 반드시 '\\'로 표시해야 정확한 경로로
		//표시됩니다.
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//fos.close();
		//close : 열린 파일 객체를 닫아주는 메소드.
		//자바가 종료될때 열린 파일의 경우 자동으로 닫아준다.
		//하지만 직접 닫아주는 것이 좋다. 열었던 파일을
		//닫지 않고 다시 사용하려고 하면 에러가 나는 경우가 있다.
		
	}

}
