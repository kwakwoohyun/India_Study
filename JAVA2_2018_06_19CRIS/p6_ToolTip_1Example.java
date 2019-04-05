package JAVA2_2018_06_19CRIS;

import javax.swing.*;

public class p6_ToolTip_1Example {
	p6_ToolTip_1Example() {
		JFrame f = new JFrame("ToolTip Example");

		// Creating PasswordField and label
		JPasswordField value = new JPasswordField();
		value.setBounds(100, 100, 100, 30);
		value.setToolTipText("Enter your Password");
		JLabel l1 = new JLabel("Password : ");
		l1.setBounds(20, 100, 80, 30);

		// Adding components to frame
		f.add(value);
		f.add(l1);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p6_ToolTip_1Example();
	}

}
