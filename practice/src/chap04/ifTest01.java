package chap04;
import java.util.Scanner;

public class ifTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = '\0';
		
		System.out.print("한문자를 입력하세요 : ");
		ch = sc.next().charAt(0);
		
		if (Character.isLowerCase(ch))
			System.out.println("소문자 입니다. ^ . ^");
		
		System.out.println("abc".charAt(3));
		sc.close();
	}

}
