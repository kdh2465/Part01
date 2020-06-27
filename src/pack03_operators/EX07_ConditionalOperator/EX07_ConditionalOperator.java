package pack03_operators.EX07_ConditionalOperator;

/*»ïÇ× ¿¬»êÀÚ*/

public class EX07_ConditionalOperator {
	public static void main(String[] args) {
		
		//#1. »ïÇ×¿¬»êÀÚ
		int value1 = (3>5)? 6: 9;
		System.out.println(value1);	//9
		
		int value2 = (5>3)? 10: 20;
		System.out.println(value2);	//10
		
		int value3 = 3;
		System.out.println((value3%2)==0?"Â¦¼ö":"È¦¼ö");			
		
		//cf. if - else·Î º¯È¯
		if(value3%2==0)
			System.out.println("Â¦¼ö");
		else
			System.out.println("È¦¼ö");
			
	}
}

