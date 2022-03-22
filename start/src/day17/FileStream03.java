package day17;

import java.io.*;
public class FileStream03 {// Test03
// 이미지 파일을 복사해봅시다!
	public FileStream03() {
		// prepare Input/Output Stream
		FileInputStream fin=null;
		FileOutputStream fout=null;
		
		try {
			fin=new FileInputStream("src/day17/rj.jpg");
			fout=new FileOutputStream("src/day17/result/rj_copy.jpg");
			
			// 이 때, 문제는! 몇번 읽어서 처리해야될지 모른다!!
			while(true) {
				// 배열 준비
				byte[] buff=new byte[1024];
				// Input
				int len=fin.read(buff);
				
				if (len==-1) break;
				
				// Output
				fout.write(buff, 0, len);
			}
			System.out.println("파일 복사 성공!");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				fout.close();
			}catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileStream03();
	}
}
