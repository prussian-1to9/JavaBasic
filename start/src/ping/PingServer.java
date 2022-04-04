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
import java.util.*;
public class PingServer {
	private boolean bool=true; // 서버가 실행중이면 false
	private PingThread ping;
	private Scanner sc;	// 값 입력받기
	
	public PingServer() {
		// 메모리 확보
		ping=new PingThread();
		sc=new Scanner(System.in);
		
		loop: // 계속 입력할 수 있게..
		while(true) {
			// 안내문구 출력
			System.out.println("핑서버 프로그램 시작 : start 종료 : quit");
			String trigger=sc.nextLine();
			
			switch (trigger) {
			case "start": // start를 입력했을 경우

				if (bool) {// 최초 실행
					ping.start(); // runnable로 전위
					bool=false; // 서버 실행중으로 전환
					break;
				}
				
				break;
				
			case "quit":
				// 안내문구 출력
				System.out.println("핑서버 프로그램을 종료합니다.");
				
				ping.setStart(false); // 자연스럽게 종료되도록
				try {
					ping.closeAll();
				}catch(Exception e) {}
				break loop;
							
			}
		}
	}
	
	public static void main(String[] args) {
		new PingServer();
	}
}
