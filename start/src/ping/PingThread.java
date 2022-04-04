package ping;
/*
Thread 프로그램으로 실행될 PingThread 클래스를 작성하시오.

	1. 실행 메소드 override, 필요에 따라 예외처리
	2. 실행 메소드 실행시 연결요청을 기다리도록 소켓이 구성되게
	3. 클라이언트와 통신할 수 있는 doResponse 란 이름의 메소드 제작, 호출되게
	4. 사용이 끝난 자원은 반환해주도록, close라는 이름의 메소드 작성 후 실행 메소드에서 호출되게
	
PingeServer프로그램을 제어할 PingServer 클래스를 작성하시오.
	1. 콘솔화면에서 입력을 받아 start를 입력받으면 PingThread가 Thread 프로그램이 실행되게 하고
		quit 를 입력하면 종료되도록.
	2. 서버가 이미 실행중인데 start 입력시 "이미 서버가 실행중입니다."를 출력하고 다시 Thread 프로그램이 실행되지 않게.
*/
import java.io.*;
import java.net.*;
public class PingThread extends Thread {
	private boolean isStart=true; // 예외 방지를 위해 초기화
	private ServerSocket server; // 서버 소켓
	private Socket socket; // 클라이언트 소켓
	private InputStream in;
	private OutputStream out;
	
	// Getter Setter
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public ServerSocket getServer() {
		return server;
	}
	public void setServer(ServerSocket server) {
		this.server = server;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	public InputStream getIn() {
		return in;
	}
	public void setIn(InputStream in) {
		this.in = in;
	}
	public OutputStream getOut() {
		return out;
	}
	public void setOut(OutputStream out) {
		this.out = out;
	}
	
	// Thread 실행 메소드
	@Override
	public void run() {
		
		try {
			// server 기본정보 셋팅
			server=new ServerSocket(1209);
			System.out.println("서버 실행 중");
			
			// 응답
			doResponse();
			
		}catch(SocketException e) {
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
				socket.close();
				server.close();
			}catch(Exception e) {}
		}
		
	}
	
	// 클라이언트에 응답하는 함수
	public void doResponse() throws SocketException, Exception{
		while(isStart) { // 닫을때 자연스럽게 닫히도록.
			socket=server.accept(); // client에게 소켓 주기
						
			// client에서 온 데이터 받기
			byte[] buff=new byte[10240];
			int len=in.read(buff);
			String cmsg=new String(buff, 0, len);
			
			// 받은 정보 돌려주기
			System.out.println(cmsg);
			
			// response
			buff=new String(cmsg+"라구요? 그렇군요.").getBytes();
			out.write(buff);
			
		}		
	}
	
	// 안쓰는 것들 다 닫아주는 함수
	public void closeAll() {
		try {
			out.close();
			in.close();
			socket.close();
			server.close();
		}catch(Exception e) {}
	}
}
