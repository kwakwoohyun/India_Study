package JAVA2_2018_06_19CRIS;

import java.awt.event.*;

import javax.swing.*;

public class p5_PasswordField_1Example {
	p5_PasswordField_1Example() {
		JFrame f = new JFrame("PasswordField Exam");
		final JLabel label = new JLabel();
		label.setBounds(20, 150, 200, 50);
		final JPasswordField value = new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		value.setToolTipText("Enter your Password"); // ToolTip
		JLabel l1 = new JLabel("USERNAME.");
		l1.setBounds(20, 20, 80, 30);
		JLabel l2 = new JLabel("PASSWORD.");
		l2.setBounds(20, 75, 80, 30);
		JButton b = new JButton("Login");
		b.setBounds(100, 120, 80, 30);
		b.setToolTipText("Click to Login"); // ToolTip
		final JTextField text = new JTextField();
		text.setBounds(100, 20, 100, 30);
		text.setToolTipText("Enter your Name"); // ToolTip

		f.add(value);
		f.add(l1);
		f.add(l2);
		f.add(b);
		f.add(text);
		f.add(label);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Username : " + text.getText();
				data = data + ", Password : " + new String(value.getPassword());
				label.setText(data);
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p5_PasswordField_1Example();
	}

}
