package Sep01.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Collection Set
//#set개념 #ListSetMap #Collection #무작위 #중복X #fhEhaksemfrl
//#그래서HashSet
/*
HashSet을 생성하고 set인터페이스의 add메소드를 사용하여 이름추가
중복을 허용하지 않음을 확인해주세요.
사용법은 List와 흡사합니다. ㅠㅠ
*/
public class SetTest {
	public static void main(String[] args) {
		//set만들기
		//Set set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		//빵집
		set.add("식빵");//식빵 = 스트링 = 입력방법은?
		set.add("팥빵");
		set.add("크림빵");
		set.add("소라빵");
		set.add("초코빵");
		set.add("생일빵");
		set.add("선빵");
		set.add("죽빵");
		set.add("식빵");
		set.add("팥빵"); //10
		
		//출력
		System.out.println(set);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("식빵");//식빵 = 스트링 = 입력방법은?
		al.add("팥빵");
		al.add("크림빵");
		al.add("소라빵");
		al.add("초코빵");
		al.add("생일빵");
		al.add("선빵");
		al.add("죽빵");
		al.add("식빵");
		al.add("팥빵");//10
		
	System.out.println(al);
	
	//iterator //set은 순서가 없다???
	//iterator 변환
	Iterator<String> it = set.iterator();
	while (it.hasNext()) { //값이 있으면 참, 없으면 거짓
		System.out.print(it.next()+", ");
	}
	
	//////////////////////로또 뽑기
	HashSet<Integer> lotto = new HashSet<Integer>();
	
	//사이즈가 6이 되면 멈추게 하시면 됩니다.
	while (lotto.size()< 6) {
		lotto.add((int)(Math.random()*45 + 1));
		//랜덤 0~44 1~45
	}
	System.out.println(lotto);
		
		
	}
}
