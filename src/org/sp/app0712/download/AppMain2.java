package org.sp.app0712.download;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class AppMain2 extends JFrame{
	JTextField t_url; //수집하고 싶은 자원의 주소를 넣는 영역
	JButton bt_dest;
	JLabel la_dest; 
	JButton bt_down;
	JProgressBar bar;
	
	
	public AppMain2() {
		t_url = new JTextField();
		bt_dest = new JButton("저장할 위치");
		la_dest = new JLabel("저장할 위치를 등록해 주세요");
		bt_down= new JButton("DownLoad");
		bar = new JProgressBar();
		
		//스타일
		t_url.setPreferredSize(new Dimension(680,50));
		la_dest.setPreferredSize(new Dimension(550,50));
		bar.setPreferredSize(new Dimension(680,60));
		bar.setStringPainted(true);
		bar.setFont(new Font("돋음",Font.BOLD | Font.ITALIC,25));
		
		setLayout(new FlowLayout());
		
		add(t_url);
		add(bt_dest);
		add(la_dest);
		add(bt_down);
		add(bar);
		
		
		setSize(700,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new AppMain2();
	}
}
