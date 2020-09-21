package pack05_referencedatatype.sec01_array.EX09_ReadArrayData_2D;

/*2차원 배열의 원소값 출력*/

public class EX09_ReadArrayData_2D {
	
	public static void main(String[] args) {		
		//#1. 2차원 배열의 길이 구하기 (length)
		//@1-1. 정방행렬
		int[][] array1 = new int[2][3];
		System.out.println(array1.length); //2
		System.out.println(array1[0].length); //3
		System.out.println(array1[1].length); //3
		
		System.out.println();
		
		//@1-2. 비정방행렬
		int[][] array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length); //2
		System.out.println(array2[0].length); //2
		System.out.println(array2[1].length); //3
		
		System.out.println();
		
		//#2. 출력방법1. 배열 하나씩 출력하기		
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[1][2]);		
		System.out.println();		
		
		//#3. 출력방법2. for 반복문으로 출력하기
		for(int i=0; i<array2.length; i++)
			for(int j=0; j<array2[i].length; j++)
				System.out.println(array2[i][j]); //1,2,3,4,5
		System.out.println();
				
		//#4. 출력방법3. for-each 반복문 사용하여 출력하기
		for (int[] array : array2) {
			for(int k : array){
				System.out.println(k); //1,2,3,4,5
			}
		}									
	}
}
