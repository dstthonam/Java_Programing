package Ch03;

public class Ch03_Exam09 {

	public static void main(String[] args) {
		int won = 45763;
		
		int A = won / 500;
		int B = (won % 500) / 100;
		int C = (won % 100) / 50;
		int D = (won % 50) / 10;
		int E = (won % 10) / 1;
		
		System.out.println(won + "원은");
		System.out.println("500원 :" + A + "개");
		System.out.println("100원 :" + B + "개");
		System.out.println("50원 :" + C + "개");
		System.out.println("10원 :" + D + "개");
		System.out.println("1원 :" + E + "개이다");

	}

}
