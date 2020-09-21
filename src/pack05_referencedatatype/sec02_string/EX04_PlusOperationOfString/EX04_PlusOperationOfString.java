package pack05_referencedatatype.sec02_string.EX04_PlusOperationOfString;

/*문자열의 ‘+’ 연산자(plus operation)*/

public class EX04_PlusOperationOfString {
	public static void main(String[] args) {		
		//#1. case1. String + String		
		String str1 = "안녕"+"하세요"+"!";
		System.out.println(str1); //안녕하세요!
		
		String str2 = "반갑";
		str2+="습니다";
		str2+="!";
		System.out.println(str2); //반갑습니다!
		System.out.println();
		
		//#2. case2. String + 기본자료형  또는 기본자료형 + String
		String str3 = "안녕" + 1; //
		String str4 = "안녕" + String.valueOf(1);
		String str5 = "안녕" + "1";
		
		System.out.println(str3);	//안녕1
		System.out.println(str4);	//안녕1
		System.out.println(str5);	//안녕1
		System.out.println();
		
		//#3. case3. String/기본자료형 혼용 
		System.out.println(1+"안녕");	//1안녕
		System.out.println(1+"안녕"+2);	//1안녕2
		System.out.println("안녕"+1+2);	//안녕12
		System.out.println(1+2+"안녕");	//3안녕					
	}
}
