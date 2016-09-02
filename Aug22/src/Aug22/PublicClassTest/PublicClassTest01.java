//번외: 클래스 작성시 어떤 클래스에 public을 붙여줘야 함?
//그럼 왜 파일이름과 public 클래스 명을 맞춰야 할까?
// 가독성 : 자바 파일 안에 많은 클래스를 정의할 때 
//하나의 대표 클래스를 지정하고 파일명과 동일하게
//맞추는 것이 가독성에 도움이 됨.
//(사람이) 소스코드를 읽을 때, public키워드가 붙은 class
//를 보게 된다면 현재 소스가 어떤 자바파일이름으로
//되어있는지 찾을 수 있다. 
//= public이 없는 것은 자바파일명과 동일한 class가 아니다.

package Aug22.PublicClassTest;

public class PublicClassTest01 {
	public static void main(String[] args) {
		System.out.println("test01");
	}
}

class PublicClassTest02{
	public static void main(String[] args) {
		System.out.println("이것은 test02");
	}
}
