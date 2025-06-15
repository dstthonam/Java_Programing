package practice;
import java.util.Scanner;

public class prac_22 {						// A와 B 사이 자연수들의 합계 구하기
	public static void main(String[] args) {
		int Sum = 0, Hi, Lo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력해주세요.");
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A < B) {
			Hi = B;
			Lo = A;
		}
		else {
			Hi = A;
			Lo = B;
		}
		
		for (int i = Lo; i < Hi; i++) {
			Sum += i;
		}
		System.out.print(Lo + "부터 " + Hi +" 까지 자연수들의 합계 : " + Sum);
		
		sc.close();
	}
}
