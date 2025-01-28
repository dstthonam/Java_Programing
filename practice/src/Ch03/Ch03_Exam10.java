package Ch03;

public class Ch03_Exam10 {

	public static void main(String[] args) {
		
		int temp = 200;
		float F = temp;
		
		float Ce =  (F - 32) * 5/9.f;
		float Fa = (Ce * 9/5) + 32 ;
		
		Ce = Math.round(Ce * 100) / 100.f;

		/**
		 float Ce = (5 / 9.f * (F - 32)) * 1000 % 10 >= 5 ?

		(int) (((5 / 9.f * (F - 32)) * 100) + 1) / 100.f :

		(int) ((5 / 9.f * (F - 32)) * 100) / 100.f;
		 */
		
		System.out.println("화씨 : " + Fa);
		System.out.println("섭씨 : " + String.format("%.2f", Ce));
		
	}

}
