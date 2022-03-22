package day17;

import java.io.*;
public class FileStream01 {// Test01
// 파일에 내용을 저장하는 프로그램을 만들어보쉐이
	public FileStream01() {
		// 파일에 저장하기 위해선, Stream이 필요하다.
		FileOutputStream fout=null;
		
		// 경로가 잘못되면 파일을 못만드니까, 예외처리
		try {
			// 절대경로로 입력
			fout=new FileOutputStream("C:\\class\\java\\git\\2022.02-\\start\\src\\day17\\result\\FileTest01.txt");
			// 프로젝트 기준 경로로 입력의 경우..
// 			fout=new FileOutputStream("src/day17/result/FileTest01.txt");
			
			// 1. 한 글자만 입력해봅시다!
//			fout.write('j');	// char-> int 자동 형변환
			
			// 2. 여러 글자를 입력해 봅시다!
			String song="넌 아득한 나의바다\n난 너의 품에 빠져"
					+ "\n너에게 가 닿고 싶어\n"
					+ "\n넌 유일한 나의 바다\n난 너의 눈에 잠겨"
					+ "\n그 안에 난 살고 싶어";
/*			// byte배열로 변환
			byte[] buff=song.getBytes();
			// 배열을 Stream에 흘려보낸다.
			fout.write(buff);
*/
			// 일부만 내보내 보자!
			byte[] buff=song.getBytes();
			fout.write(buff, 81, buff.length-81);
			
			System.out.println("파일 저장 성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				// 대부분 auto-closing이 있지만, 닫아주는게 좋음.
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new FileStream01();
	}

}
