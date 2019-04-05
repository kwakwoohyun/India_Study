package JAVA2_2018_04_19CRIS;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class p3_graphhics11 {
	p3_graphhics11() {
		Frame f = new Frame("Course Selection using CheckBox");
		Checkbox cb1 = new Checkbox("Python");
		cb1.setBounds(100, 100, 100, 30);
		Checkbox cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 100, 30);
		Checkbox cb3 = new Checkbox("PHP");
		cb3.setBounds(100, 200, 100, 50);

		Color c1 = new Color(255, 100, 100);
		Color c2 = new Color(100, 255, 100);
		Color c3 = new Color(100, 100, 255);
		cb1.setBackground(c1);
		cb1.setForeground(Color.BLACK); // ±ÛÀÚ »ö±ò
		cb2.setBackground(c2);
		cb2.setForeground(Color.WHITE);
		cb3.setBackground(c3);
		cb3.setForeground(Color.BLUE);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		// window closing event
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p3_graphhics11();
	}

}
