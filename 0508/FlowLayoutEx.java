package ch08;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		
		// 왼쪽 정렬로, 수평 간격을 30, 수직 간격을 40 픽셀로 배치하는 FlowLayout 생성
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		contentPane.add(new JButton("WHAT?"));
		contentPane.add(new JButton("WHAT?"));
		contentPane.add(new JButton("WHAT?"));
		contentPane.add(new JButton("WHAT?"));
		setSize(1080, 720); // 프레임 크기 300x200 설정
		setVisible(true); // 화면에 프레임 출력
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}