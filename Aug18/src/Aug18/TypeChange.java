package Aug18;
import java.util.Vector;

//그동안 못 했던 것 정리 : 타입변환
public class TypeChange {
	public static void main(String[] args) {
		//number type to String
		int a = 10;
		String str = a+""; //문자열 + 수치형 = 문자열
		System.out.println(10+","+a); //10,10
		str = String.valueOf(a);
		//String to number Type
		str = "365";
		a = Integer.parseInt(str);
		a = Integer.valueOf(str).intValue();
		Long l = Long.parseLong(str);
		l = Long.valueOf(str).longValue();
		double d = Double.parseDouble(str);
		d = Double.valueOf(str).doubleValue();
		//etc
		//float to int
		float f = 3.14195F;
		long ll = 365L;
		
		int fi = (int) f;
		//int to double
		double dd = fi;//공부해주세요~~~ 중요합니다.
		int di = (int) dd;
		
		//number to String
		int ai = 134;
		String ss = String.valueOf(ai);
		ss = Integer.toString(ai);
		ss = ""+ai;
		
		//String to number
		ai = Integer.parseInt(ss);
		l = Long.parseUnsignedLong(ss);
		d = Double.valueOf(ss).doubleValue();
		Byte.parseByte(ss);
		Short.parseShort(ss);
		//작은 타입 -> 큰타입
		//큰타입 -> 작은 타입
		//int~~double~~~
	}

}
