package pack04_controlstatement.sec01_selectcontrolstatement.EX02_SwitchControlStatement;

/*switch 선택제어문(break 미포함, break 포함, if문 변환)*/

public class EX02_SwitchControlStatement {

	public static void main(String[] args) {
		
		//#1. break이 포함되지 않는 경우 
		int value1=2;
		switch(value1){
		case 1:
		  System.out.print("A");
		case 2:
		  System.out.print("B");
		case 3:
		  System.out.print("C");
		default:
		  System.out.print("D");
		} //BCD
		System.out.println();
		
		//#2. break이 포함된 경우
		int value2=2;
		switch(value2){
		case 1:
		  System.out.print("A");
		  break;
		case 2:
		  System.out.print("B");
		  break;
		case 3:
		  System.out.print("C");
		  break;
		default:
		  System.out.print("D");
		} //B
		System.out.println();
		
		//@ if-else if...-else로 전환
		if(value2==1) {
			System.out.print("A");
		}
		else if(value2==2) {
			System.out.print("B");
		} 
		else if(value2==3) {
			System.out.print("C");
		}
		else {
			System.out.print("D");
		}				

	}
}
