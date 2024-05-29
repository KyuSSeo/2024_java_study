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
	private JLabel lab1;
	private JLabel lab2;
	private JButton btn = new JButton("test button");
	public CheckBoxPracticeFrameEx() {
		super("CheckBox Practice Frame");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JRadioButton b1 =  new JRadioButton("버튼 비활성화");
		JRadioButton b2 =  new JRadioButton("버튼 감추기");
		
		lab1 = new JLabel(" ");
		
		c.add(b1);
		c.add(b2);		
		c.add(btn);
		c.add(lab1);
		
		lab1.setVisible(false);
		
		b1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
					lab1.setText("버튼 활성화");
					lab1.setVisible(true);
				}
				else {
					btn.setEnabled(true);
					lab1.setText("버튼 비활성화");
					lab1.setVisible(true);
				}
				}
		});
		b2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
					lab1.setText("버튼 감추기");
					lab1.setVisible(true);
					}
				else {
					btn.setVisible(true);
					lab1.setText("버튼 보이기");
					lab1.setVisible(true);
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
