package practice;
import java.util.Scanner;

public class prac_10 {					// 최대값과 최소값의 합 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intA[] = new int[5];
		int MAX, MIN;
				
		System.out.println("5개의 수를 입력해주세요.");
		for (int i = 0; i < intA.length; i++) {
			intA[i] = sc.nextInt();
		}
		
		MAX = MIN = intA[0]; 
		
		for (int i = 0; i < intA.length; i++) {
			if (intA[i] > MAX) {
				MAX = intA[i];
			}
			
			if (intA[i] < MIN) {
				MIN = intA[i];
			}
		}
		
		int HP = MAX + MIN;
		
		System.out.println("최댓값은 : " + MAX);
		System.out.println("최솟값은 : " + MIN);
		System.out.println("최댓값과 최솟값의 합은 : " + HP);
		
		sc.close();
	}
}
