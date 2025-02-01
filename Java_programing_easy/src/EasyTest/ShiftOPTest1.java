package EasyTest;
import java.util.Scanner;

public class ShiftOPTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 개의 숫자를 입력 : ");
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		
		System.out.println("\t a<<2 = " + (a<<2) + "(" + Integer.toBinaryString(a<<2) + ")");
		System.out.println("\t a>>2 = " + (a>>2) + "(" + Integer.toBinaryString(a>>2) + ")");
		System.out.println("\t b<<2 = " + (b<<2) + "(" + Integer.toBinaryString(b<<2) + ")");
		System.out.println("\t b>>2 = " + (b>>2) + "(" + Integer.toBinaryString(b>>2) + ")");
		System.out.println("\t b>>>2 = " + (b>>>2) + "(" + Integer.toBinaryString(b>>>2) + ")");
		
	}

}
