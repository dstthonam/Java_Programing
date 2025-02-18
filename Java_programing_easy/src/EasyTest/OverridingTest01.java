package EasyTest;

class AAA {
     void aa(int a, int b) {
        System.out.println(a + b);
    }
}

class BBB extends AAA {
	@Override
	public void aa(int a, int b) {
        System.out.println(a * b);
    }
}

public class OverridingTest01 {
    public static void main(String[] args) {
        AAA obj1 = new AAA();
        obj1.aa(5, 10);

        AAA obj2 = new BBB();
        obj2.aa(5, 10);
    }
}

