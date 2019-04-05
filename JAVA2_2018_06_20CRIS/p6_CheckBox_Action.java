package JAVA2_2018_06_20CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p6_CheckBox_Action {
	p6_CheckBox_Action() {
		JFrame f = new JFrame("p6_CheckBox_Action");
		final JLabel l = new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400, 100);
		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setBounds(150, 100, 50, 50);
		JCheckBox cb2 = new JCheckBox("JAVA");
		cb2.setBounds(150, 150, 50, 50);
		f.add(cb1);
		f.add(cb2);
		f.add(l);

		cb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l.setText("C++ CheckBox : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		cb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l.setText("JAVA CheckBox : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p6_CheckBox_Action();
	}

}
