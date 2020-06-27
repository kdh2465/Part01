package pack05_referencedatatype.sec01_array.EX10_ArgumentOfMainMethod;

/*main 메서드로의 매개변수 전달*/

public class EX10_ArgumentOfMainMethod {
	public static void main(String[] args) {
		 
		//#1. args 배열의 길이 구하기
		int length = args.length;
		System.out.println("length = "+length);
		System.out.println();
		
		//#2. 매개변수 값 출력 방법 1
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//#2. 매개변수 값 출력 방법 2
		for (String s : args) {
			System.out.println(s);
		}		
	}
}
