package pack05_referencedatatype.sec01_array.EX08_2DNonSquareArrayDefinition;

public class EX08_2DNonSquareArrayDefinition {
	public static void main(String[] args) {
		
		//#1. 비정방 배열의 선언 방법 1
		int[][] array1 = new int[2][];
		
		array1[0]=new int[2];
		array1[0][0]=1; array1[0][1]=2;
		
		array1[1]=new int[3];
		array1[1][0]=3; array1[1][1]=4; array1[1][2]=5;
		
		
		int array2[][] = new int[2][];
		array2[0]=new int[] {1,2}; 		// array2[0]= {1,2} 불가능
		array2[1]=new int[] {3,4,5};	// array2[1]= {3,4,5} 불가능
	
		
		//#2. 비정방 배열의 선언 방법 2
		int[][] array3 = new int[][] {{1,2},{3,4,5}};
		
		int[][] array4;
		array4 = new int[][] {{1,2},{3,4,5}};
		
		
		//#3. 비정방 배열의 선언 방법 3
		int[][] array5 = {{1,2},{3,4,5}};
		//int[][] array6;
		//array6 = {{1,2},{3,4,5}}; //오류
						
	}
}
