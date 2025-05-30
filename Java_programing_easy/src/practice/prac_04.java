package practice;
import java.util.Scanner;

public class prac_04 {			//임의의 수까지의 소수의 합계 구하기
	public static void main(String[] args) {
		System.out.println("임의의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int j, k;
		
		System.out.print("소수 : ");
		
		for (j = 2; j <= num; j++) {
			for (k = 2; k <= j; k++) {
				if (j % k == 0) {
					if (j == k) {
						sum += j;
						System.out.print(j + "\t");
					}
					else {
						break;
					}
					
				}
			}
		}

		System.out.println("\n \n" + num+ "까지의 소수의 합은 : " + sum);
		/**
		 System.out.println("임의의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int K = 2;
		
		do {
			int J = 2;
			while (K % J != 0) {
				J++;
			}
			if (K == J) {
				sum += K;
				System.out.print("소수 : " + K + "\t");
			}
			
			if (K < num) K++;
			else 	break;
			
		} while(true);
		
		System.out.println("\n");
		System.out.println("입력한 " + num + "까지의 소수의 합 : " + sum);
		 */
		sc.close();

	}
}
