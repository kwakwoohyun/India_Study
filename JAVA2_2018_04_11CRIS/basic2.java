package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class basic2 {
	public basic2() {
		Frame f = new Frame("Panel Example");
		Panel p = new Panel();
//		Panel p2 = new Panel();
//		p2.setBounds(100, 100, 300, 300);
//		p2.setBackground(Color.BLUE);
		p.setBounds(40, 80, 200, 200);
		p.setBackground(Color.PINK);
		Button b1 = new Button("B.Sc.");
		b1.setBounds(200, 200, 80, 30);
		b1.setBackground(Color.yellow);
		Button b2 = new Button("B.Sc.");
		b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.red);
		p.add(b1);
		p.add(b2);
		f.add(p);
//		f.add(p2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic2 t = new basic2();
	}

}
