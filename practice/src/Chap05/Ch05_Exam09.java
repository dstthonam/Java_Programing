package Chap05;

public class Ch05_Exam09 {

	public static void main(String[] args) {
		
		int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int i = 0, j = 0;		
		
		System.out.println("변경 전");
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				System.out.printf("%5d" , A[i][j]);				
			}
			System.out.println();
		}
		
		System.out.println("변경 후");
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				System.out.printf("%5d" , A[j][i]);				
			}
			System.out.println();
		}
	}

}
