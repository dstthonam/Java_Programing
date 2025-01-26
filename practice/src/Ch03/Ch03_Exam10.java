package Ch03;

public class Ch03_Exam10 {

	public static void main(String[] args) {
		
		int temp = 200;
		float F = temp;
		
		float Ce =  (F - 32) * 5/9;
		float Fa = (Ce * 9/5) + 32 ;

		System.out.println("화씨 : " + Fa);
		System.out.println("섭씨 : " + String.format("%.2f", Ce));
		
	}

}
