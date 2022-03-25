package day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;

public class MsgWrite {
	DirectMessage dm;
	
	JFrame frame;
	JTextField field;	// single line
	JTextArea area;		// multi line
	
	JButton sendB, clearB, closeB;
	
	public MsgWrite(DirectMessage dm) {
		// DM 객체 받기
		this.dm=dm;
		
		// 틀
		frame=new JFrame("---메세지 작성---");
		field=new JTextField();
		area=new JTextArea();
		JScrollPane sp=new JScrollPane(area);
		
		// 버튼
		sendB=new JButton("Send");
		clearB=new JButton("Clear");
		closeB=new JButton("Close");
		
		JPanel bPan=new JPanel(new GridLayout(1, 3));
		
		bPan.add(sendB);
		bPan.add(clearB);
		bPan.add(closeB);
		
		// 버튼에 내용 넣어주기
		WriteEvt evt=new WriteEvt(this);
		sendB.addActionListener(evt);
		clearB.addActionListener(evt);
		closeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				dm.frame.setVisible(true);
				frame.dispose();	// 현재 창만 닫기
			}
		});
		
		// 보이게 하기
		frame.add(field, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		frame.add(bPan, BorderLayout.SOUTH);
		
		frame.setSize(500, 700);
		frame.setVisible(true);
	}

}
