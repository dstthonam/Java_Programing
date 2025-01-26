package Ch03;

public class Ch03_Exam04 {

	public static void main(String[] args) {
		char ch = 'd';
		
		char upperCase =  (char) ( ch >= 97 ? ch - 32 : ch);
		
		System.out.println("lowerCase : " + ch);
		System.out.println("upperCase : " + upperCase);

	}

}
