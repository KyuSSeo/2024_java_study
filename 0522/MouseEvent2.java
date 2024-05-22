package ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2 extends JFrame {
	public MouseEvent2() {
		super("1");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
				
		JLabel label = new JLabel("자기야");
		label.setForeground(Color.RED);
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
				c.setBackground(Color.GREEN);
			}
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("자기야");
				c.setBackground(Color.GREEN);
			}
		});
		
		c.add(label);
		
		MyMouseListener ml = new MyMouseListener();
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		
		setSize(250,150);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.GREEN);
		}		
	}
	static public void main(String [] args) {
		new MouseEvent2();
	}
}