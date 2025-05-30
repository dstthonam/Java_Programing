package practice;
import java.util.Scanner;

public class prac_15 {						// 5명의 석차 구하기
	public static void main(String[] args) {
		int intA[] = new int[5];
		int Rank[] = new int[5];
		
		System.out.println("5개의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intA.length; i++) {
			intA[i] = sc.nextInt();
			Rank[i] = 1;
		}
		
		for (int i = 0; i < intA.length; i++) {
			for (int j = 0; j < intA.length; j++) {
				if (intA[i] < intA[j]) {
					Rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < intA.length; i++) {
			System.out.print("점수 : " + intA[i] + "\t" + "순위 : " + Rank[i] + "\n");
		}
		
		sc.close();
	}
}
