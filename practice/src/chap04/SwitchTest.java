package chap04;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("원하는 달을  입력하세요 : ");
		month = sc.nextInt();
		
		switch (month) {
			
			case 12, 1, 2 :
				System.out.println("겨울");	
				break;
				
			case 3, 4, 5 :
				System.out.println("봄");	
				break;
			
			case 6, 7, 8 :
				System.out.println("여름");	
				break;
			
			case 9,  10, 11 :
				System.out.println("가을");	
				break;
				
			default : 
				System.out.println("원하는 달이 없습니다.");	
		}

		sc.close();
	}
		
}