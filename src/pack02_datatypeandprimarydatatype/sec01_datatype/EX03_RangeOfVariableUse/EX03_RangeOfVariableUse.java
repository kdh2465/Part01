package pack02_datatypeandprimarydatatype.sec01_datatype.EX03_RangeOfVariableUse;

public class EX03_RangeOfVariableUse {
	
	public static void main(String[] args) {
		
		int value1 = 3;
		
		{
			int value2 =5;
			System.out.println(value1); //3
			System.out.println(value2); //5
		}
		
		System.out.println(value1); //3
		//System.out.println(value2); //¿À·ù
		
	}
}
