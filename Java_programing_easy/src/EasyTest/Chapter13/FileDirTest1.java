package EasyTest.Chapter13;

import java.io.File;

public class FileDirTest1 {
	public static void main(String[] args) {
		String directory = "X:/문서정리/코딩관련/2025/2501/Java_Programing/Java_programing_easy";
		File f1 = new File(directory);
		
		if(f1.isDirectory()) {
			System.out.println("검색 디렉터리 " + directory);
			System.out.println("==================");
			
			String s[] = f1.list();
			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);
				
				if (f.isDirectory()) {
					System.out.println(s[i] + " : 디렉토리");
				} else {
					System.out.println(s[i] + " : 파일");
				}
				
			}
		} else {
			System.out.println("지정한 " + directory + "는 디렉토리가 아님");
		}
		
	}
}
