package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX05_TypeCasting_2;

/*자동타입변환과 수동타입변환*/

public class EX05_TypeCasting_2 {
	
	public static void main(String[] ar) {		
		//#1. 자동타입변환
		float value1 = 3;
		long value2 = 5;
		double value3 = 7;
		byte value4 = 9;  	//저장할 수 있는 값의 범위에 있는 경우에 한함
		short value5 = 11;	//저장할 수 있는 값의 범위에 있는 경우에 한함
		
		System.out.println("value1="+value1);
		System.out.println("value2="+value2);
		System.out.println("value3="+value3);
		System.out.println("value4="+value4);
		System.out.println("value5="+value5);
		
		//#2. 수동타입변환 (명시적으로 casting을 하지 않는 경우 오류발생)
		byte value6 = (byte)128; 	
		int value7 = (int)3.5;	 	
		float value8 = (float)7.5;
		
		System.out.println("value6="+value6); //-128
		System.out.println("value7="+value7);
		System.out.println("value8="+value8);		
	}
	
}
