package Aug17.ArrayTest;

public class ArrayTest04 {
	public static void main(String[] args) {
		int[][] arr2 = new int[3][3];
		int[] arr1 = new int[9];  
		arr1[0] = (int)(Math.random() * 9 + 1);
		
		for(int i = 1; i < arr1.length; i++){
			while(true){
				int rndNum = (int)(Math.random() * 9 + 1);
				boolean isUnique = true;
				for(int j = 0; j < i; j++){
					if(arr1[j] == rndNum){
						isUnique = false;
						break;
					} 
				}
				
				if(isUnique){
					arr1[i] = rndNum;
					break;
				}
			}
		}
		
		// for(int in : arr1) System.out.println(in);
		
		System.out.println();
		int nowIdx = 0;
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[i].length; j++){
				arr2[i][j] = arr1[nowIdx++];
				System.out.print(arr2[i][j] + "\t");				
			}
			System.out.println();
			System.out.println();
		}
	}
}
