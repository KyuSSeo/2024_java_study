package ch08;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		
		// 컨텐트팬에 BorderLayout 배치관리자 설정
		contentPane.setLayout(new BorderLayout(50, 5)); 
		
		contentPane.add(new JButton("WHAT?"), BorderLayout.CENTER);
		contentPane.add(new JButton("add"), BorderLayout.NORTH);
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH);

		setSize(1080, 720); // 프레임 크기 300x200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
