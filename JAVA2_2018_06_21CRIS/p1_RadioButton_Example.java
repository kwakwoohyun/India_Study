package JAVA2_2018_06_21CRIS;

import javax.swing.*;

public class p1_RadioButton_Example {
	JFrame f;

	p1_RadioButton_Example() {
		f = new JFrame("Button");
		JRadioButton rb1 = new JRadioButton("A)Male");
		JRadioButton rb2 = new JRadioButton("B(Female");
		rb1.setBounds(75, 50, 100, 30);
		rb2.setBounds(75, 100, 100, 30);
		
		// 라디오 그룹핑
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		f.add(rb1);
		f.add(rb2);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p1_RadioButton_Example();
	}

}
