package EasyTest.Chapter12;

class WrapperTest_01 {
	//int a = Integer.parseInt(args[0]);
	//double b = Double.parseDouble(args[1]);
	char c = Character.toLowerCase('A');
	
	Integer A = 10;
	Double D = 3.14;
	int AA = A;
	double DD = D;
	
}

public class WrapperTest1 {
	public static void main(String[] args) {
		int num1 = 20;
		Integer num2 = new Integer(30);
		double div = num1 / num2.doubleValue();
		
		System.out.println("나눈 값 : " + div);		
		System.out.println("두 수가 같은가? : " + num2.equals(num1));		
	}
}

