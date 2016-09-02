package Aug23.IOTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//복습 : 이번에는 파일 직접 불러오기
public class IOTest04 {
	public static void main(String[] args) {
		//FileReader : 파일을 불러오는 변수
		//불러온 파일을 보여주는 BufferedReader 변수
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Temp\\temp.txt");
			br = new BufferedReader(fr);
			String line = null;
			//문자열을 이어서 한 객체제 넣어두고 출력하기
			//위해서 스트링버퍼를 만듬 : 
			StringBuffer sb = new StringBuffer();
			//라인에다가 br.의 한 줄을 읽어서 저장할것인데
			//더이상 저장할 것이 없으면 while문 멈춤.
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				sb.append(line + "\n");
				System.out.println(sb);
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
