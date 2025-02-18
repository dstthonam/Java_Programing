package EasyTest;

public class Sample {
	int count = 10;
	static int num = 20;
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	static int mul(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		int same;
		
		//same = count;
		same = num;
		//same = sum(5, 5);
		same = mul(5, 5);

	}

}
