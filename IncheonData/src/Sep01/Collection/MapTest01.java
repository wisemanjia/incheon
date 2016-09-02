package Sep01.Collection;

import java.util.HashMap;
import java.util.Iterator;

//collection Map : 키와 데이터를 같이 저장
//키는 데이터의 성격을 설명해주는 값
//키는 중복된 값이 입력될 수 없다.

//#KeyValue #사전 #중복X #검색 #어디다가쓰지? #HashMap
//iterator
//put, get, remove
public class MapTest01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "alpa");// 스트링, 스트링
		// 키값 , 벨류값
		map.put("b", "brabo");
		map.put("c", "charry");
		map.put("d", "delta");
		map.put("e", "elf");
		map.put("f", "fox");
		map.put("g", "golf");
		map.put("h", "hotel");
		map.put("i", "등등등");// 9개 입력
		map.put("a", "apple");// a를 다시 입력했습니다.

		// size()사이즈 뽑아보시고
		map.size();
		// get() 번지수로 값 뽑아보시고
		map.get("a"); // 키를 알면 그 값을 뽑을 수 있습니다.

		// iterator로 모두 뽑아보기
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(
					"key[" + key + "], value [" + value+"]");
		}

		
		//사용자가 5개의 키와 벨류를 입력할 수 있게 합니다.
		가 : ㄹㅇㄴㅁㄹㅇㄴㅁ
		나 : ㄹㅇㄴㅁㄹㅇㄴㅁ
		다 : ㅎㄹㅇㄴㅁㄹㅇㄴ
		라 : ㅇㄴㅁㄹㅇㄴ
		하 : ㄹㅇㄴㅁㄹㅇㅁㄴㄹ
		
		출력
		=============================================
		사용자 > 가(엔터)
		가의 벨류값을 볼 수 있게
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
