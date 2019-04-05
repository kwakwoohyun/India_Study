package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class awt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new awt3();
	}

	awt3() {
		Frame f = new Frame("Course Selection using CheckBox");
		Checkbox cb1 = new Checkbox("Python");
		cb1.setBounds(100, 100, 100, 30);
		Checkbox cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 100, 30);
		Checkbox cb3 = new Checkbox("PHP");
		cb3.setBounds(100, 200, 100, 50);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.PINK);
		cb1.setBackground(Color.pink);
	}
}
