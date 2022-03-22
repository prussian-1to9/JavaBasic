package day17;

import java.io.*;
public class FileStream02 {// Test02
// 이전 예제에서 만든 FileTest01.txt를 읽어보쉐이
	public FileStream02() {
		// 파일로 연결된 Stream 준비
		FileInputStream fin=null;
		
		try {
			/* Stream 연결 : 프로젝트 기준 경로
			fin=new FileInputStream("src/day17/result/FileTest01.txt");

			// 한글자만 읽기
//			int ch=fin.read();
			
			// 여러글자 읽기
			byte[] buff=new byte[10];
			int len=fin.read(buff);
			
			// byte 배열-> 문자열 변환
			String str=new String(buff, 0, len);
			
			// 출력
			System.out.println("읽은 문자 : "+str);
			*/
			
			// Test01.java 파일을 읽어, 출력해보자.
			// 몇글자를 읽어야할지 모르니, 반복문으로 처리.
			// 더 이상 읽을 내용이 없는 경우는
			// int read(byte[] b)의 반환값이 -1인 경우!
			fin=new FileInputStream("src/day17/Test01.java");
			
			while(true) {
				// byte[] 준비
				byte[] buff=new byte[1024];
				// 데이터 읽기
				int len=fin.read(buff);
				
				if (len==-1) break; // 데이터가 없는 경우임.
				
				// String으로 변환
				String str=new String(buff, 0, len);
				
				// 출력
				System.out.print(str);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileStream02();
	}
}
