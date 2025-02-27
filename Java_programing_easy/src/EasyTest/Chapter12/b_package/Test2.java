package EasyTest.Chapter12.b_package;

import EasyTest.Chapter12.a_package.Test1;
//import EasyTest.a_package.*;

public class Test2 {
	public static void main(String[] args) {
		Test1 ss = new Test1();
		System.out.println(ss.sum(10, 20));
	}
}
