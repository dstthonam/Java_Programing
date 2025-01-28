package Chap05;
import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
			
			int[] num = new int[5];
			int sum = 0;
			
			System.out.println("[정렬 전]");
			for (int i = 0; i < num.length; i++) {
				num[i] = (int)(Math.random() * 50) + 1;
				System.out.print("num[" + i + "]=" + num[i] + '\t');
				
				sum +=num[i];
			}
			System.out.println();
			System.out.println("[정렬 후]");
			
			Arrays.sort(num);			
			for (int i = 0; i < num.length; i++) {
				System.out.print("num[" + i + "]=" + num[i] + '\t');
			}
			System.out.println();
			System.out.println("\n합 = " + sum);
	}
}