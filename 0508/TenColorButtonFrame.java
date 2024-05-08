package ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TenColorButtonFrame extends JFrame {
	public TenColorButtonFrame() {
		super("Ten Color Buttons Frame");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1, 15, 5));
		
		JButton [] btn = new JButton [3];
		Color [] color = {Color.RED, Color.GREEN, Color.BLUE}; 

		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TenColorButtonFrame();
	}

}
