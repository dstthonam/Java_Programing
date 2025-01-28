package Ch03;

public class Ch03_Exam04 {

	public static void main(String[] args) {
		char ch = 'd';
		
		char upperCase =  (char) ( ch >= 97 ? ch - 32 : ch);
		
		//char upperCase =   ( 97<=ch&&ch<=122 )  ?  (  (char)(ch-32) ) : ch;
		
		System.out.println("lowerCase : " + ch);
		System.out.println("upperCase : " + upperCase);

	}

}
