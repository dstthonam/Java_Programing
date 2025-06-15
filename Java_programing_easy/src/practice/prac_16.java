package practice;
import java.util.Arrays;
import java.util.Scanner;

public class prac_16 {					// 이진탐색
	public static void main(String[] args) {
		int intA[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 10개 입력해주세요.");
		for (int i = 0; i < 10; i++) {
			intA[i] = sc.nextInt();
		}

		Arrays.sort(intA);
        System.out.println("정렬된 배열: " + Arrays.toString(intA));

		System.out.println("찾을 값을 입력해주세요.");
		int Fi = sc.nextInt();
		
		int Lo = 0, Hi = intA.length - 1;
		boolean Found = false;
		
		while (Lo <= Hi) {
			 int M = (Lo + Hi) / 2;

            if (intA[M] == Fi) {
                System.out.println("찾는 값 " + Fi);
                Found = true;
                break;
            }    
            else if (Fi < intA[M])  Hi = M - 1;
            else  Lo = M + 1;
	     }
		
		if (!Found) System.out.println("찾는 값이 배열에 없습니다.");
		
		sc.close();
		}
}
