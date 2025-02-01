package Chap05;

public class ArrayTest04 {

	public static void main(String[] args) {
			
			int[][] Array = new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
			int[][] TA = new int[Array[0].length][Array.length];
			
			for (int i = 0; i < Array.length; i++) {
				for (int j = 0; j < Array[i].length; j++) {
					TA[j][i] = Array[i][j];
				}
			}

			System.out.println(" ============= Array 출력 ===========");
			for (int i = 0; i < Array.length; i++) {
				for (int j = 0; j < Array[i].length; j++) {
					System.out.printf("%5d", Array[i][j]);
				}
				System.out.println();
			}

			System.out.println(" ============= TA 출력 ===========");
			for (int i = 0; i < TA.length; i++) {
				for (int j = 0; j < TA[i].length; j++) {
					System.out.printf("%5d", TA[i][j]);
				}
				System.out.println();
			}		
	}
}