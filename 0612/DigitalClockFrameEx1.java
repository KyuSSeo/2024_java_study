package ch12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClockFrameEx1 extends JFrame {
	public DigitalClockFrameEx1() {
		setTitle("디지탈 시계 만들기");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel day = new JLabel(makeDateText());
		
		Container c = getContentPane();
		c.add(new MyLabel(), BorderLayout.CENTER); // 컨텐트팬의 CENTER에 붙임
		c.add(day,BorderLayout.SOUTH);
		day.setFont(new Font("TimesRoman", Font.ITALIC, 50));
		day.setHorizontalAlignment(JLabel.CENTER);
		setSize(500,400);
		setVisible(true);
	}
	public String makeDateText() {
		Calendar c = Calendar.getInstance();			
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		
		
		String clockText = Integer.toString(year);
		clockText = clockText.concat("년");
		clockText = clockText.concat(Integer.toString(month));
		clockText = clockText.concat("월");
		clockText = clockText.concat(Integer.toString(day));
		clockText = clockText.concat("일");
		
		return clockText;
	}
	
	class MyLabel extends JLabel implements Runnable {
		private Thread timerThread = null;
		public MyLabel() {
			setText(makeClockText());
			setFont(new Font("TimesRoman", Font.ITALIC, 50));
			setHorizontalAlignment(JLabel.CENTER);
			
			
			
			timerThread = new Thread(MyLabel.this);
			timerThread.start();
		}
		
		public String makeClockText() {
			Calendar c = Calendar.getInstance();			
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));
			
			return clockText;
			
		}
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e){return;}
				setText(makeClockText());
			}
		}
	}
	
	public static void main(String [] args) {
		new DigitalClockFrameEx1();
	}
} 
