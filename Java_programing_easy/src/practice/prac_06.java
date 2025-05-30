package practice;
import java.util.Scanner;

public class prac_06 {					// 임의의 수까지 %배수 갯수와 합계 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("범위의 마지막 수를 입력해주세요.");
		int num = sc.nextInt();
		
		System.out.println("배수를 구할 수를 입력해주세요.");
		int j = sc.nextInt();
		
		int cnt = 0;
		int sum = 0;
		
		if (j > num) {
			System.out.println("임의의 수보다 구하려는 배수의 값이 더 큽니다.");
		}
		else {
			for (int i = 1; i <= num; i++) {
					if (i % j == 0) {
						cnt++;
						sum += i;
						
					}
			}
			System.out.println("1부터 " + num + "까지의 " + j + "의 배수의 갯수와 합계는 :");
			System.out.println(j + "의 배수의 갯수 : " + cnt);
			System.out.println(j + "의 배수의 합계 : " + sum);
			
		}
		sc.close();
	}
}
