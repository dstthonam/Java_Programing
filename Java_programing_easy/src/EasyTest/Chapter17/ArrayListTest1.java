package EasyTest.Chapter17;

import java.util.*;

class ArrayListTest1 {
	public static void main(String[] args) {
		String[] name = {"kim", "lee", "park", " jung", "oh"};
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("초기 값 : " + lname);
		
		lname.add("haha");
		System.out.println("lname 값 : " + lname);

		lname.set(0, "김");
		lname.add(3, "곽");
		System.out.println("lname 값 : " + lname);
		
		Collections.shuffle(lname);
		System.out.println("lname 값 : " + lname);
		
		Collections.sort(lname);
		System.out.println("lname 값 : " + lname);
		
		System.out.println("5번째 요소의 값 " + lname.get(4));
		
		Collections.fill(lname, "김");
		System.out.println("lname 값 : " + lname);		
	}
}
