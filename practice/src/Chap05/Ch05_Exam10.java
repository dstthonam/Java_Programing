package Chap05;

public class Ch05_Exam10 {

	public static void main(String[] args) {
		
		int A [] = { 90, 80, 50, 70, 65, 90, 100, 43, 55, 0 }; 
		String B[] = new String[10];
		int share = 0;
		
		for (int i = 0; i < A.length; i++) {
			share = A[i] / 10;
			
			if (share > 0) {
				B[i] = "ㅁ";
				for (int j = 1; j < share; j++) {
					B[i] += 'ㅁ' ;
				}
			} else {
				B[i] = "0";
			}
			
			System.out.printf("%5d 점 : ", A[i]);
			System.out.printf("%3s\n", B[i]);
			
		}
		
	}

}
			