package day19;
/*
	서버에 접속한 후 특정 데이터를 서버에 보내면
	서버가 응답하는 데이터를 받는 프로그램을 만들어보자.
 */
import java.io.*;
import java.net.*;
public class PingClient01 {

	public PingClient01() {
		/*	상대방과 통신하기 위해선 통신 도구가 필요하다.
			이 통신 도구의 역할을 하는 클래스가 Socket임!
		 */
		Socket socket=null;	// 예외가 발생할 수 있으니 초기화
		
		// Target Stream
		InputStream in=null;
		OutputStream out=null;
		
		try {// 일단 쌤 컴퓨터로 보내봅시다.
			socket=new Socket("192.168.0.15", 7777);
			/*
				Port번호는 접속받는 프로그램에서 지정한 번호여야 함
				이제 접속이 됐으므로, 통신만 하면 된다.
				
				통신방법
					1. Target stream
						getInputStream() / getOutputStream()
			 */
			in=socket.getInputStream();
			out=socket.getOutputStream();
			
			// 스트림이 준비됐으니, 데이터를 서버에 전달해보자.
			String msg="계속 time out 이래요... 우얄꼬";
			// 바이트 계열로 변환
			byte[] buff=msg.getBytes();
			
			// 서버에 보내기
			out.write(buff);
			
			// 메세지를 보냈으니, 서버의 응답이 있을 것.
			// 응답메세지를 입력받아, 출력해보자
			buff=new byte[1024];
			int len=in.read(buff);
			msg=new String(buff, 0, len);
			
			// 출력
			System.out.println("서버가 보낸 메세지 : "+msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PingClient01();
	}
}