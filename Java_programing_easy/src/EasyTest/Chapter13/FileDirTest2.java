package EasyTest.Chapter13;

import java.io.File;

public class FileDirTest2 {
	public static void main(String[] args) {
		//String directory = "X:/문서정리/코딩관련/2025/2501/Java_Programing/Java_programing_easy/a.txt";
		File f1 = new File("a.txt");
		
		System.out.println("파일 이름 : " + f1.getName());
		System.out.println("파일 경로 : " + f1.getPath());
		System.out.println("절대 경로 : " + f1.getAbsolutePath());

		System.out.println(f1.exists() ? "파일 존재" : "파일 없음");
		
		System.out.println(f1.canWrite() ? "수정 가능" : "수정 불가능");
		System.out.println(f1.canRead() ? "읽기 가능" : "읽기 불가능");
		
		System.out.println(f1.isDirectory() ? "디렉토리" : "디렉토리가 아님");
		System.out.println(f1.isFile() ? "파일" : "파일이 아님");
		System.out.println(f1.isAbsolute() ? "절대 경로" : "상대 경로");
				
		System.out.println("1970년 1월 1일부터 파일이 마지막 수정된 날짜까지의 밀리초 : " + f1.lastModified());
		System.out.println("파일의 크기 : " + f1.length() + " Bytes");
		
	}
}
