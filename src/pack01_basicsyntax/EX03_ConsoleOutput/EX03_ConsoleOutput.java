package pack01_basicsyntax.EX03_ConsoleOutput;

public class EX03_ConsoleOutput {
	public static void main(String[] args) {
		
		//#1. System.out.println(...)
		System.out.println("화면출력");
		System.out.println("화면"+"출력");
		System.out.println(3.8);
		System.out.println(3+5);
		System.out.println("화면"+3);
		System.out.println("화면"+3+5);
		System.out.println(3+5+"화면");
		System.out.println();
		
		int a = 3;
		String b = "화면";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b+"출력");
		System.out.println(a+b+"출력");
		System.out.println();
		
		//#2. System.out.print(...)
		System.out.print("화면");
		System.out.print("출력");
		System.out.print(3);
		System.out.print("\n");
		System.out.print("\n");
		
		//#3. System.out.print(...)
		System.out.printf("%d\n",30);//10진수
		System.out.printf("%o\n",30);//8진수
		System.out.printf("%x\n",30);//16진수

		System.out.printf("%s\n","출력");
		System.out.printf("%f\n",5.8);
		System.out.printf("%4.2f\n",5.8);
		System.out.printf("%d와 %4.2f\n",4,5.8);
		
	}
}
