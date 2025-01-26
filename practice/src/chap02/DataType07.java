package chap02;

public class DataType07 {

	public static void main(String[] args) {
		double d = 3.14F;
		int res = (int)d;
		System.out.println("promotion d = " + d);
		System.out.println("casting res = " + res);

		System.out.print("dec=" + 100);
		System.out.print(" oct=" + 0100);
		System.out.println(" hex=" + 0x100);
		
		System.out.println("한문자 "+"a");
		System.out.println("문자열 "+"a");
		System.out.println("정수 :  "+100);
		System.out.println("실수 :  "+ 100f);
		System.out.println("불리형 : "+ (0<1) +", "+ (1<0));
		
	}

}
