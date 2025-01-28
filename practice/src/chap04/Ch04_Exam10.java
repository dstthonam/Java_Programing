package chap04;

public class Ch04_Exam10 {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i < 5; i++) {
			for (j = 5; j > i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		/**
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4 - i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
	}

}
