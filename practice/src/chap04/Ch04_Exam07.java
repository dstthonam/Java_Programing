package chap04;
import java.util.*;

public class Ch04_Exam07 {

	public static void main(String[] args) {
		int years;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("년도를 입력하세요 : ");
			years = sc.nextInt();
			
			if ((years % 4 == 0) && (years % 100 != 0 || years % 400 == 0)) {
				System.out.println("윤년");
			} else {
				System.out.println("평년");
			}
			
		}
	}

}
