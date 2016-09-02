package Aug22.InterfaceTest;
//슈퍼맨~~~~ 날, 밥도 먹고 힘도세고, 레이저


interface Fly{
	public void fly();
}
interface Eat{
	public void eatThing();
}
interface Lazer{
	public void shoot();
}
interface Man{
	public void withWoman();
}

class Hero{
	public void attack(){
		System.out.println("공격");
	}
	public void depend(){
		System.out.println("막어");
	}
}

class Superman extends Hero implements Fly, Eat, Lazer, Man{

	@Override
	public void fly() {
		System.out.println("날아라 망토");
		
	}

	@Override
	public void withWoman() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatThing() {
		// TODO Auto-generated method stub
		
	}
	
}

class Ironman extends Hero implements Fly, Eat, Lazer, Man{

	@Override
	public void withWoman() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatThing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("점프~");
		
	}
	
}


//메인~~~~~~~~~~~
public class InterfaceTest03 {
	public static void main(String[] args) {
		Superman superman = new Superman();
		superman.attack();
		superman.fly();
		
		Ironman ironman =new Ironman();
		ironman.fly();
	}

}
