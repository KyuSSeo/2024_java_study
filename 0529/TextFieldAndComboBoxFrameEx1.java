package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TextFieldAndComboBoxFrame extends JFrame {
	private JTextField tf = new JTextField(10);
	private JComboBox<String> combo = new JComboBox<String>();
	private Vector<String> v = new Vector<String>();
	private JList<String> list = new JList<String>(v);
    private DefaultListModel<String> listModel = new DefaultListModel<>();


	public TextFieldAndComboBoxFrame() {
		super("JTextField and JComboBox Frame");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);
		c.add(combo);		
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				String text = t.getText();
				combo.addItem(t.getText());
			    listModel.addElement(text);
			}
		});
		
         list = new JList<>(listModel);
	     list.setVisibleRowCount(3);
	     list.setFixedCellWidth(100);
	     JScrollPane scrollPane = new JScrollPane(list);
	     c.add(scrollPane);

		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldAndComboBoxFrame();
	}
}
