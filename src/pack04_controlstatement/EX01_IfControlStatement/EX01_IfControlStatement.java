package pack04_controlstatement.EX01_IfControlStatement;

public class EX01_IfControlStatement {
	public static void main(String[] args) {
		
		//#1. Type1 : if
		int value1 = 5;
		
		if(value1 > 3) {
			System.out.println("실행1"); //실행됨
		}
		if(value1 < 5) {
			System.out.println("실행2"); //실행안됨
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if(bool1) {
			System.out.println("실행3"); //실행됨
		}
		if(bool2) {
			System.out.println("실행4"); //실행안됨
		}
		System.out.println();
		
		
		//#2. Type2 : if-else
		int value2 = 5;
		if(value2 < 3) {
			System.out.println("실행5"); 
		} else {
			System.out.println("실행6"); //실행됨
		}
		
		//@ cf. 삼항연산자로 전환 가능
		System.out.println((value2<3)?"실행5":"실행6");
		System.out.println();
		
		
		//#3. Type3 : if-else if-else if ...- else
		int value3 = 85;
		if(value3>=90) {
		  System.out.println("A학점");
		}
		else if(value3>=80) {
		  System.out.println("B학점"); //실행
		}
		else if(value3>=70) {
		  System.out.println("C학점");
		}
		else {
		  System.out.println("F학점");
		}	
		
		if(value3>=70) {
		  System.out.println("C학점"); //실행
		}
		else if(value3>=80) {
		  System.out.println("B학점");
		}
		else if(value3>=90) {
		  System.out.println("A학점");
		}
		else {
		  System.out.println("F학점");
		}
		
		
		if(value3>=70 && value3<80) {
		  System.out.println("C학점");
		}
		else if(value3>=80 && value3<90) {
		  System.out.println("B학점");	 //실행
		}
		else if(value3>=90) {
		  System.out.println("A학점");
		}
		else {
		  System.out.println("F학점");
		}
		
	}
}
