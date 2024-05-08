package ch08;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		setTitle("SWIP Frame Making");
		setSize(1080,720); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	
	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2();
	}
}
