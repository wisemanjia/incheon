package Aug23.ExceptionTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//예외
public class ExceptionTest03 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {//예외 발생가능한 코드를 이 곳에
			//파일리더
			fr = new FileReader("c:\\temp\\temp.txt");
			int data;
			while (true) {
				//읽어들인 파일의 내용을 다 읽을때까지
				data = fr.read();//그것을 데이터에 넣어서
				if(data == -1){//-1은 더이상 읽을 것이
					break;//없는 경우에 멈추기 while대응
				}
				System.out.print((char)data);
				//그 문장을 캐릭터 하나하나 출력
				//한글처리는 아직.
			}
		}catch (Exception ee) {//예외 발생시 처리구문
			//e.printStackTrace();//
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			try {
				fr.close();//오픈한 파일리더 닫기.
			} catch (IOException e) {
				e.printStackTrace();//
			}
		}
	}

}
