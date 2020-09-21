package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX01_FloatVsDouble;

/*float과 double의 정밀도 비교*/

public class EX01_FloatVsDouble {
	public static void main(String[] ar) {		
		//#1. float
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		//#2. double
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.00000000000000001;
		System.out.println(d2);		
	}
}
