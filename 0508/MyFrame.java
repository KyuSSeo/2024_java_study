package ch08;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("취소")); 
		
		
		setSize(400,200); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	
	public static void main(String[] args) {
		new MyFrame("Let's Study Java");
	}
}
