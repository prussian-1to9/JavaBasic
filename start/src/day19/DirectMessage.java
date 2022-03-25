package day19;
/*
	강의실에 있는 사람들 : 자기 컴퓨터의 아이피와 이름을 카톡으로.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.net.*;
import java.util.*;
public class DirectMessage {
	// 이름을 알려주면 주소 도출하는 Map, 혹은 그 반대 Map
	Properties nameToIp, ipToName;
	
	JList list;
	JButton sendB;
	JFrame frame;
	
	DatagramSocket sSocket, rSocket;
	/*	sSocket은 쪽지를 보내기 위한 것(send)
		rSocket은 쪽지를 받기 위한 것(Receive)
		
		반드시 두개 다 만들어야 되는건 아님.
		다만
			한 소켓이 입/출력을 다하면
			보내는 도중엔 받지를 못한다.
		따라서 안전한 통신을 위해
		입력/출력 소켓을 구분한다.
	 */
	public DirectMessage() {
		setMap();
		
		// UI제작
		frame=new JFrame("***쪽지 프로그램***");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 700);
		
		// 목록 상자에 친구이름을 기록해서 넣자.
		// Map에서 친구이름만 찾아서 넣어봅쉬다~
		Set set=nameToIp.keySet();
		Vector<String> nameList=new Vector<String>(set);

		list=new JList(nameList);
		
		// 스크롤바 만들어주기
		JScrollPane sp=new JScrollPane(list);
		
		DirectMessage dm=this;
		
		// 버튼 만들기
		sendB=new JButton("Send DM");
		// 역할 만들기
		sendB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				String name=(String) list.getSelectedValue();
				frame.setVisible(false);
				MsgWrite msg=new MsgWrite(dm);
				msg.field.setText(name);
			}
		});
		
		// 버튼 자리 배정하기
		frame.add(sp, BorderLayout.CENTER);
		frame.add(sendB, BorderLayout.SOUTH);
		// 보이게 만들기
		frame.setVisible(true);
		frame.setResizable(false);
		
		/*	프로그램이 시작되었으므로, 네트워크 구성을 한다.
			UDP 방식 통신이므로 DatagramSocket을 이용.
		 */
		try {
			sSocket=new DatagramSocket();
			rSocket=new DatagramSocket(7777);
			/*	이카믄, 누군가에 접속한게 아니라
				회선에만 접속한 상태. (통신 가능한, 대기상태.)
			 */
			// 받는 프로그램인 ReceiveThread 클래스 작성, 개체 생성
			ReceiveThread t=new ReceiveThread(this);
			// 전위
			t.start();
			
		}catch(Exception e) {
			/*	예외가 발생할 경우,
				이 프로그램이 제 기능을 못하는 상태인거임
				다 닫아~	*/
			close();
			e.printStackTrace();
		}
	}
	
	// 자원 반환 함수
	public void close() {
		try {
			sSocket.close();
			rSocket.close();
		}catch(Exception e) {}
	}
	
	// 맵을 파일의 내용으로 셋팅해주는 함수
	public void setMap() {
		nameToIp=new Properties();
		ipToName=new Properties();
		
		FileInputStream fin1=null;
		FileInputStream fin2=null;
		try {
			fin1=new FileInputStream("src/day19/nameIp.properties");
			fin2=new FileInputStream("src/day19/ipName.properties");
			
			nameToIp.load(fin1);
			ipToName.load(fin2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin1.close();
				fin2.close();
			}catch(Exception e){}
		}
	}

	public static void main(String[] args) {
		new DirectMessage();
	}
}
