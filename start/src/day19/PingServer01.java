package day19;
/*
	클라이언트가 접속하면 접속을 삳고
	클라이언트가 준 데이터를 받아본 다음
	적당한 내용으로 응답하는 서버를 만들어봅시다.
 */
import java.net.*;
import java.io.*;
public class PingServer01 {

	public PingServer01() {
		ServerSocket server=null;
		try {
			// 7777번으로 접속 요청하는 것을 받을 준비
			server=new ServerSocket(7777);
			System.out.println("서버 접속 대기");
			
			// 반환값으로 실제로 통신할 전화기를 배정한다.
			// Blocking 함수 : 특정 조건 충족해야 실행
			Socket socket=server.accept();
			// accpet 함수의 조건은 '누군가의 접속시도'이다!
			System.out.println("서버 접속 완료");
			
			/*
				여기까지 실행됐다는건
				누군가 접속했으며, 전화기도 배정이 됐다는 것이다.
				
				우리는 java기반이기 때문에, Stream을 이용해 통신함.
			 */
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			
			// 데이터를 받아봅시당.
			byte[] buff=new byte[1024];
			int len=in.read(buff);
			String msg=new String(buff, 0, len);
			
			// 출력
			System.out.println("받은 메세지"+msg);
			
			// 적당한 메세지로 응답
			msg+="-> Re : 잘받았습니다.";
			buff=msg.getBytes();
			
			// 스트림에 보낸다.
			out.write(buff);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingServer01();
	}
}
