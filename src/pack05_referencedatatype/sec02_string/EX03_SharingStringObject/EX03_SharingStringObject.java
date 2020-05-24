package pack05_referencedatatype.sec02_string.EX03_SharingStringObject;

public class EX03_SharingStringObject {
	public static void main(String[] args) {
		
		//#1. 문자열 객체의 공유 (literal로 직접 입력한 경우) / 개별 객체 생성 (new로 생성한 경우) 
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		//@stack메모리값 비교 (객체의 번지(위치))
		System.out.println(str1==str2); //false
		System.out.println(str2==str3); //true
		System.out.println(str3==str4); //false
		System.out.println(str4==str1); //false		
		
	}
}
