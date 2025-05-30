package practice;
import java.util.Scanner;

public class prac_14 {					// 버블정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intA[] = new int[5];
		
		System.out.println("5개의 수를 입력해주세요.");
		for (int i = 0; i < intA.length; i++) {
			intA[i] = sc.nextInt();
		}

		for (int i = 0; i < intA.length - 1; i++) {
			for (int j = 0; j < intA.length - 1 - i; j++) {
				if (intA[j] < intA[j + 1]) {
					int temp = intA[j];
					intA[j] = intA[j + 1];
					intA[j + 1] = temp;
				}
			}
		}

        System.out.print("정렬된 수: ");
		for (int i = 0; i < intA.length; i++) {
			System.out.print(" " + intA[i]);
		}
		
		sc.close();
	}
}
