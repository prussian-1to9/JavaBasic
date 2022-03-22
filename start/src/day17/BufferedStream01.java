package day17;
/*
	파일에 내용을 저장하는 프로그램을 작성하시오.
	단, BufferedStream을 사용하시오.
 */
import java.io.*;
public class BufferedStream01 {// Test08

	public BufferedStream01() {
		// 1. 장치에 기본스트림(Target Stream) 연결
		FileOutputStream fout=null;
		
		// 2. 필요에 따라 Filter Stream 연결
		BufferedOutputStream bout=null;
		
		try {
			fout=new FileOutputStream("src/day17/result/bufferTest01.txt");
			bout=new BufferedOutputStream(fout);
			
			// 내용 만들기
			String str="아냐 어떤 말로도 설명할 수 없어, 그래 나에겐 너뿐이 야하학!";
			// byte배열로 변환
			byte[] buff=str.getBytes();
			
			// 데이터-> 보조 스트림
			bout.write(buff); // buffer가 다 채워지지 않아 fout으로 안넘어감.
			// 반드시 습관적으로 작업이 완료되었을 때 버퍼를 비워주는게 중요.
			bout.flush(); //비우고 내보냄
			
			System.out.println("#런쥔아_귀여웠어");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedStream01();
	}
}
