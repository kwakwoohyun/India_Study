package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class awt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Label Example");
		TextField t1, t2;
		t1 = new TextField("JAVA");
		t1.setBounds(50, 100, 200, 30);
		t2 = new TextField("PROGRAMMING");
		t2.setBounds(50, 150, 200, 30);
		f.add(t1);
		f.add(t2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
