package Aug16.StarPostion;

public class StarTest01 {
	public static void main(String[] args) {
		// 별찍기
		// 당신은 1~5개까지 별을 찍기를 원합니다.
		/*
		 *
		 **
		 ***
		 ****
		 ***** 이렇게 되게 찍어보겠습니다.
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 1; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		/*
		 * ____*1 ___***3 __*****5 _*******7 9
		 *
		 */
		// 피라미드
		for (int i = 1; i < 10; i+=2) {
			for (int j = i/2; j <= 3 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		/*
		     * 
 		    * *
 		   *   *
 		  *     *
		 *********
		 */
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < (5 + i); j++) {
				
				if (j == (4 - i) || j == (4 + i)
						|| i == 4) {
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	/*
		*5X5
		******
		******
		******
		******
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		/*
		 ******
		 *    *
		 *    *
		 ******
		 */
		System.out.println("---------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i == 4 || j == 0 || j == 4){
					System.out.print("*");					
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
	}//end of main method

}
