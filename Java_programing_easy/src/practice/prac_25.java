package practice;
import java.util.*;

public class prac_25 {							// 6의 배수이면서 7의 배수인 수 구하기
	public static void main(String[] args) {
		ArrayList<Integer> B = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 수를 입력해주세요.");
		int A = sc.nextInt();
		
		for (int i = 8; i <= A; i++) {
			if (i % 6 == 0 && i % 7== 0) {
				B.add(i);
			}
		}
		
		System.out.print(A +"이하의 수 중에 6의 배수이면서 7의 배수인 수는 : ");
		if (B.size() == 0) {
			System.out.print("없습니다.");
		}
		else {
			for (int num : B) {
				System.out.print(num + " ");
			}
		}
		
		sc.close();
	}
}
