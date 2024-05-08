package ch08;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomLabelFrame extends JFrame {
	public RandomLabelFrame() {
		super("Random Labels");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			//label.setBackground(Color.BLUE);
			label.setForeground(Color.PINK);
			label.setBackground(Color.BLUE);
			label.setOpaque(true);
			
			int x = (int)(Math.random()*100) + 30;
			int y = (int)(Math.random()*80) + 20;
			label.setLocation(x,y);
			label.setSize(30,10);
			c.add(label);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RandomLabelFrame();
	}

}
