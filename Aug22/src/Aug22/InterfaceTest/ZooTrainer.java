package Aug22.InterfaceTest;

public class ZooTrainer {
	public void feed(Predetor predetor) {
		System.out.println("feed" + predetor.getName());
	}

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.setName("티거");
		Lion lion = new Lion();
		lion.setName("사자");
		Dog dog = new Dog();
		dog.setName("푸");
		Leopard leopard = new Leopard();
		leopard.setName("표범");
		
		ZooTrainer trainer = new ZooTrainer();
		trainer.feed(leopard);
		trainer.feed(dog);
		trainer.feed(lion);
		trainer.feed(tiger);
	}
}
