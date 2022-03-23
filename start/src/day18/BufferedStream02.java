package day18;
/*
	1. Buffered Reader / Writer 사용해서 파일을 복사해봅시다.
	2. PrintWriter를 이용해 child.txt 파일을 복사해봅시다.
 */
import java.io.*;
public class BufferedStream02 {// Test05

	public BufferedStream02() {
		// Target Stream 작성
		FileReader fr=null;
		FileWriter fw=null;
		// Filter Stream 작성
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		// 2. PrintWriter 이용
		PrintWriter pw=null;
		
		try {
			// Stream 연결 : In
			fr=new FileReader("src/day18/result/child.txt");
			br=new BufferedReader(fr);
			
			/* 1. Buffered Writer를 이용
			fw=new FileWriter("src/day18/result/child_01.txt");
			bw=new BufferedWriter(fw);
			
			
			// 몇번을 반복해야 할지 모름!
			while(true) {
				// 읽어오기
				String str=br.readLine();
				if(str==null) break;
				
				// 1. OutputStream에 넣어주기
				bw.write(str+"\r\n"); // 사라진 엔터 기입
				bw.flush();
			}
			*/
			// 2. PrintWriter를 이용
			pw=new PrintWriter("src/day18/result/child_02.txt");

			// 동일하게
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				
				pw.println(str);
				pw.flush();
			}
			
			// 결과 출력
			System.out.println("복사 성공쓰");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new BufferedStream02();
	}
}
