package EasyTest;

class Box {
	int width;
	int height;
	int depth;
	
	public Box(int width, int height, int depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
	
}

public class BoxTest {

	public static void main(String[] args) {
		
		Box mybox = new Box(10, 20, 30);
		System.out.println(mybox.width);
		System.out.println(mybox.height);
		System.out.println(mybox.depth);
		
	}

}
