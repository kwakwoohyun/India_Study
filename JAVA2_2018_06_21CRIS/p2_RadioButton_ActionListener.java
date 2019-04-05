package JAVA2_2018_06_21CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p2_RadioButton_ActionListener extends JFrame implements ActionListener {
	JRadioButton rb1, rb2;
	JButton b;

	p2_RadioButton_ActionListener() {
		rb1 = new JRadioButton("Male");
		rb1.setBounds(100, 50, 100, 30);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(100, 100, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b = new JButton("Click");
		b.setBounds(100, 150, 80, 30);
		b.addActionListener(this);
		add(rb1);
		add(rb2);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p2_RadioButton_ActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "YOU ARE MALE");
		}
		if (rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "YOU ARE FEMALE");
		}
	}

}
