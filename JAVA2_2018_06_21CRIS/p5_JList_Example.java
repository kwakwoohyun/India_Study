package JAVA2_2018_06_21CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p5_JList_Example {
	p5_JList_Example() {
		JFrame f = new JFrame();
		final JLabel label = new JLabel();
		label.setSize(500, 100);
		JButton b = new JButton("Show");
		b.setBounds(200, 150, 80, 30);
		final DefaultListModel<String> l1 = new DefaultListModel<String>();
		l1.addElement("C");
		l1.addElement("C++");
		l1.addElement("JAVA");
		l1.addElement("PHP");
		final JList<String> list1 = new JList<String>(l1);
		list1.setBounds(100, 100, 75, 75);
		DefaultListModel<String> l2 = new DefaultListModel<String>();
		l2.addElement("Turbo C++");
		l2.addElement("Stuts");
		l2.addElement("Spring");
		l2.addElement("YII");
		final JList<String> list2 = new JList<String>(l2);
		list2.setBounds(100, 200, 75, 75);
		f.add(list1);
		f.add(list2);
		f.add(b);
		f.add(label);
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String data = "";
				if (list1.getSelectedIndex() != -1) {
					data = "Programming language Selected : " + list1.getSelectedValue();
					label.setText(data);
				}
				if (list2.getSelectedIndex() != -1) {
					data = data + " , FrameWork Selected : ";
					for (Object frame : list2.getSelectedValues()) {
						data = data + frame + "";
					}
				}
				label.setText(data);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p5_JList_Example();
	}

}
