package pack04_controlstatement.sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

/*do-while의 기본문법구조, do-while vs. while의 비교*/

public class EX03_DoWhileControlStatement {

	public static void main(String[] args) {		
		//#1. do-while 기본문법 구조 
		//@ 반복회수가 0일때의 while과 do-while
		//while
		int a;
		a=0;
		while(a<0){
		  System.out.print(a+" ");
		  a++;
		}
		System.out.println();
		
		//do-while		
		a=0;
		do{
		  System.out.print(a+" ");
		  a++;
		} while(a<0);
		System.out.println();
		System.out.println();
		
		//@ 반복회수가 1일때의 while과 do-while
		//while
		a=0;
		while(a<1){
		  System.out.print(a+" ");
		  a++;
		}
		System.out.println();
		
		//do-while		
		a=0;
		do{
		  System.out.print(a+" ");
		  a++;
		} while(a<1);
		System.out.println();
		System.out.println();
		
		//@ 반복회수가 10일때의 while과 do-while
		//while
		a=0;
		while(a<10){
		  System.out.print(a+" ");
		  a++;
		}
		System.out.println();
		
		//do-while		
		a=0;
		do{
		  System.out.print(a+" ");
		  a++;
		} while(a<10);
		System.out.println();		
	}
}
