package Aug19.Cals;
//이젠 객체지향으로 만들어보기
//환자
//간호사가 있고
//조무사// 요양사??
//환자(객체), 간호사(객체)
//환자 :정보 ; 이름, 키, 몸무게,
//		기능 : 정보주는 행동
//
//간호사 : 정보 : 표준체중, 비만도, 결과값
//			기능 : 환자정보받기
//					계산하기
//					결과 말해주기



import java.util.Scanner;
//간호사 만들기
class Nurse {
	String p_name;
	double p_height;
	double p_weight;
	double p_stdWeight;
	double p_biManDo;
	
	public void stdCheck(){//표준체중 : (키-100)*0.9
		p_stdWeight = (p_height - 100)*0.9;
	}
	
	public void biManDoCheck(){//비만도 ((실체중-표준체중)/표준체중) * 100
		p_biManDo = ((p_weight - p_stdWeight)/p_stdWeight) * 100;
	}
	
	public void sayResult(){
		//비만도 범위 		//30이상 : 비만
		//20이하 허약 		//그 중간이 정상
		
		//표준체중 : 70 		//비만도 : 100
		//누구누님 당신은 정상입니다.
		System.out.printf("표준체중 : %3.2f \n",p_stdWeight);
		System.out.printf("비 만 도 : %3.2f \n",p_biManDo);
		System.out.printf(" %s님은 ", p_name);
		
		if(p_biManDo > 30){
			System.out.println("비만이십니다.");
		}else if(p_biManDo > 20){
			System.out.println("마르셨습니다.");
		}else{
			System.out.println("정상이십니다.");
		}
		
	}
}

//환자 만들기
class Patient{
	String name;
	double height;
	double weight;
	
	public void sayInfo(){
		System.out.println("저.... 저는" + name
				+ " 이고요, 키는 "+ height
				+ " 몸무게는 "+ weight + " 입니다.");
	}
}

public class Mommugea02 {
	public static void main(String[] args) {
		//환자 객체 만들고
		Patient kim = new Patient();
		//간호사 객체 만들고
		Nurse lee = new Nurse();
		//간호사가 환자의 정보받기
		//kim.sayInfo();
		//간호사가 계산
		lee.p_name = "KimSi";
		lee.p_height = 170.0;
		lee.p_weight = 65.0;
		//간호사가 결과 알려주는 것
		lee.stdCheck();
		lee.biManDoCheck();
		lee.sayResult();
	}
}
