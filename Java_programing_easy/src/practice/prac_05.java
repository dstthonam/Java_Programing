package practice;
import java.util.Scanner;

public class prac_05 {			//임의의 수까지의 소수의 갯수 구하기
	public static void main(String[] args) {
		System.out.println("임의의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int j, k;

		System.out.print("소수 : ");
		
		for (j = 2; j <= num; j++) {
			for (k = 2; k <= j; k++) {
				if (j % k == 0) {
					if (j == k) {
						cnt++;
						System.out.print(k + "\t");
					}
					else break;
				}
			}
		}

		System.out.print("\n\n" + num + "까지의 소수의 갯수는 : " + cnt);
		sc.close();
		
	}
}
