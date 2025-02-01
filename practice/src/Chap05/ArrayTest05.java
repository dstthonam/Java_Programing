package Chap05;

public class ArrayTest05 {

	public static void main(String[] args) {
			
			int[][] arr = new int[5][5];
			int i = 0;
			
			for (; i < arr.length; i++) {
				int r = arr.length -1;
				for (int j = 0; j < arr[i].length; j++) {
					if  (i == j) {
						arr[i][j] = 1;
						arr[i][r - i] = 1;
					}
				}
			}
			
			for (i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
					if (j < arr[i].length - 1)
						System.out.print(" ");						
				}
				System.out.println();				
			}	
	}
}