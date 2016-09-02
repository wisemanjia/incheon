package Aug17.ArrayTest;

public class ArrayTest05 {
	public static void main(String[] args) {
		int[ ][ ] multiArr01 = new int[3][3]; 

		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				multiArr01[i][0] = (int) (Math.random()*9+1);
				multiArr01[i][1] = (int) (Math.random()*9+1);
				multiArr01[i][2] = (int) (Math.random()*9+1);
				
				multiArr01[j][0] = (int) (Math.random()*9+1);
				multiArr01[j][1] = (int) (Math.random()*9+1);
				multiArr01[j][2] = (int) (Math.random()*9+1);
			
				int temp = 0;
			
				if (multiArr01[i][0] == multiArr01[j][0] || multiArr01[i][1] == multiArr01[j][1] || multiArr01[i][2] == multiArr01[j][2] ) {
		
					temp = multiArr01[i][0] ;
					multiArr01[i][0] = multiArr01[i][1];
					
					temp = multiArr01[j][0] ;
					multiArr01[j][0] = multiArr01[j][1];
					
					temp = multiArr01[i][1];
					multiArr01[i][1] = multiArr01[i][2];	
					multiArr01[i][2] = temp;	
					
					temp = multiArr01[j][1] ;
					multiArr01[j][1] = multiArr01[j][2];
					multiArr01[i][2] = temp;			
				} else { 
					}			
				}	
		}
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				System.out.print(multiArr01[i][j] + " , " );			
			}					
			System.out.println(" ");
		}		
	}
}