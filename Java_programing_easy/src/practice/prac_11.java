package practice;
import java.util.Scanner;

public class prac_11 {					// 10진법에서 2진법으로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2진법으로 변환할 1024보다 작은 수를 입력해주세요.");
		int De = sc.nextInt();
		int intA[] = new int[10];
 		
		for (int i = 0; i < intA.length; i++) {
			if (De != 0) {
				intA[intA.length - 1 - i] = De % 2;
				De /= 2;
			}
			else break;
		}

		for (int i = 0; i < intA.length; i++) {
			System.out.print("  " + intA[i]);
		}
		
		sc.close();
	}
}
