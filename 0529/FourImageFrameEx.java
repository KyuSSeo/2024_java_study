package ch10;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FourImageFrameEx extends JFrame {
	public FourImageFrameEx() {
		super("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new BorderLayout(20,20));
		
		ImageIcon img [] = new ImageIcon [4];
		img[0] = new ImageIcon("images/img1.jpg");
		img[1] = new ImageIcon("images/img2.jpg");
		img[2] = new ImageIcon("images/img3.jpg");
		img[3] = new ImageIcon("images/img4.jpg");
		
		
		c.add(new JButton("총괄"), BorderLayout.CENTER);
		c.add(new JLabel(img[0]), BorderLayout.NORTH);
		c.add(new JLabel(img[1]), BorderLayout.SOUTH);
		c.add(new JLabel(img[2]), BorderLayout.EAST);
		c.add(new JLabel(img[3]), BorderLayout.WEST);
		
		setSize(600, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FourImageFrameEx();
	}

}
