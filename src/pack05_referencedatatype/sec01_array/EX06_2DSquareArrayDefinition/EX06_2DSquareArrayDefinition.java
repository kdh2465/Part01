package pack05_referencedatatype.sec01_array.EX06_2DSquareArrayDefinition;

public class EX06_2DSquareArrayDefinition {
	public static void main(String[] args) {
		
		//#1. 배열의 선언 방법 1
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		//#2. 배열의 선언 방법 2
		int array3[][] = new int[3][4];
		int array4[][];
		array4=new int[3][4];
		
		//#3. 배열의 선언 방법 3
		int[] array5[] = new int[3][4];
		int[] array6[];
		array6=new int[3][4];
		
		//#3. 다양한 배열 선언 (기본자료배열, 참조자료배열)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6]; // 참조자료배열
		
	}
}
