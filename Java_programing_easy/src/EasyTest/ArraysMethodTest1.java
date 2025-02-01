package EasyTest;
import java.util.Arrays;

public class ArraysMethodTest1 {

	public static void main(String[] args) {
		int [] a = new int[10];
		
		Arrays.fill(a,1);
		Arrays.fill(a,  1, 5, 10);
		
		System.out.println(Arrays.toString(a));
		
		int [] b = { 3, 7, 1, 0, 8, 9 };
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.binarySearch(b, 7));
		
		int [] c = {1, 2, 3};
		int [] d = {1, 2, 3};
		int [] e = {4, 5, 6};
		
		System.out.println(Arrays.equals(c, d));
		System.out.println(Arrays.equals(c, e));
	}

}
