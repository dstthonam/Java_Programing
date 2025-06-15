package practice;

public class prac_24 {							// 5행 5열 직각삼각형 값 구하기
	public static void main(String[] args) {
		int A[][] = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = 0;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				A[i][j] = j + 2;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" "+ A[i][j] + " ");
			}
			System.out.println();
		}

		
		
	}
}
