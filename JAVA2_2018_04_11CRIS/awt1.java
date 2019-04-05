package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class awt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Label Example"); // title
		Label l1, l2; // label선언
		TextField t1;
		t1 = new TextField("woo");
		t1.setBounds(50, 200, 100, 30); // 범위
		f.add(t1);
		l1 = new Label("JAVA");
		l1.setBounds(50, 100, 100, 30);
		l2 = new Label("PROGRAMMING");
		l2.setBounds(50, 150, 100, 30);
		f.add(l1);
		f.add(l2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
