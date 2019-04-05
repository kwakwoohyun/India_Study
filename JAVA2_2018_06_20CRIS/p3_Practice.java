package JAVA2_2018_06_20CRIS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class p3_Practice {
	p3_Practice() {
		JFrame f = new JFrame("Practice");
		JLabel l1 = new JLabel("First");
		l1.setBounds(70, 50, 100, 50);
		JLabel l2 = new JLabel("Second");
		l2.setBounds(70, 100, 100, 50);
		JLabel l3 = new JLabel("Result");
		l3.setBounds(70, 150, 100, 50);

		JTextField t1 = new JTextField();
		t1.setBounds(140, 50, 100, 40);
		JTextField t2 = new JTextField();
		t2.setBounds(140, 100, 100, 40);
		JTextField t3 = new JTextField();
		t3.setBounds(140, 150, 100, 40);
		
		t3.setEditable(false); // textField에 사용자가 작성할 수 없게 만듬.

		JButton b1 = new JButton("+");
		b1.setBounds(100, 250, 50, 50);
		JButton b2 = new JButton("-");
		b2.setBounds(200, 250, 50, 50);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
				t3.setText(String.valueOf(sum));
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int sub = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
				t3.setText(String.valueOf(sub));
			}
		});

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.setSize(350, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p3_Practice();
	}

}
