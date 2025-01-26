package chap04;
import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.print("정수 입력 : ");
		su = sc.nextInt();
		
		if (su > 0) 
			System.out.println("양수");
		
		sc.close();
	}

}
