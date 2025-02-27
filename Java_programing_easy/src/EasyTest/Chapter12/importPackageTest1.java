package EasyTest.Chapter12;

import java.util.*;
import java.sql.*;

class My_class {
	//Date date = new Date();
	java.util.Date date = new java.util.Date();
}

public class importPackageTest1 {

	public static void main(String[] args) {
        My_class myObj = new My_class();
        System.out.println("현재 날짜와 시간: " + myObj.date);
		
	}

}
