package practice;

public class prac_02 { 			// 1 + 1/1 + 1/2 + ... + 1/10까지 합산
	public static void main(String[] args) {
		int a;
		double hab = 1;
		System.out.print(" 1 ");

		for (a = 1; a < 11; a++) {
			hab += (double) 1 / a;
			System.out.print(" + 1 /" + a);
		}
		
		System.out.print(" = " + hab);
	}

}
