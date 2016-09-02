package Aug23.IOTest;

import java.io.FileWriter;
import java.io.IOException;

//기존 파일에 이어쓰기
public class IOTest09 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("파일명");
			for (int i = 0; i < 10; i++) {
				String data = i + "번째 글";
				fw.write(data);
			}
			fw.close();
			
			FileWriter fw2 = new FileWriter("파일명", true);
			//같은 파일에 이어쓰기 하겠다는 의미. true
			//new FileWriter("파일명", 추가모드 구분자);
			for (int i = 11; i < 21; i++) {
				String data2 = i + "번째 새로은 글";
				fw2.write(data2);
			}
			fw2.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
//FileReader로 파일을 char단위로 읽도록
//변경 한 후에 BufferReader로 감싸면 readLine메소드를 
//사용해서 라인단위로 파일을 읽을 수 있다.
		//BufferdReader br =
		//new BufferdReader(new FileReader("파일명"));
		
		//readLine 메소드는 더이상 읽을 라인이 없는 경우
		//null을 반환한다.
	}

}
