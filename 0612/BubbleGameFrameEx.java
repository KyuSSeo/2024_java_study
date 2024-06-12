package ch12;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BubbleGameFrameEx extends JFrame{
	public BubbleGameFrameEx() {
		setTitle("버블 게임");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel1 p = new GamePanel1();
		
		p.setFocusable(true);		// 추가
		p.requestFocus();		// 추가

		setContentPane(p);
		setSize(300,300);	
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new BubbleGameFrameEx();
	}
}

class GamePanel1 extends JPanel {
	public GamePanel1() {
		setLayout(null);
		
		addMouseListener(new MouseAdapter() {		
			@Override
			public void mousePressed(MouseEvent e) {
				BubbleThread1 bubbleThread = new BubbleThread1(e.getX(), e.getY());
				bubbleThread.start();
			}
		});
		 		
		addKeyListener (new KeyAdapter() {		// 추가	
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub				
				BubbleThread1 bubbleThread = new BubbleThread1(e.getKeyChar());
				bubbleThread.start();
			}
		});
	}
	
	class BubbleThread1 extends Thread {
		private JLabel bubble;
		
		public BubbleThread1(int bubbleX) {		// 추가
			bubble = new JLabel(Character.toString(bubbleX));
			bubble.setSize(bubbleX,bubbleX);
			bubble.setLocation(bubbleX, bubbleX);
			bubble.setFont(new Font("Serif",Font.BOLD,30));
			add(bubble); // GamePanel에 add()
		}		
		
		public BubbleThread1(int bubbleX, int bubbleY) {
			ImageIcon img = new ImageIcon("images/bubble.jpg");
			bubble = new JLabel(img);
			bubble.setSize(img.getIconWidth(),img.getIconWidth());
			bubble.setLocation(bubbleX, bubbleY);
			add(bubble); // GamePanel에 add()
		}
		
		@Override
		public void run() {
			while(true) {
				int x = bubble.getX() ;
				int y = bubble.getY() - 5;
				if(y < 0) {
					GamePanel1.this.remove(bubble); // 컴포넌트 제거
					return; // thread ends
				}
				bubble.setLocation(x, y); // 컴포넌트 위치 이동
				try {
					sleep(200);
				}
				catch(InterruptedException e) {}
			}
		}
	}
}
