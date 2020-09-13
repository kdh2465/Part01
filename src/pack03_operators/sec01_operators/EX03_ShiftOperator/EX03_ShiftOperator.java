package pack03_operators.EX03_ShiftOperator;

/*산술쉬프트와 논리쉬프트*/

public class EX03_ShiftOperator {
	
	public static void main(String[] args) {		
		//#1. 산술쉬프트 (부호변화 없음)
		//@ << Left Shift
		System.out.println(3<<1);	//6
		System.out.println(-3<<1); 	//-6
		System.out.println(3<<2); 	//12
		System.out.println(-3<<2); 	//-12
		
		System.out.println();
		
		//@ >> Right Shift
		System.out.println(5>>1); 	//2
		System.out.println(-5>>1);	//-3
		System.out.println(5>>2); 	//1
		System.out.println(-5>>2); 	//-2
		
		System.out.println();
				
		//#2. 논리쉬프트 (>>>)		
		System.out.println(3>>>1);		//1
		System.out.println(-3>>>31);	//1
	}
}
