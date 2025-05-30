package practice;
import java.util.Scanner;

public class prac_09 {					// 최대, 최소 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intA[] = new int[5];
		int MAX = 0;
		
		System.out.println("5개의 수를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			intA[i] = sc.nextInt();
		}
		
		for (int j = 0; j < 5; j++) {
			if (intA[j] > MAX) {
				MAX = intA[j];
			}
		}
		
		System.out.println("위 배열의 최대값은 " + MAX +"입니다.");
		
		sc.close();
	}
}
