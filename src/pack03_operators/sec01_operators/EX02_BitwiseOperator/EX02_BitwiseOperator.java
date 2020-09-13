package pack03_operators.sec01_operators.EX02_BitwiseOperator;

/*다양한 진법의 표현과 비트연산자*/

public class EX02_BitwiseOperator {
	
	public static void main(String[] args) {		
		
		//#0. 자바코드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("d",16));
				
		//#1. 다양한 진법의 표현
		System.out.println(13);		//10진법
		System.out.println(0b1101);	//2진법
		System.out.println(015);	//8진법
		System.out.println(0x0D);	//16진법
		System.out.println();
				
		//#2. 비트연산자 
		//@ AND 연산자
		System.out.println(3 & 10); 		//2
		System.out.println(0b0011 & 0b1010);//2		
		System.out.println(0x03 & 0x0A);	//2		
		System.out.println();
		
		//@ OR 연산자
		System.out.println(3 | 10); 		//11
		System.out.println(0b0011 | 0b1010);//11		
		System.out.println(0x03 | 0x0A);	//11		
		System.out.println();
				
		//@ XOR 연산자
		System.out.println(3 ^ 10); 		//9
		System.out.println(0b0011 ^ 0b1010);//9		
		System.out.println(0x03 ^ 0x0A);	//9		
		System.out.println();
				
		//@ ~ 연산자
		System.out.println(~3);			//-4
		System.out.println(~0b0011); 	//-4
		System.out.println(~0x03); 		//-4
		System.out.println();				
	}

}
