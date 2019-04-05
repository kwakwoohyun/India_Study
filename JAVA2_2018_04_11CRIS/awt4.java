package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class awt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Marital Status using Radio Button");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Single", cbg, false);
		cb1.setBounds(100, 100, 100, 70);
		Checkbox cb2 = new Checkbox("Married", cbg, true);
		cb2.setBounds(100, 150, 100, 70);
		Checkbox cb3 = new Checkbox("Divorced", cbg, false);
		cb3.setBounds(100, 200, 100, 70);
		Checkbox cb4 = new Checkbox("Separated", cbg, false);
		cb4.setBounds(100, 250, 100, 70);
		Checkbox cb5 = new Checkbox("Widwed", cbg, false);
		cb5.setBounds(100, 300, 100, 70);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		f.add(cb5);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
