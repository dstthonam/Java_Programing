package chap04;

public class Ch04_Exam08 {

	public static void main(String[] args) {

		int tot = 0;
		int cnt = 1;
		
		while(cnt <= 50) {
			int rows = 1;
			
			while (rows <= 6  && cnt <= 50) {
				double dValue = Math.random() * 100 + 1;
				
				System.out.print((int) dValue + "    ");
				tot += dValue;
				rows++;
				cnt++;
			}
			System.out.println();
		}
		System.out.println("합 : " + tot);
		
	}
}