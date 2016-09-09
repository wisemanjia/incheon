package DateFormat;
//날짜 지정하기
import java.util.Calendar;

public class Date02 {

	public static void main(String[] args) {
		//요일은 1부터 시작하기에 
		final String[] DAY_OF_WEEK
		= {"","일", "월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		//Month는 0부터 시작하기 때문에 -1해야 합니다.
		//date1.set(2005,Calendar.SEPTEMBER, 8);
		date1.set(2025,8,15); //202년 9월 15일
		System.out.println("date1은" 
				+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]
				+"요일");
		System.out.println("date2은"
				+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]
				+"요일");
		
		//두 날짜 사이의 차이를 얻기 위해서는
		//getTimelnMillis()이용해서 천분의 1초 단위로 변환
		long dff = (date1.getTimeInMillis()
				- date2.getTimeInMillis())/1000;
		System.out.println("지금부터 2025년까지: "
				+ dff +"초가 남았습니다.");
		
		//날짜로 계산하기 1일은 24 * 60 * 60
		System.out.println("일로 계산하면 "
					+ dff/(24*60*60) + "일 남았습니다.");
	}

}

