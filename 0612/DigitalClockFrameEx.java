package ch12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClockFrameEx extends JFrame {
	public DigitalClockFrameEx() {
		setTitle("디지탈 시계 만들기");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();

		c.setLayout(new BorderLayout());		// 추가	
		JLabel label =new JLabel(makeDay());	// 추가	
		label.setHorizontalAlignment(JLabel.CENTER); //JLabel 가운데 정렬
		label.setFont(new Font("TimesRoman", Font.ITALIC, 40)); // 추가	
		c.add(label, BorderLayout.SOUTH);	// 추가	
		
		
		c.add(new MyLabel(), BorderLayout.CENTER); // 컨텐트팬의 CENTER에 붙임
		
		setSize(300,200);
		setVisible(true);
	}


	public String makeDay() {		// 추가
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR); //Calendar 인스턴스에 있는 저장된 필드 값을 가져옴
        int month = cal.get(Calendar.MONTH); 
        int day = cal.get(Calendar.DATE);
        
        String ymd = Integer.toString(year);
        ymd = ymd.concat("년");
        ymd = ymd.concat(Integer.toString(month+1));
        ymd = ymd.concat("월");
        ymd = ymd.concat(Integer.toString(month));
        ymd = ymd.concat("일");

		return ymd;
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
		new DigitalClockFrameEx();
	}
} 
