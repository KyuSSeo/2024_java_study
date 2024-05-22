package ch09;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyPlusMinusFrameEx extends JFrame {
	public KeyPlusMinusFrameEx() {
		super("+,- 키로 폰트 크기 조절");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
	
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); // 10 픽셀 크기
		label.addMouseListener(new MouseAdapter() {
			@Override
			 public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) { // 왼쪽 버튼
                	JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 
                } else if (e.getButton() == MouseEvent.BUTTON3) { // 오른쪽 버튼
                	JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); 
                    }
                }
        });

		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
	static public void main(String [] args) {
		new KeyPlusMinusFrameEx();
	}
}