package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RandomCircleFrameEx extends JFrame {
	public RandomCircleFrameEx() {
		super("원을 0.5초 간격으로 랜덤한 위치로 이동시키는 스레드");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel time = new JLabel();		// 변경
		time.setFont(new Font("Gothic", Font.ITALIC, 40));  	// 추가
		
		setContentPane(new CirclePanel(time));   // 변경

		
		Container c = getContentPane();		// 추가
		c.setLayout(new FlowLayout());		// 추가	
		c.add(time);		// 추가
		
		
		setSize(250,250);
		setVisible(true);
	}
	
	class CirclePanel extends JPanel implements Runnable {
		JLabel time;		// 추가
		int n = 0;
		private int x = 100; // 원이 그려지는 위치
		private int y = 100;
		
		public CirclePanel(JLabel time) {		// 변경
			this.time = time;			// 추가
			this.addMouseListener(new MouseAdapter() {
				private Thread th = null;
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(th == null) { // 스레드가 아직 만들어지지 않았을 때만 스레드 생성
						th = new Thread(CirclePanel.this);
						th.start();
					}
				}
			});
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.drawOval(x, y, 50, 50); // (x, y)에서 50x50 크기 원
			g.setColor(Color.GREEN);  // 추가
			g.drawRoundRect(x-y, x-y, 50, 50, 10, 10);
		}
		
		@Override
		public void run() {

			while(true) {
				try {
					
					time.setText(Integer.toString(n++));		// 추가
					
					Thread.sleep(400);
				} catch (InterruptedException e) { return; }
				
				// 원이 그려지는 위치를 랜덤하게 갱신
				x = (int)(Math.random()*this.getWidth()); // 패널의 범위 내에서 선택
				y = (int)(Math.random()*this.getHeight());
				repaint();
			}
		}		
	}
	
	public static void main(String[] args) {
		new RandomCircleFrameEx();
	}
}
