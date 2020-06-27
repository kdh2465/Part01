package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX03_PrimaryDataType_2;

/*문자 값의 다양한 저장방법 및 출력*/

public class EX03_PrimaryDataType_2 {
	
	public static void main(String[] ar) {		
		//#4. 문자(char) : 문자, 정수
		//#4-1. 문자로 저장하는 경우
		char value1 = 'A';		
		char value2 = '가';
		char value3 = '3';
		
		System.out.println("value1="+value1);
		System.out.println("value2="+value2);
		System.out.println("value3="+value3);
		
		//#4-2. 정수로 저장하는 경우 
		char value4 = 65; //10진수
		char value5 = 0xac00; //16진수
		char value6 = 51; //10진수
		
		System.out.println("value4="+value4);
		System.out.println("value5="+value5);
		System.out.println("value6="+value6);
		
		//#4-3. 유니코드로 저장하는 경우
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		
		System.out.println("value7="+value7);
		System.out.println("value8="+value8);
		System.out.println("value9="+value9);					
	}
}
