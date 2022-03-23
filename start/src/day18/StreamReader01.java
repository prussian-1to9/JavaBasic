package day18;
/*
	result 폴더의 child.txt 파일을 읽어봅시다!
	
	Target Stream은 byte 기반
	Filter Stream은 char 기반으로 연결해서 처리해봅시다.
	
	+ Stream 사용시 주의사항
		1. 방향이 같아야 함!
		2. 크기도 같아야 함!
	근데 위의 조건처럼, 다른계열의 Stream을 연결해 사용해야 하면
	
	InputStreamReader / OutputStreamWriter 를 이용해 연결한다.
	
	주의사항
		반드시 기본 스트림은 byte 기반, 필터 스트림은 char 기반
		이 꼭 지켜져야 함!
 */
import java.io.*;
public class StreamReader01 {// Test08

	public StreamReader01() {
		// Target Stream
		FileInputStream fin=null;
		// Filter filtered Stream
		InputStreamReader isr=null;
		// Filter Stream
		BufferedReader br=null;
		
		try {
			// Stream 입력
			fin=new FileInputStream("src/day18/result/child.txt");
			isr=new InputStreamReader(fin);
			br=new BufferedReader(isr);
			
			// 몇 번 읽어야 할지 모르니
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				
				// 출력
				System.out.println(str);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				fin.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new StreamReader01();
	}
}
