package JAVA2_2018_06_20CRIS;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class p5_CheckBox_Example {
	p5_CheckBox_Example() {
		JFrame f = new JFrame("p5_CheckBox_Example");
		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setBounds(100, 100, 100, 50);
		JCheckBox cb2 = new JCheckBox("JAVA");
		cb2.setBounds(100, 150, 100, 50);
		f.add(cb1);
		f.add(cb2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p5_CheckBox_Example();
	}

}
