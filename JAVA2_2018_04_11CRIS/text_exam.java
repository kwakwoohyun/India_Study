package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class text_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Label Example");
		Label l1, l2, l3, l4;
		TextField t1, t2, t3, t4;
		Button b1, b2;
		TextArea area1;
		Checkbox ccb1, ccb2, ccb3;
		l1 = new Label("NAME");
		l1.setBounds(10, 100, 200, 30);
		l2 = new Label("ADRESS");
		l2.setBounds(10, 150, 200, 30);
		l3 = new Label("E-MAIL");
		l3.setBounds(10, 200, 200, 30);
		l4 = new Label("PHONE");
		l4.setBounds(10, 250, 200, 30);
		t1 = new TextField("name");
		t1.setBounds(70, 100, 200, 30);
		// t2 = new TextField("adress");
		// t2.setBounds(70, 150, 200, 30);
		area1 = new TextArea("Enter your Address");
		area1.setBounds(70, 150, 200, 40);
		t3 = new TextField("email");
		t3.setBounds(70, 200, 200, 30);
		t4 = new TextField("phone");
		t4.setBounds(70, 250, 200, 30);
		b1 = new Button("OK");
		b1.setBounds(80, 400, 80, 30);
		b1.setBackground(Color.lightGray);
		b2 = new Button("CANCEL");
		b2.setBounds(190, 400, 80, 30);
		b2.setBackground(Color.lightGray);
		f.setBackground(Color.PINK);
		ccb1 = new Checkbox("Python");
		ccb1.setBounds(10, 350, 70, 30);
		ccb2 = new Checkbox("JAVA");
		ccb2.setBounds(90, 350, 70, 30);
		ccb3 = new Checkbox("PHP");
		ccb3.setBounds(170, 350, 70, 30);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Single", cbg, false);
		cb1.setBounds(10, 300, 70, 30);
		Checkbox cb2 = new Checkbox("Married", cbg, true);
		cb2.setBounds(90, 300, 70, 30);
		Checkbox cb3 = new Checkbox("Divorced", cbg, false);
		cb3.setBounds(170, 300, 70, 30);
		Checkbox cb4 = new Checkbox("Separated", cbg, false);
		cb4.setBounds(250, 300, 80, 30);
		Checkbox cb5 = new Checkbox("Widwed", cbg, false);
		cb5.setBounds(340, 300, 70, 30);
		MenuBar mb;
		mb = new MenuBar();
		Menu menu;
		menu = new Menu("Course");
		Menu submenu1 = new Menu("UG");
		Menu submenu2 = new Menu("PG");
		MenuItem mi1 = new MenuItem("B.Sc.");
		MenuItem mi2 = new MenuItem("BCA.");
		MenuItem mi3 = new MenuItem("BBA");
		MenuItem mi4 = new MenuItem("M.Sc.");
		MenuItem mi5 = new MenuItem("MCA");
		Menu susubmenu1 = new Menu("kwak");
		MenuItem mi6 = new MenuItem("woohyun");
		susubmenu1.add(mi6);
		submenu1.add(susubmenu1);
		submenu1.add(mi1);
		submenu1.add(mi2);
		submenu1.add(mi3);
		submenu2.add(mi4);
		submenu2.add(mi5);
		menu.add(submenu1);
		menu.add(submenu2);
		mb.add(menu);
		Color c1 = new Color(255, 100, 100); // 0~255±îÁö background »ö±ò
		Color c2 = new Color(100, 255, 100);
		Color c3 = new Color(1, 0, 255);
		Color c4 = new Color(255, 187, 0);
		Color c5 = new Color(150, 100, 150);
		cb1.setBackground(c1);
		cb1.setForeground(Color.BLACK); // ±ÛÀÚ »ö±ò
		cb2.setBackground(c2);
		cb2.setForeground(Color.WHITE); // ±ÛÀÚ »ö±ò
		cb3.setBackground(c3);
		cb3.setForeground(Color.WHITE); // ±ÛÀÚ »ö±ò
		cb4.setBackground(c4);
		cb4.setForeground(Color.GREEN); // ±ÛÀÚ »ö±ò
		cb5.setBackground(c5);
		cb5.setForeground(Color.ORANGE); // ±ÛÀÚ »ö±ò
		f.add(ccb1);
		f.add(ccb2);
		f.add(ccb3);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		f.add(cb5);
		f.add(t1);
		f.add(area1);
		f.add(t3);
		f.add(t4);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(b1);
		f.add(b2);
		f.setMenuBar(mb);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		// window closing event
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
