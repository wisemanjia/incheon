package Aug11.For;

public class ForTest05 {

	public static void main(String[] args) {
		//Fizz =3 Buzz = 5,  fizzbuzz = 15
		//1,2,fizz,4,buzz,fizz,7,8,fizz,buzz
		for (int i = 1; i <= 100; i++) {
			//가장 많이 걸릴 조건문을 가장 상위에
			//배치하여 하위로 내려가는 데이터를
			//최소화 한다.
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz!");
			}else if(i % 3 == 0){
				System.out.print("fizz");
			}else if(i % 5 == 0){
				System.out.print("buzz");
			}else{
				System.out.print(i);
			}
			System.out.print(", ");
		}

	}

}
