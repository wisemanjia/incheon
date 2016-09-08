package Wrapper;
/*
Wrapper? AutoBoxing?
Java�� �����͸� Ŭ������ ��ü �ܿ� 
(int, double, char �� boolean�� ����) ���� Ÿ���� ������.
���� Java������ �⺻�� Ÿ�԰� ��ü ���� ���� 
�ΰ��� Ÿ���� ���� �����͸� ������ �ȴ�. 
���� ��� �����͸� ������ ��, �⺻�� Ÿ���� ������ 
������ �� �ְ�, �پ��� ��ü���� ������ �� �ִ� �����̳� ������
 �ϴ� ��ü�� ������ ���� �ִ�.
�׷��� � ��Ȳ������ �⺻�� Ÿ���� ��ü�� 
����ؾ� �ϴ� ��찡 �ִ�. �̷��� ��쿡 �⺻�� Ÿ�� ����
 ��ü�� ������ �ʿ䰡 �ִ�.
���� Ŭ����(wrapper class)�� Ư�� �⺻�� Ÿ���� ��Ÿ����.
 ���� ��� Integer Ŭ������ ������ ���� ���� ��Ÿ����.
Integer Ŭ�����κ��� ������ ��ü�� �ϳ��� int ����
 ������ �� �ִ�. Wrapper class�� �����ڴ� ������ 
 �⺻�� Ÿ�� ���� �޴´�.
Integer age = new Integer(30);
Double avg = new  Double("3.145");
Integer �������� ��ü�� ����Ǹ� age ��ü�� ���� 30��
 ��ü�� ��Ÿ���� �⺻�� Ÿ���� �ƴ� ��ü�� �ʿ��� ����
  ���� �� �ִ�.
Java�� �� ���� Ÿ�Կ� ���� Java Ŭ���� ���̺귯�� ����
 �����Ǵ� wrapper class�� �����Ѵ�. 
 ��� wrapper class�� java.lang ��Ű���� ���ǵȴ�.
* Java Ŭ���� ���̺귯���� wrapper class

�⺻�� Ÿ��	wrapper class 
byte  			Byte 
short 			Short 
int 			Integer 
long 			Long 
float 			Float 
double 			Double 
char 			Charater 
boolean 		Boolean 
void 			Void 

void Ÿ���� ��Ÿ���� wrapper class �� �����ϴ� ���� �� �� �ִ�.
�׷��� �ٸ� wrapper class�� �޸� void Ŭ������ 
��üȭ�� �� ������ ���� �� ���� ������ ��Ÿ����.


* Boxing �� UnBoxing

Wrapper Ŭ������ ��������� ���� ���ǵ� Ŭ������ �ƴϱ� ������,
 �� Ŭ������ �ν��Ͻ��� ����� ���� ������ �Ұ����ϸ�, 
 ���� �����ϴ� ���ο� ��ü�� ���� �� ������ �����ϴ�.

- Boxing : �⺻ �ڷ����� Wrapper Ŭ������ ��ü�� �����ϴ� ����
ex) Integer age = new Integer(30);
- Unboxing : ������ ��ü�� �⺻ �ڷ������� ����/����ϴ� ����
ex) int age2 = age.intValue();


* AutoBoxing, AutoUnBoxing
JDK 1.5 ���� ���Ŀ��� �ڵ����� Boxing�� UnBoxing��
 ó���ϵ��� AutoBoxing �� AutoUnBoxing�� ����

- AutoBoxing
Integer obj = 61;
���� 61�� Integer ��ü�� �ֱ� ���ؼ���
(Boxing) new Integer(61) �� ���� ��ü�� �����ؾ� ������, 
���� ���� �����ϸ� AutoBoxing�� �ڵ����� ����ȴ�.

- AutoUnBoxing
Integer obj2 = new Integer(69);
int num1 = obj2;

Integer ��ü�� �ִ� int ���� �������� ���ؼ���(UnBoxing)
obj2.intValue() �޼ҵ带 ����Ͽ� �����;� ������, 
���� ���� int �� ������ Integer ��ü�� �����ϸ� 
�ڵ����� UnBoxing�� ����ȴ�.


AutoBoxing�� AutoUnBoxing �� ���� �⺻�� Ÿ�԰� �����ϴ� 
Wrapper class���� �Ͼ��. �ٸ� ��쿡 ������ �õ��ϸ� 
������ ������ �߻��Ѵ�.
- Integer�� intValue(), Double�� doubleValue() � 
AutoBoxing�� AutoUnBoxing�� �߻��Ѵ�.

ex> Double obj = 3.14;
      int num1 = obj.intValue() ;   (O)
 int num1 = obj;                   (X)


* Wrapper Ŭ������ �⺻ �޼ҵ��

�޼ҵ�			��ȯ�� 		���� 
booleanValue()	boolean		�⺻�� �����͸� ���ڿ��� 
							�ٲ� �ڿ� ��ȯ 
byteValue()		byte		��ü�� ���� byte ������ ��ȯ 
doubleValue()	double		��ü�� ���� double ������ ��ȯ 
floatValue() 	float		��ü�� ���� float ������ ��ȯ 
intValue()		int			��ü�� ���� int ������ ��ȯ 
longValue() 	long		��ü�� ���� long ������ ��ȯ 
shortValue()	short		��ü�� ���� short ������ ��ȯ 

Wrapper class ��ü���� �ش� �޼ҵ带 ����� ����ȯ��
������ �޼ҵ常 ����� �����ϴ�.
 */
public class Wrapper01 {

	public static void main(String[] args) {

	}

}
