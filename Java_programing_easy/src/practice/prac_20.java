package practice;
import java.util.Arrays;

public class prac_20 {							// 회전
	public static void main(String[] args) {
		int A[][] = { { 11, 12, 13, 14, 15 },
								{ 0, 7, 8, 9, 10 },
								{ 0, 0, 4, 5, 6 },
								{ 0, 0, 0, 2, 3 },
								{ 0, 0, 0, 0, 1 }
							};
		int B[][] = new int[5][5];
		
		 System.out.println("배열 A : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (A[i][j] < 10) System.out.print("    " + A[i][j] + " ");
				else  System.out.print("  " + A[i][j] + " ");
			}
			System.out.println();
		}
		
		// 전치 행렬 만들기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				B[j][i] = A[i][j];
			}
		}
		// 각 행 정렬
		for (int i = 0; i < 5; i++) {
			Arrays.sort(B[i]);			
		}

		 System.out.println("배열 B : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (B[i][j] < 10) System.out.print("    " + B[i][j] + " ");
				else  System.out.print("  " + B[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
