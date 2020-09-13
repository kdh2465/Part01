package pack03_operators.sec01_operators.EX05_LogicalOperator;

/*논리연산자와 비트연산자를 이용한 논리연산*/

public class EX05_LogicalOperator {
	
	public static void main(String[] args) {
		//#1. 논리연산자
		//@ 논리 AND 연산자 (&&)
		System.out.println(true && true);		//true
		System.out.println(true && false); 		//false
		System.out.println(false && (5<3)); 	//false
		System.out.println((5>=5) && (7>2)); 	//true
		System.out.println();
		
		//@ 논리 OR 연산자 (||)
		System.out.println(true || true);		//true
		System.out.println(true || false); 		//true
		System.out.println(false || (5<3)); 	//false
		System.out.println((5>=5) || (7>2)); 	//true
		System.out.println();
		
		//@ 논리 XOR 연산자 (||)
		System.out.println(true ^ true);		//false
		System.out.println(true ^ false); 		//true
		System.out.println(false ^ (5<3)); 		//false
		System.out.println((5>=5) ^ (7>2)); 	//false
		System.out.println();
		
		//@ 논리 NOT 연산자 (!)
		System.out.println(!true);				//false
		System.out.println(!false); 			//true
		System.out.println(false || !(5<3)); 	//true
		System.out.println((5>=5) || !(7>2)); 	//true
		System.out.println();		
		
		//#2. 비트 연산자를 이용한 논리연산 (AND(&), OR(|))		
		//@논리연산자와 동일한 결과
		System.out.println(true & true);	//true
		System.out.println(true & false);	//false
		System.out.println(true | (5<3));	//true
		System.out.println((5>=5) | (7>2));	//true
		System.out.println();
		
		//@논리연산자와의 차이점 (Short Circuit)
		int value1 = 3;
		System.out.println(false && ++value1>6);//false
		System.out.println(value1);				//3
		
		int value2 = 3;
		System.out.println(false & ++value2>6);//false
		System.out.println(value2);				//4
		
		int value3 = 3;
		System.out.println(true || ++value3>6);//true
		System.out.println(value3);				//3
		
		int value4 = 3;
		System.out.println(true | ++value4>6);//true
		System.out.println(value4);				//4				
	}
}
