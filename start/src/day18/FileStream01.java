package day18;
/*
	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
 */
import java.io.*;
public class FileStream01 {// Test01

	public FileStream01() {
		// Target Stream 준비
		FileWriter fw=null;
		
		try {
			// 경로 지정
			fw=new FileWriter("src/day18/result/child.txt");
			/* 1. 한 글자만 저장해봅시다.
			char ch='C';
			fw.write(ch);
			*/
			// 2. 여러 글자를 저장해보자.
			// 문자열 준비
			String str="\t\t\tChild\r\n\t\t\t\tMark";
			/*	여기선 문자 단위로 처리해야되긴 때문에
				String을 준비한다.
				문자열을 문자배열로 변환 시켜주는 함수
			 */
//			char[] buff=str.toCharArray(); // 를 쓴다!
//			fw.write(buff);
			/*	+ char 단위는 텍스트 데이터만 처리하도록 되어있어
				  기본 함수에 문자 처리 기능이 추가되었다.
			 */
			fw.write(str);
			
			// 출력
			System.out.println("***I'm a child, 네가 바란대론 못 돼***");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileStream01();
	}
}
