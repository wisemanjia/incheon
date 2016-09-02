package Aug30.StringTest;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

//String스트링 : 독특한 녀석
//키워드 : #불변, #주소값, #문자열, #나누기, #활용하기, #GC
/*
이 String은 문자열을 담을 수 있는 참조형 습니다.
하지만 특이점도 많으니 많은 사이트를 확인하시기 바랍니다.

""를 이용한 String 객체 생성식의 특징 확인
""의 값을 기준으로 인스턴스 생성
값이 같으면 같은 값을 가진 기존 인스턴스의 Ref를 리턴
*/
public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "Hi";
		String str2 = "Hi";
		//같은 객체인지 비교해보기
		if(str1 == str2){
			System.out.println("같은 객체 입니다. 값도 같겠죠.");
		}else{
			System.out.println("다른 객체입니다. 값도 다르겠죠.");
		}
		//생성자를 이용해서 만들기
		String str3 = new String("Hi"); //같은 hi값인데
		String str4 = new String("Hi"); //서로 다르다고 합니다.
		
		if(str3 == str4){
			System.out.println("=");
		}else{
			System.out.println("=/=");
		}
		
		
		byte[] bite = {64,65,67,68,69,95};
		String biteS = new String(bite);
		System.out.println(biteS);
		
		String str5 = new String(bite,2,3);//bite의 2부터 3개 복사
		System.out.println(str5);
		
		char[] chr = {'가','A','a', 25300};
		String chrS = new String(chr);
		System.out.println(chrS);
		
		String str6 = new String(chr, 0,2);//chr의 0부터 2개 복사
		System.out.println(str6);
		
		//문자열의 길이, 자르기, 시작.....
		System.out.println(str6.length());//숫자반환 = 길이
		String str7 = new String("가나다라마바사아");
		System.out.println(str7.length());
		
		String str8 = "abcdbeffghickibnhqokhbjknoj";
		//charAt();
		System.out.println(str8.charAt(0)); //0번의 글자 반환
		
		//문제, 그럼 str8의 맨 마지막 글자를 뽑아주세요.
		System.out.println(str8.length());
		System.out.println(str8.charAt(str8.length()-1));
		
		//a부터j까지 화면에 다 찍어주세요 단, 한글자 찍고 엔터
		for (int i = 0; i < str8.length(); i++) {
			System.out.println(str8.charAt(i));
		}
		
		String str9 = "aabaadbasdfsfdsasbsbabbddabsa";
		//str9의 값을 하나하나 비교해서 a가 몇 개 있는지 출력
		//for / if / 변수 / 출력문 //char '' String ""
		int count = 0;
		//문자열의 길이만큼 반복
		for (int i = 0; i < str9.length(); i++) {
			//System.out.println(str9.charAt(i));//이 문장은 다 찍기
			//여기서 a라면 카운트 시키는 문장 필요
			if (str9.charAt(i) == 'a') {//a와 비교문 필요				
				//a가 발견되면 카운트 +1하기
				count++;
			}
		}
		//출력문
		System.out.println("a의 갯수는 : " + count);
		
		String str10 = "윤승현";
		//이 '윤'이라는 문자가 유니코드로 몇일까? : 16진법
		//16진법은? 0 1 2 3 4 5 6 7 8 9 A B C D E F
		System.out.println(
				Integer.toHexString(str10.codePointAt(0)));
		
		String str11 = str10.concat("님");
		System.out.println(str11);
		//str11 특정 글자를 포함하고 있는지~contains
		if(str11.contains("님")){
			System.out.println("포함하고 있습니다.");
		}else{
			System.out.println("없습니다.");
		}
		
		//copyValueOf();
		char[] arr = {'이','런','차','신'};
		String str12 = String.copyValueOf(arr);
		System.out.println(str12);
		
		
		//endsWith(); ~으로 끝나는지 검사
		String email = "wisejia@wiejia.net";
		if(email.endsWith(".com") || email.endsWith(".net")){
			System.out.println(".com으로 끝납니다.");
		}else{
			System.out.println(".com이 아닙니다.");
		}
		
		//.equalsIgnoreCase();
		String str13 = "abc";
		String str14 = new String("ABC");
		
		if(str13.equalsIgnoreCase(str14)){ //#equals
			//다른 두개의 문자열의 값이 같은지를 비교 #다른객체
			//같으면 true다르면 false를 리턴합니다.
			System.out.println("다른 객체지만 값이 같습니다.");
		}else{
			System.out.println("다른 객체이며 값이 다릅니다.");
		}
		
		//Stirng을 byte배열로 바꾸기 .getBytes();
		String str15 = "가나다라마바사";
		byte[] str15Arr = str15.getBytes();
		System.out.println(Arrays.toString(str15Arr));
		
		String dCode = new String(str15Arr);
		System.out.println(dCode);
		
		byte[] what = {-22, -80, -128, -21, -126, -104, -21, -117, -92, -21, -99};
		System.out.println(new String(what));
		System.out.println("===================================");
		try {
			byte[] b3 = str15.getBytes("ISO-8859-1");
			System.out.println(Arrays.toString(b3));
			System.out.println(new String(b3,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// UTF-8과 EUC-KR차이점 아스키코드 유니코드. 언어Set
			e.printStackTrace();
		}
		
		
		//특정문자가 몇 번째 인덱스에 있는지 인덱스 값 리턴=길이
		String str16 = "abcd";
		int ind = str16.indexOf('b');
		int ind2 = str16.indexOf("b");
		System.out.println(ind);
		System.out.println(ind2);
		
		//파라미터가 두개?
		int ind3 = str9.indexOf('b', str9.indexOf('b') + 1);
		System.out.println("두번째 b의 인덱스" + ind3);
		
		//이메일 판별하기
		//ID@서버주소 @ = at
		email = "wisejia@naver.com";
		if(email.indexOf('@') == -1){
			//at이 없다?
			System.out.println("@가 없는 이메일 형식입니다.");
		}else{
			//id길이 제한이 있다면 5~10자 사이임을 증명해야 합니다.
			String server = email.substring(email.indexOf('@')+1);
			String id = email.substring(0, email.indexOf('@'));
			System.out.println(id);
			System.out.println(server);
		}
		
		
		System.out.println("==================");
		String str17 = " a " + " a ";
		
		//이번에는 트림 : 공백제거 //TrimStart, TrimEnd
		str17 = " a  a ";
		str17 = str17.trim();
		System.out.println(str17);
		
		str17 = str17.replace('a', 'b'); //문자 치환하기 replace();
		System.out.println(str17);
		
		str17 = str17.toUpperCase(); //대문자로 변환하기
		str17 = str17.toLowerCase(); //소문자로 변환하기
		//.equals(); 값이 동일한지 확인하기
		
		//join용법
		ArrayList<String> strings = new ArrayList<String>();
	     strings.add("Java");strings.add("is");
	     strings.add("cool"); 
		String message = String.join(" ", strings);
		System.out.println(message);
		
		int in = 1;
		//1이 일로 스트링에 들어간 모습입니다.
		String value = String.valueOf(in);
		//그 일을 1로 뽑아서 2와 더해서 int2에 저장합니다.
		int in2 = Integer.parseInt(value) + 2;
		//출력합니다.
		System.out.println(in2);
		
		
		
		
	}
}







