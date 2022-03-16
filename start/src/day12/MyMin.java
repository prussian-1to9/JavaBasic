package day12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyMin {
	JFrame fr;
	JButton btn1, btn2, btn3;
	JPanel mainP, bPan;
	
	public MyMin() {
		fr=new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainP=new JPanel();
		mainP.setPreferredSize(new Dimension(280, 450));
		mainP.setBackground(Color.BLUE);
		
		bPan=new JPanel();
		bPan.setLayout(new GridLayout(1, 2));
		
		btn1=new JButton("Close all");
		btn2=new JButton("Add");
		btn3=new JButton("Transfer");
		
		// add Close Inner class
		ActionListener act=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}; 
		//TODO 선생님 파일 보고 뭐가 다른지 분석해보아용.
		
		ActionListener trans=new MyEvt();
		ActionListener transf=new Trans(this);
		// 두가지 방법으로 기능 구현 한거임
		
		btn1.addActionListener(act);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyMin();
			}	
		});
		btn3.addActionListener(trans);
		
		bPan.add(btn1);
		bPan.add(btn2);
		bPan.add(btn3);
		
		fr.add(mainP, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		fr.setVisible(true);
		fr.setSize(300, 500);
	}

	public static void main(String[] args) {
		new MyMin();
	}
	
	class MyEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int red=(int)(Math.random()*256);
			int green=(int)(Math.random()*256);
			int blue=(int)(Math.random()*256);

			Color c=new Color(red, green, blue);
			
			mainP.setBackground(c);
		}
	}
}
