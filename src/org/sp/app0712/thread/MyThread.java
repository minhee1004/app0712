package org.sp.app0712.thread;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JProgressBar;

//프로그래스바를 증가시키는 쓰레드 정의
public class MyThread extends Thread{
	int interval;
	JProgressBar bar;
	int n;
	
	public MyThread(int interval, JProgressBar bar) {
		this.interval=interval;
		this.bar= bar;
	}
	
	public void increase() {
		n++;
		bar.setValue(n);
		bar.setFont(new Font("돋음",Font.BOLD, 20));
		bar.setForeground(Color.BLUE);
		bar.setString(Integer.toString(n));
		bar.setStringPainted(true);
		bar.setBackground(Color.GRAY);
	}
	
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			increase();
		}
	}

}
