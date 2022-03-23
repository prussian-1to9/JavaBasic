package day18;
/*
	이미지 파일을 문자단위 스트림으로 복사해보자.
	result /
		rj.jpg	--->	rj_copy.jpg
	
	원칙은 문자단위 스트림으로 주고받으면 X!
	byte코드가 역순이 될 수 있기 때문.
	
	복사된 파일이 안보이는게 정상임!
 */
import java.io.*;
public class FileStream03 {// Test03

	public FileStream03() {
		// Target Strem 작성 : In/Out
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader("src/day18/result/rj.jpg");
			fw=new FileWriter("src/day18/result/rj_copy.jpg");
			
			// 몇 번 반복해야되는지 모르니까~
			char[] buff=new char[1024];
			
			// Input 작업
			while(true) {
				// 읽어서 배열에 채우기
				int len=fr.read(buff);
				if (len==-1) break;
				
				// Output 작업
				fw.write(buff, 0, len);
			}
			
			System.out.println("칠링런쥔 복사 끗 ^,^");
			System.out.println("(오류가 났을 겁니당)");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileStream03();
	}
}
