package EasyTest.Chapter13;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("입력 파일명을 입력하세요 : ");
		String s = stdin.next();
		
		long filesize= new File(s).length();
		FileInputStream fis = new FileInputStream(s);
		/**
		while ((i  = fis.read()) != -1) {
			System.out.println(i);
		}
		*/
		for (int i = 0; i < filesize; i++) {
			int j = fis.read();
			if (i == -1) break;
			System.out.println(j);
			
		}
		stdin.close();
		System.out.println(s + "파일로부터 바이트를 읽어 화면에 출력하였습니다.");
		
	}
}
