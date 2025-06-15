package practice;
import java.util.Scanner;

public class prac_19 {						// 행렬 전환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intA[][] = new int[5][3];
		int intB[][] = new int[3][5];
		int L = 0; int M = 0;
		
		System.out.println("배열에 입력할 15개의 수를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				intA[i][j] = sc.nextInt();
			}
		}

		System.out.println("배열 intA : ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (intA[i][j] < 10) System.out.print("  " + intA[i][j] + " ");
				else System.out.print(intA[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				intB[L][M] = intA[i][j];
				M++;
				if (M >= 5) {
					L++;
					M = 0;
				}
			}
		}
		
		System.out.println("\n" + "배열 intB : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (intB[i][j] < 10) System.out.print("  " + intB[i][j] + " ");
				else System.out.print(intB[i][j] + " ");
			}
			System.out.print("\n");
		}

		sc.close();
	}
}
