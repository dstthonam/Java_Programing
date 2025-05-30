package practice;
import java.util.Scanner;

public class prac_07 {					// 임의의 수까지 약수의 갯수와 약수 값 구하기
	public static void main(String[] args) {
		System.out.println("임의의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int intA[] = new int[num];
		int j = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				intA[j] = i;
				j++;
			}
		}
		
		System.out.println("\n" + num + "의 약수의 갯수는 : " + j);
		System.out.print(num + "의 약수는 : ");
		for (int i = 1; i <= j; i++) {
			System.out.print( "\t" + intA[i-1]);
		}
		
		sc.close();
	}
}
