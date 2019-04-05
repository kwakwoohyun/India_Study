package JAVA2_2018_04_19CRIS;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class p1_textarea5 {

	p1_textarea5() {
		TextArea area1;

		Frame f = new Frame();
		area1 = new TextArea("Enter your Address");
		area1.setBounds(20, 40, 300, 300);
		f.add(area1);
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
		new p1_textarea5();
	}

}
