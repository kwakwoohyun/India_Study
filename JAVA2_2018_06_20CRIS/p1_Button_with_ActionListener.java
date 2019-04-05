package JAVA2_2018_06_20CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p1_Button_with_ActionListener {
	p1_Button_with_ActionListener() {
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b = new JButton("Click Here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Welcome to Swing");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p1_Button_with_ActionListener();
	}

}
