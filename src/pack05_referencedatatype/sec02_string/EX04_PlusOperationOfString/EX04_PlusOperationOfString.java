package pack05_referencedatatype.sec02_string.EX04_PlusOperationOfString;

public class EX04_PlusOperationOfString {
	public static void main(String[] args) {
		
		//#1. case1. String + String		
		String str1 = "¾È³ç"+"ÇÏ¼¼¿ä"+"!";
		System.out.println(str1); //¾È³çÇÏ¼¼¿ä!
		
		String str2 = "¹Ý°©";
		str2+="½À´Ï´Ù";
		str2+="!";
		System.out.println(str2); //¹Ý°©½À´Ï´Ù!
		System.out.println();
				
		
		//#2. case2. String + ±âº»ÀÚ·áÇü  ¶Ç´Â ±âº»ÀÚ·áÇü + String
		String str3 = "¾È³ç" + 1; //
		String str4 = "¾È³ç" + String.valueOf(1);
		String str5 = "¾È³ç" + "1";
		
		System.out.println(str3);	//¾È³ç1
		System.out.println(str4);	//¾È³ç1
		System.out.println(str5);	//¾È³ç1
		System.out.println();
		
		
		//#3. case3. String/±âº»ÀÚ·áÇü È¥¿ë 
		System.out.println(1+"¾È³ç");	//1¾È³ç
		System.out.println(1+"¾È³ç"+2);	//1¾È³ç2
		System.out.println("¾È³ç"+1+2);	//¾È³ç12
		System.out.println(1+2+"¾È³ç");	//3¾È³ç
					
	}
}
