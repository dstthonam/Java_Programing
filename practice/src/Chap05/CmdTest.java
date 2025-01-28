package Chap05;

public class CmdTest {

	public static void main(String[] args) {
		/**
		 System.out.println("args의 요소의 개수 = "+ args.length);
		 
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}*/
		
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int x : nums) {
			System.out.print(x + " ");
		}

	}

}
