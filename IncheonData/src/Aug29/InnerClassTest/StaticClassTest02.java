package Aug29.InnerClassTest;

class Test{
	int a = 10;
	
	static class Joo{
		int b = 20;
		static int c = 30;
		public void joo(){
			System.out.println("joo is static Class");
		}
	}
}
public class StaticClassTest02 {
	public static void main(String[] args) {
		Test.Joo joo = new Test.Joo();
		joo.joo();
		System.out.println("Static Member c : "
							+ Test.Joo.c);
	}
}
