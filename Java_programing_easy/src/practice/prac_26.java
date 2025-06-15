package practice;
import java.util.*;

public class prac_26 {						// 피보나치 수열의 합계 구하기
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();		// 피보나치 수열
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 수를 입력해주세요.");
		int J = sc.nextInt();
		
		A.add(1);
		int Sum = 1;
		
		if (J >= 2) {
			A.add(1);			// A = { 1, 1, ...}
			Sum += 1;
		}
		
		for (int i = 2; ; i++) {
			int Next = A.get(i - 2)  + A.get(i - 1);
			if (Next > J) break;
			A.add(Next);
			Sum += Next;
		}
		
		System.out.print(J  + "이하의 수 중에서 피보나치수열의 합은 : ");
		for (int i = 0; i < A.size(); i++) {
			System.out.print(A.get(i));
			if (i < A.size() - 1) {
				System.out.print(" + ");
			}
			else {
				System.out.print(" = ");
				break;
			}
		}
		System.out.print(Sum);

		sc.close();
	}
}
