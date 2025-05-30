package practice;
import java.util.Scanner;

public class prac_12 {					// 가장 가까운 수 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intA [] = new int[5];  
		
		System.out.println("5개의 수를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			intA[i] = sc.nextInt(); 
		}
		
		System.out.println("배열 중에서 가장 가까운 수를 찾고 싶은 수를 입력해주세요.");
		int B = sc.nextInt();
		
		int closestIndex = 0;
		int minDiff = Math.abs(intA[0] - B);
		
		for (int i = 1; i < 5; i++) {
			int diff = Math.abs(intA[i] - B);
			if (diff < minDiff) {
				minDiff = diff;
				closestIndex = i;
			}
		}
		System.out.println(B + "에 가장 가까운 수는 : " + intA[closestIndex]);
		
		sc.close();
	}
}
