package Wrapper;
//Wrapper래퍼클래스
/*
자바의  PType데이터를 클래스로 정의 한 형태
이 클래스는 PType 데이터가 필요에 따라서 객체화 되거나
객체화 된 PType의 값들을 Ptype으로 재 변환할 때,
각 PType의 정보들을 얻어낼 때 많이 사용합니다.
어렵지 않은 것이니 보시면 다 아실겁니다.
#박싱, #언박싱, #오토, #1.5, #P타입, #이녀석도객체


기본타입 Wrapper Class
int			Integer
double		Double
float		Float
byte		Byte
short		Short
long		Long
boolean		Boolean
char		Character
void		Void

*/
public class Wrapper01 {
	static void doSome1(int v) {
		Integer i = Integer.valueOf(v + 1);
		System.out.println("doSome1 : " + i);
	}
	
	static int doSome2(){
		return new Integer(1).intValue();
	}
	
	static Integer doSome3(int i){
		return i;		 
	}
	
	
	public static void main(String[] args) {
		int i = 1;
		Integer in = new Integer(i);
		//int i의 값 1을 뽑아내서
		//그것을 인티저타입의 in에 저장하기 
		System.out.println(in);//?
		int i2 = in;
		System.out.println(i2);
		System.out.println(i2 + in + i);
		doSome1(in.intValue());
		
		Integer in2 = Integer.valueOf(doSome2());
		
		int i3 = doSome3(new Integer(10));
		
		Integer in3 = new Integer(i);
		String s =  in3.toString(); //문자열 값으로 1 -> 1
		i = Integer.parseInt(s);
		//Auto Boxing
		/*JDK 1.5버전부터 제공되는 개념입니다.
		 * 모든 PType은 자동으로 Wrapper로 변형되는 형태
		 * 
		 *Auto UnBoxing
		 *모든 Wrapper 클래스의 값은 대입되는 PType의 변수에 맞게
		 *자동으로 값이 추출되는 개념		
		*/
	}

}




