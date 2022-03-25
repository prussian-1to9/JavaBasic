package day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ReceiveDlg {
	DirectMessage main;
	JTextField field;
	JTextArea area;
	JButton reB, closeB;
	JFrame frame;
	
	
	public ReceiveDlg(DirectMessage main) {
		this.main=main;
	}

	public void setGui() {
		frame=new JFrame("Messages");
		field=new JTextField();
		area=new JTextArea();
		JScrollPane sp=new JScrollPane(area);
		
		// 버튼 만들기
		reB=new JButton("Reply");
		closeB=new JButton("Close");
		
		// 창, 버튼 자리 할당
		JPanel bPan=new JPanel(new GridLayout(1,2));
		bPan.add(reB);
		bPan.add(closeB);
		
		// 버튼 역할 정하기
		reB.addActionListener(new BtnEvt());
		closeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				main.frame.setVisible(true);
			}
		});
		
		// 창에 자리 배정
		frame.add(field, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		frame.add(bPan, BorderLayout.SOUTH);
		
		// 보이게 하기
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	// 사용할 클래스 생성
	class BtnEvt implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 이름 도출
			String name=field.getText();
			
			MsgWrite wr=new MsgWrite(main);
			wr.field.setText(name);
			frame.dispose();	// 창 닫기
		}
	}
}
