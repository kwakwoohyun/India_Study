package JAVA2_2018_06_19CRIS;

import javax.swing.*;

public class p7_TextArea_1Example {
	p7_TextArea_1Example() {
		JFrame f = new JFrame();
		JTextArea area = new JTextArea("Welcome to Swing");
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p7_TextArea_1Example();
	}

}
