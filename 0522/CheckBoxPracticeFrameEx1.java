package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class CheckBoxPracticeFrameEx extends JFrame {
	private JButton btn = new JButton("test button");
	private JLabel label = new JLabel("");
	public CheckBoxPracticeFrameEx() {
		super("CheckBox Practice Frame");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JRadioButton a = new JRadioButton("버튼 비활성화");
		JRadioButton b = new JRadioButton("버튼 감추기");
		
		c.add(a);
		c.add(b);		
		c.add(btn);
		c.add(label);
		
		a.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
					label.setText("버튼 비활성화");
				}
				else {
					btn.setEnabled(true);
					label.setText("버튼 활성화");
				}
			}
		});
		b.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
					label.setText("버튼 감추기");
				}
				else {
					btn.setVisible(true);
					label.setText("버튼 보이기");
				}
			}
		});

		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxPracticeFrameEx();
	}
}