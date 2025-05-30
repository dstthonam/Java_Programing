package practice;

public class prac_01 { 			// 1/2 + 1/3 +... + 49/50까지 합산
	public static void main(String[] args) {
		double hab = 0;
		int a, b = 0;
		
		for (a = 1; a < 50; a++) {
			b = a + 1;
			hab += (double) a / b;
			System.out.print(a + "/" + b);
			
			if (b != 50) {
				System.out.print(" + ");
			}
		}
		
		System.out.print(" = " + hab);
		
	}
}
