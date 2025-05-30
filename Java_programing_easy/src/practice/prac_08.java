package practice;
import java.util.Scanner;

public class prac_08 {					// 임의의 수까지 최대공약수,  최대공배수 값 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 수를 입력해주세요.");
		int A = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요.");
		int B = sc.nextInt();
		
		int Big, Small, NMG, GCM = 0;
		int LCM = 0;
		
		if (A >= B ) {
			Big = A; Small = B;
		}
		else {
			Big = B; Small = A;
		}
		
		while (true) {
			NMG = (Big % Small);
			if (NMG == 0) {
				GCM = Small;								// 최대공약수
				LCM = (A*B)/GCM; 	//최소공배수
				break;				
			}
			else {
				Big = Small;
				Small = NMG;
			}
		}
		System.out.println("최대공약수 : " + GCM);
		System.out.println("최소공배수 : " + LCM);

		sc.close();
	}
}
