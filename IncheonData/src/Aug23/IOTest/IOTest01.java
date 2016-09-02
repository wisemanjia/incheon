package Aug23.IOTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

////////////////자바 입출력//////////////////
//외부연결
//어떤 통로로 할거야?
//어떻게 주고 받을거?
//null값 알기
//Stream이 뭐지?
public class IOTest01 {
	public static void main(String[] args) {
		//바이트(?) 배열 만들고 byte를 읽는 예
		byte[] input = {1,3,5,7,9,12,15,18,21};
		byte[] output = null; //null 널, 널값
		//int = 0, double = 0.0 String= null
		//아무값도 없는 값, 객체에서 초기값으로(?)
		// 0 != null
		/*
		 * Human human;
		human = new Human();
		*/
		//인풋 통로 생성
		ByteArrayInputStream bais = null;
		bais = new ByteArrayInputStream(input);
		//아웃풋 통로 생성
		ByteArrayOutputStream baos = null;
		baos = new ByteArrayOutputStream();
		
		int data = 0;//읽거나 쓰는 바이트를 담을 변수
		//읽은 data를 검사해서 -1이면 read()중지하기
		//-1은 더이상 읽을 값이 없다는 반환값
		//스트림에서 하나의 바이트를 읽는 대표적 메서드
		//read()
		//read()는 읽은 바이트의 값을 정수(int)로 리턴
		//만약 스트림에서 읽은 바이트가 없을 때는 -1
		
		/*while ((data = bais.read()) != -1) {
			//인풋으로 읽어서 읽을 데이터가 있다면(!-1)
			//data에 저장하기
			baos.write(data);
			//data에 저장된 내용을 baos에 쓰기
		}*/
		while (true) {
			data = bais.read();
			if(data == -1){
				break;
			}
			baos.write(data);
		}
		//배열output에 쓰기 ; baos에 들어있는 값을
		//toByteArray();메소드를 통해 쓰기 : 
		//이 것은 바이트 배열로 바꿔주는 녀석.
		output = baos.toByteArray();
		//출력해보기
		//직접 해보세요.
		System.out.println("input : " + Arrays.toString(input));
		System.out.println("output : " + Arrays.toString(output));
		//java.util.Arrays는 배열에 필요한 메소드들이 들어있습니다.
		//toS~는 배열을 바로 문자열로 변환하여 출력하게끔 도와줍니다.
		
	}
	

}
