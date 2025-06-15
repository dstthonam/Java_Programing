package practice;
import java.util.Scanner;

public class prac_18 {						// 기본 행렬(2차원 배열 - 세로로 순서정렬) 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intA[][] = new int[5][5];
		
		System.out.println("2차원 배열에 넣을 수를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intA[j][i] = sc.nextInt();				
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (intA[i][j] < 10) System.out.print("  " + intA[i][j] + " ");
				else System.out.print(intA[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
}
