package Ch03;

public class Ch03_Exam06 {

	public static void main(String[] args) {
		 		int tot = 65430;
		 		
		 		int A = (int) (tot / 10000);
		 		int B = (int) (tot /1000) % 10;
		 		int C = (int) (tot / 100) % 10;
		 		int D = (int) (tot / 10) % 10;
		 		
		 		/**
				int a = tot/10000;
				tot %= 10000; 	
				
				int b = tot/1000;
				tot %= 1000; 
				
				int c = tot/100;
				tot %= 100; 
				
				int d = tot/10;
		 		 */

		 		System.out.println("만원 : " + A);
		 		System.out.println("천원 : " + B);
		 		System.out.println("백원 : " + C);
		 		System.out.println("십원 : " + D);
	}

}
