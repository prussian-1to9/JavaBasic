package day18;
/*
	result 폴더의 child.txt 파일을 읽어보자
 */
import java.io.*;
public class FileStream02 {// Test03

	public FileStream02() {
		// Target Stream 준비
		FileReader fr=null;
		
		try {
			// 파일에 연결
			fr=new FileReader("src/day18/result/child.txt");
			
			/* 1. 한글자만 읽어봅시다.
			int ch=fr.read();	// == char ch=(char) fr.read();
			// 출력
			System.out.println("읽은 문자 : "+(char)ch);
			*/
			/* 2. 여러 글자를 읽어봅시다.
			char[] buff=new char[1024];
			int len=fr.read(buff);	// 문자의 개수 구하기
			// 문자열로 변환
			String str=new String(buff, 0, len);
			
			System.out.println(str);
			*/
			// 3. 문서 전체를 읽어봅시다.
			char[] buff=new char[1024];
			while(true) {
				int len=fr.read(buff);
				if (len==-1) break;
				String str=new String(buff, 0, len);
				System.out.print(str);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileStream02();
	}
}
