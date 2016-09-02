package Aug12.Random;

public class RandomTest04 {
public static void main(String[] args) {
	int ra = (int) ((Math.random()*89) + 10);

	
	for (int i = 0; i < 100; i++) {
		System.out.println((int)(Math.random()*89) + 10);
	}
}
}
