package pack05_referencedatatype.sec01_array.EX03_InitialValue;

import java.util.Arrays;

/*스택메모리의 초기값과 참조자료형의 강제초기값*/

public class EX03_InitialValue {
	public static void main(String[] args) {
		
		//#1. stack 메모리 값은 강제 초기화 되지 않음
		int value1;
		//System.out.println(value1);//오류
		int[] value2;
		//System.out.println(value2);//오류
		int value3 = 0;
		int[] value4 = null;
		System.out.println(value3); //0
		System.out.println(value4); //null
						
		//#2. 참조자료형 초기값 (Heap 메모리 값은 강제 초기화)
		boolean[] array1 = new boolean[3];
		for(int i=0; i<3; i++) 
			System.out.print(array1[i]+"   ");
		System.out.println();
		
		int[] array2 = new int[3];
		for(int i=0; i<3; i++) 
			System.out.print(array2[i]+"   ");
		System.out.println();
		
		double[] array3 = new double[3];
		for(int i=0; i<3; i++) 
			System.out.print(array3[i]+"   ");
		System.out.println();
		
		String[] array4 = new String[3]; //참조자료배열
		for(int i=0; i<3; i++) 
			System.out.print(array4[i]+"   ");
		System.out.println();
				
		//#Tip. 배열을 보다 쉽게 출력하는 방법
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}
}
