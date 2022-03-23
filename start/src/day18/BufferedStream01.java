package day18;
/*
	BufferedReader 사용해서 child.txt 파일을 읽어보자.
 */
import java.io.*;
public class BufferedStream01 {// Test04

	public BufferedStream01() {
		// Target Stream + Filter Stream 제작
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			// 경로 설정
			fr=new FileReader("src/day18/result/child.txt");
			br=new BufferedReader(fr);
			
			// 읽은 데이터 기억할 배열 만들기
			byte[] buff=new byte[1024];
			// 몇번 읽어야 되는지 모르니까!
			while(true) {
				String line=br.readLine();
				if (line==null)break;	// 읽은 데이터가 없을 때.
				System.out.println(line);
				
				/*	println() 함수는 내용을 출력한 뒤 줄을 바꿈.
					이미 readLine()에서 한 줄을 읽을 때
					\n을 버렸기 때문에, 자동으로 줄이 바뀌진 X.
					그래서 print가 아닌 ln을 썼다.
				 */
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedStream01();
	}
}
