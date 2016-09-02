package Aug19.JINI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//단어입력 응대하기
//안녕 -> 안녕에 관련된 응대문 랜덤화
//시간 -> 현 시간 출력
//그외 질문 -> 이해할 수 없습니다. 출력 
//무한 입력받기
//안녕(잘자, 이제그만, 꺼져,)입력시 응대문 랜덤 출력/탈출
public class jiniMake {

	public static void main(String[] args) {
		JINI s = new JINI();
		Scanner sc = new Scanner(System.in);
		System.out.println("JINI를 시작합니다. TTS를 연결하세요.");
		System.out.println("명령어> 안녕/날짜/이름/시간/나가기");

		while (s.isQute) {
			System.out.print("질문> ");
			String result = sc.next();
			s.scheck(result);
		}
		sc.close();
	}
}
