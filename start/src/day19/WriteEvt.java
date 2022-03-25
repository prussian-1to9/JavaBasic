package day19;

import java.awt.event.*;
import java.net.*;
public class WriteEvt implements ActionListener{
	MsgWrite main;
	
	public WriteEvt(MsgWrite main) {
		this.main=main;
	}

	@Override	// event override
	public void actionPerformed(ActionEvent e) {
		// 어떤 버튼이 눌렸는지 알아내기
		String str=e.getActionCommand();
		if(str.equals("Clear")) {
			main.area.setText("");
		}else if(str.equals("Send")) {
			
		};
	}
	
	// 쪽지보내기 전담 처리 함수
	public void sendProc() {
		// 보낼 내용 도출
		String msg=main.area.getText();
		// 바이트 배열로 변환
		byte[] buff=msg.getBytes();
		
		// 상대방 IP 알아내기
		// 이름 읽어오기
		String name=main.field.getText();
		String ip=(String) main.dm.nameToIp.get(name);
		
		InetAddress inet=null;
		try {
			inet=InetAddress.getByName(ip);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이것을 패킷으로 포장
		DatagramPacket pack=null;
		try {
			// 이러면 패킷이 만들어 졌고, 만들어진 Packet을 네트워크에!
			pack=new DatagramPacket(buff, buff.length, inet, 7777);
			main.dm.sSocket.send(pack);
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 이 작업이 완료되면 전송 완료 됐으므로
		// 현재 작업창을 닫고 메인 창을 띄운다.
		main.frame.dispose();
		main.dm.frame.setVisible(true);
	}
}
