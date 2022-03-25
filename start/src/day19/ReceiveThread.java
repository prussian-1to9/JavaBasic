package day19;

import java.net.*;
public class ReceiveThread extends Thread {
	// 생성자 작성
	DirectMessage main;
	public ReceiveThread(DirectMessage main) {
		this.main=main;
	}

	@Override
	public void run() {
		// 받아야 할 쪽지가 있는지 반복해서 확인
		while(true) {
			try {
				// 쪽지를 받으면 Packet으로 도착한다.
				// Packet 준비
				byte[] buff=new byte[10240];
				DatagramPacket pack=new DatagramPacket(buff, 10240);
				
				// 데이터 전송
				main.rSocket.receive(pack);
				System.out.println("***new DM***");
				/*	receive() 함수도 Blocking 메소드임.
					packet이 도착했을 때 실행됨.
					도착한 패킷을 대화상자를 이용해 출력. */
				receiveProc(pack);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// 데이터 받으면 받은 쪽지를 처리해 주는 함수
	public void receiveProc(DatagramPacket pack) {
		// 포장 뜯어 내용 확인!
		byte[] buff=pack.getData();
		String msg=new String(buff, 0, buff.length);
		
		// 보낸 사람 정보 확인
		InetAddress addr=pack.getAddress();
		String ip=addr.getHostAddress();
		System.out.println("******"+ip);
		
		// 아이피에 해당하는 사람 꺼내오기
		String name=main.ipToName.getProperty(ip);
		
		ReceiveDlg dlg=new ReceiveDlg(main);
		dlg.field.setText(name);
		dlg.area.setText(msg);
	}
}
