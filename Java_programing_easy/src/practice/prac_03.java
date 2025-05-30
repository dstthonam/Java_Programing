package practice;
import java.util.Scanner;
import java.util.*;

public class prac_03 {			//임의의 수가 소수인지 판별
	public static void main(String[] args) {
		int i, num;
		Boolean isBool = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 수를 입력해주세요.");
		num = sc.nextInt();
		
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				isBool = false;
				break;
			}
		}
		
		if (isBool) System.out.println("소수이다.");
		else System.out.println("소수가 아니다.");
		
		sc.close();
	}
}
