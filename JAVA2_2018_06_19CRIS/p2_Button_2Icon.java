package JAVA2_2018_06_19CRIS;

import javax.swing.*;

public class p2_Button_2Icon {
	p2_Button_2Icon() {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton(new ImageIcon("D://p.jpg"));
		b.setBounds(100, 100, 100, 100);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p2_Button_2Icon();
	}
}