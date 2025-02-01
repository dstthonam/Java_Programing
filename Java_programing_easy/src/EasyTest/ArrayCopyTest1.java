package EasyTest;

import java.util.Arrays;

public class ArrayCopyTest1 {

	public static void main(String[] args) {

		int [] a = {1, 2, 3};
		int [] b = {4, 5, 6, 11, 12};
		int [] c = new int [5];
		
		System.arraycopy(a, 0, b, 0, 2);
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 0, c, 0, 3);
		System.out.println(Arrays.toString(c));
		
	}

}
