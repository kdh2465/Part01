package pack04_controlstatement.EX07_BreakControlKeyword;

public class EX07_BreakControlKeyword {
	public static void main(String[] args) {
		
		//#1. 단일 loop break 탈출
		for(int i=0; i<10; i++){		  
			System.out.println(i);
			break;
		} //0
		
		for(int i=0; i<10; i++){
			if(i==5){
				break;
			}
			System.out.print(i+" ");
		} //0 1 2 3 4 5
		System.out.println();
		System.out.println();
		
		
		//#2. 이중 loop break 탈출
		//@case1. 하나의 반복문은 탈출하는 경우 
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j==2){
					break;
				}
				System.out.println(i+", "+j);
			}
		} //0,0 0,1 4,1
		System.out.println();
		
		//@case2. 두개의 반복문을 탈출 (break LABLE)
		POS1:
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j==2){
					break POS1;
				}
				System.out.println(i+", "+j);
			}
		} //0,0 0,1
		System.out.println();
		
		//@case3. 두개의 반복문을 탈출 (변수의 값 조정)		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j==2){
					i=100;
					break;
				}
				System.out.println(i+", "+j);
			}
		} //0,0 0,1		
		
	}
}
