package chap04;

public class Ch04_Exam01 {

	public static void main(String[] args) {
		int Res = 1;
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " * ");
			Res *= i;
			if (i == 9) {
				System.out.print(i +1);
				Res *= (i+1);
				break;
			}
		}
		System.out.print(" = " + Res);
		
	}
}
