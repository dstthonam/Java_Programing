package EasyTest.Chapter10;

class CCC1 {
	public int a;
	public String toString() {
		return "AAA1 클래스 객체, 속성 a의 값은 : " + a;
	}
}

public class ObjectMethodTest1 {

	public static void main(String[] args) {
		CCC1 aa = new CCC1();
		
		System.out.println(aa);
		System.out.println(aa.toString());
	}
}
