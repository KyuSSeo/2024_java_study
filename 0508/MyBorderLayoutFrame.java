package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyBorderLayoutFrame extends JFrame {
	public MyBorderLayoutFrame() {
		super("BorderLayout Practice"); // setTitle("BorderLayout Practice")와 동일
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel a = new JPanel();
		JLabel obutton = new JLabel("Center");
		
		a.add(obutton);
		a.setBackground(Color.yellow);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(50, 0));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		
		c.add(a, BorderLayout.CENTER);
		
		
		
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyBorderLayoutFrame();
	}
}
