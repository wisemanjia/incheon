package Wrapper;
//Wrapper����Ŭ����
/*
�ڹ���  PType�����͸� Ŭ������ ���� �� ����
�� Ŭ������ PType �����Ͱ� �ʿ信 ���� ��üȭ �ǰų�
��üȭ �� PType�� ������ Ptype���� �� ��ȯ�� ��,
�� PType�� �������� �� �� ���� ����մϴ�.
����� ���� ���̴� ���ø� �� �ƽǰ̴ϴ�.
#�ڽ�, #��ڽ�, #����, #1.5, #PŸ��, #�̳༮����ü


�⺻Ÿ�� Wrapper Class
int			Integer
double		Double
float		Float
byte		Byte
short		Short
long		Long
boolean		Boolean
char		Character
void		Void

*/
public class Wrapper01 {
	static void doSome1(int v) {
		Integer i = Integer.valueOf(v + 1);
		System.out.println("doSome1 : " + i);
	}
	
	static int doSome2(){
		return new Integer(1).intValue();
	}
	
	static Integer doSome3(int i){
		return i;		 
	}
	
	
	public static void main(String[] args) {
		int i = 1;
		Integer in = new Integer(i);
		//int i�� �� 1�� �̾Ƴ���
		//�װ��� ��Ƽ��Ÿ���� in�� �����ϱ� 
		System.out.println(in);//?
		int i2 = in;
		System.out.println(i2);
		System.out.println(i2 + in + i);
		doSome1(in.intValue());
		
		Integer in2 = Integer.valueOf(doSome2());
		
		int i3 = doSome3(new Integer(10));
		
		Integer in3 = new Integer(i);
		String s =  in3.toString(); //���ڿ� ������ 1 -> 1
		i = Integer.parseInt(s);
		//Auto Boxing
		/*JDK 1.5�������� �����Ǵ� �����Դϴ�.
		 * ��� PType�� �ڵ����� Wrapper�� �����Ǵ� ����
		 * 
		 *Auto UnBoxing
		 *��� Wrapper Ŭ������ ���� ���ԵǴ� PType�� ������ �°�
		 *�ڵ����� ���� ����Ǵ� ����		
		*/
	}

}




