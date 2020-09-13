package pack04_controlstatement.EX01_IfControlStatement;

/*�� ���� TYPE�� if ���*/

public class EX01_IfControlStatement {
	public static void main(String[] args) {		
		//#1. Type1 : if
		int value1 = 5;
		
		if(value1 > 3) {
			System.out.println("����1"); //�����
		}
		if(value1 < 5) {
			System.out.println("����2"); //����ȵ�
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if(bool1) {
			System.out.println("����3"); //�����
		}
		if(bool2) {
			System.out.println("����4"); //����ȵ�
		}
		System.out.println();
		
		
		//#2. Type2 : if-else
		int value2 = 5;
		if(value2 < 3) {
			System.out.println("����5"); 
		} else {
			System.out.println("����6"); //�����
		}
		
		//@ cf. ���׿����ڷ� ��ȯ ����
		System.out.println((value2<3)?"����5":"����6");
		System.out.println();
		
		
		//#3. Type3 : if-else if-else if ...- else
		int value3 = 85;
		if(value3>=90) {
		  System.out.println("A����");
		}
		else if(value3>=80) {
		  System.out.println("B����"); //����
		}
		else if(value3>=70) {
		  System.out.println("C����");
		}
		else {
		  System.out.println("F����");
		}	
		
		if(value3>=70) {
		  System.out.println("C����"); //����
		}
		else if(value3>=80) {
		  System.out.println("B����");
		}
		else if(value3>=90) {
		  System.out.println("A����");
		}
		else {
		  System.out.println("F����");
		}
				
		if(value3>=70 && value3<80) {
		  System.out.println("C����");
		}
		else if(value3>=80 && value3<90) {
		  System.out.println("B����");	 //����
		}
		else if(value3>=90) {
		  System.out.println("A����");
		}
		else {
		  System.out.println("F����");
		}
		
	}
}