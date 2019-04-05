package JAVA2_2018_06_19CRIS;

import javax.swing.*;

public class p3_TextField_1Example {
	p3_TextField_1Example() {
		JFrame f = new JFrame("TextField Example");
		JTextField t1, t2;
		t1 = new JTextField("Welcome to Swing.");
		t1.setBounds(50, 100, 200, 30);
		t2 = new JTextField("AWT");
		t2.setBounds(50, 150, 200, 30);
		f.add(t1);
		f.add(t2);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p3_TextField_1Example();
	}

}
