package Aug22.Polymorphism;
//앞과 연결되니 같은 패키지에 넣어주세요.

public class Polymorphism02 {
	public static Hero callHero(String spot){
		//활동하는 범위, 땅, 바다, 하늘, ....
		//
		if(spot.equals("바다")){
			return new Spiderman();
		}else if(spot.equals("땅")){
			return new Hulk();
		}else{
			//하늘
			return new Ironman();
		}
	}
	
	public static void main(String[] args) {
		Hero hero = callHero("하늘");
		Hero h2 = callHero("바다");
		hero.attack();
		h2.attack();
	}

}
