package pack05_referencedatatype.sec02_string.EX05_MethodsOfString_1;

import java.util.Arrays;

/*String 클래스의 주요 메서드1*/

public class EX05_MethodsOfString_1 {
	public static void main(String[] args) {
		
		//#1. 문자열 길이 (length())		
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";		
		System.out.println(str1.length()); //11
		System.out.println(str2.length()); //13
		System.out.println();
		
		//#2. 문자열 검색 (charAt(), indexOf(), lastIndexOf())
		//@ charAt()
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		//@ indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a',8));		//9
		System.out.println(str1.lastIndexOf('a',8));	//7		
		System.out.println(str1.indexOf("Java"));		//6
		System.out.println(str1.lastIndexOf("Java"));	//6		
		System.out.println(str2.indexOf("하세요"));		//2
		System.out.println(str2.lastIndexOf("하세요"));	//2		
		System.out.println(str1.indexOf("Bye"));		//-1
		System.out.println(str2.indexOf("고맙습니다."));	//-1
		System.out.println();
				
		//#3. 문자열 변환 및 연결 (String.valueOf(), concat()) 
		//@ String.valueOf(기본자료형) 기본자료형 ->String
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//@concat() : 문자열 연결하기
		String str5 = str3.concat(str4);	
		System.out.println(str5);			//2.3false
		
		//@String.valueOf() + concat() = + Operation
		String str6 = "안녕"+3;
		String str7 = "안녕".concat(String.valueOf(3));
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();		
				
		//#4. 문자열 -> byte[] (getBytes()) / 문자열 -> char[]  (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "안녕하세요!";	
		
		//@ getBytes() 문자열 -> byte[]				
		byte[] array1 = str8.getBytes();
		System.out.println(Arrays.toString(array1));					
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array2));
						
		//@ toCharArray() 문자열 -> char[]
		char[] array3 = str8.toCharArray();
		System.out.println(Arrays.toString(array3));					
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array4));
		System.out.println();									
	}
}
