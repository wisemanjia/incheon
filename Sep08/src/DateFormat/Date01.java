package DateFormat;

import java.util.Calendar;

//date라고 쓰고 Calendar
public class Date01 {
	/**이건 문서입니다.]
	 * 자 이제부터 이 클래스(객체)를 호출하려면 
	 * toString();을 호출하면 무슨 일이 일어납니다.*/
	public static void main(String[] args) {
		// 기본적으로 현재 날짜와 시간으로 설정
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 년도 : "
					+ today.get(Calendar.YEAR));
		System.out.println("이 번 월은 : "
				+ today.get(Calendar.MONTH));
		//0~11 // +1 0월부터 시작합니다. 그래서 1월은 0월
		System.out.println("이 해의 몇 번째 주? : "
				+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 번째 주? : "
				+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 며칠 : " 
				+ today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : "
				+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : "
				+ today.get(Calendar.DAY_OF_YEAR));
		//요일
		System.out.println("요일 : "
		+ today.get(Calendar.DAY_OF_WEEK));
		//1일 2월 3화 4수 5목 6금 7토
		
		System.out.println("이달의 몇 째 요일"
				+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//오전0 오후1
		System.out.println("오전 오후" + today.get(Calendar.AM_PM));
		
		//시간
		System.out.println("시간" + today.get(Calendar.HOUR));//12
		System.out.println("시간" + today.get(Calendar.HOUR_OF_DAY));//24
		//분0~59
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		//초0~59
		System.out.println("초 : " + today.get(Calendar.SECOND));
		//초 : 천분의 1초
		System.out.println("1/1000sec : " +today.get(Calendar.MILLISECOND));
		//천분의 1초를 시간으로 표시하기 위해서 3600000으로 나눔
		//1시간은 60분 * 60초
		// = Timezone (-12 ~ +12)
		System.out.println("타임존" + today.get(Calendar.ZONE_OFFSET));
		
		//이 달의 마지막날
		System.out.println("마지막 날 : "
		+ today.getActualMaximum(Calendar.DATE));
		
		
		//오늘날짜 : 연도 - 월 - 일 - 요일 - 오전/오후 - 시간 - 분 - 초
		System.out.println(
				"2016 - 09 - 08 - 목요일 - 오전 - 11시 - 37분 - 11초");
		 
		
		
		
		
		
	}

}
