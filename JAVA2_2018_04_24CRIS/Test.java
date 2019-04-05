package JAVA2_2018_04_24CRIS;

import java.awt.*;
import java.awt.event.*;
import java.time.chrono.IsoChronology;

public class Test implements ActionListener {
	Label lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19, lb20,
			lb21, lb22, lb23, lb24, lb25, lb26, lb27, lb28, lb29, lb30, lb31, lb32, lb33, lb34, lb35;
	TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
	Choice cb1, cb2, cb3, cb4, cb5, cb6;
	CheckboxGroup cbg;
	Checkbox r1, r2;
	Button b1;
	Frame f;
	String gender = "";

	public Test() {
		f = new Frame("Label Example"); // title
		lb1 = new Label("Personal Information");
		lb1.setBounds(30, 50, 150, 30);
		lb2 = new Label("First Name:");
		lb2.setBounds(50, 90, 90, 30);
		lb3 = new Label("Last Name:");
		lb3.setBounds(50, 130, 90, 30);
		lb4 = new Label("Date of Birth:");
		lb4.setBounds(50, 170, 90, 30);
		lb5 = new Label("Gender:");
		lb5.setBounds(50, 210, 90, 30);

		lb6 = new Label("Account Information");
		lb6.setBounds(30, 280, 150, 30);
		lb7 = new Label("Email:");
		lb7.setBounds(50, 320, 90, 30);
		lb8 = new Label("Re-typeEmail:");
		lb8.setBounds(50, 360, 90, 30);
		lb9 = new Label("Password:");
		lb9.setBounds(50, 400, 110, 30);
		lb10 = new Label("Re-typePassword:");
		lb10.setBounds(50, 440, 110, 30);
		lb11 = new Label("Security Question:");
		lb11.setBounds(50, 480, 110, 30);
		lb12 = new Label("Security Answer:");
		lb12.setBounds(50, 520, 110, 30);

		lb13 = new Label("Contact Information");
		lb13.setBounds(30, 590, 150, 30);
		lb14 = new Label("Address:");
		lb14.setBounds(50, 630, 90, 30);
		lb15 = new Label("City:");
		lb15.setBounds(50, 670, 90, 30);
		lb16 = new Label("State:");
		lb16.setBounds(50, 710, 110, 30);
		lb17 = new Label("Zip Code:");
		lb17.setBounds(50, 750, 110, 30);
		lb18 = new Label("Phone:");
		lb18.setBounds(50, 790, 110, 30);

		t1 = new TextField();
		t1.setBounds(180, 90, 320, 25);
		t2 = new TextField();
		t2.setBounds(180, 130, 320, 25);

		t3 = new TextField();
		t3.setBounds(180, 320, 320, 25);
		t4 = new TextField();
		t4.setBounds(180, 360, 320, 25);
		t5 = new TextField();
		t5.setBounds(180, 400, 320, 25);
		t6 = new TextField();
		t6.setBounds(180, 440, 320, 25);
		t7 = new TextField();
		t7.setBounds(180, 520, 320, 25);

		t8 = new TextField();
		t8.setBounds(180, 630, 320, 25);
		t9 = new TextField();
		t9.setBounds(180, 670, 320, 25);
		t10 = new TextField();
		t10.setBounds(180, 750, 100, 25);
		t11 = new TextField();
		t11.setBounds(180, 790, 180, 25);

		cb1 = new Choice();
		cb1.add("1");
		cb1.add("2");
		cb1.add("3");
		cb1.add("4");
		cb1.add("5");
		cb1.add("6");
		cb1.add("7");
		cb1.add("8");
		cb1.add("9");
		cb1.add("10");
		cb1.add("11");
		cb1.add("12");
		cb1.setBounds(180, 170, 80, 50);
		cb2 = new Choice();
		cb2.add("1");
		cb2.add("2");
		cb2.add("3");
		cb2.add("4");
		cb2.add("5");
		cb2.add("6");
		cb2.add("7");
		cb2.add("8");
		cb2.add("9");
		cb2.add("10");
		cb2.add("11");
		cb2.add("12");
		cb2.add("13");
		cb2.add("14");
		cb2.add("15");
		cb2.add("16");
		cb2.add("17");
		cb2.add("18");
		cb2.add("19");
		cb2.add("20");
		cb2.add("21");
		cb2.add("22");
		cb2.add("23");
		cb2.add("24");
		cb2.add("25");
		cb2.add("26");
		cb2.add("27");
		cb2.add("28");
		cb2.add("29");
		cb2.add("30");
		cb2.setBounds(280, 170, 80, 50);
		cb3 = new Choice();
		cb3.add("1989");
		cb3.add("1990");
		cb3.add("1991");
		cb3.add("1992");
		cb3.add("1993");
		cb3.add("1994");
		cb3.add("1995");
		cb3.add("1996");
		cb3.add("1997");
		cb3.add("1998");
		cb3.add("1999");
		cb3.add("2000");
		cb3.add("2001");
		cb3.add("2002");
		cb3.add("2003");
		cb3.add("2004");
		cb3.add("2005");
		cb3.add("2006");
		cb3.add("2007");
		cb3.add("2008");
		cb3.add("2009");
		cb3.add("2010");
		cb3.add("2011");
		cb3.add("2012");
		cb3.add("2013");
		cb3.add("2014");
		cb3.add("2015");
		cb3.add("2016");
		cb3.add("2017");
		cb3.add("2018");
		cb3.setBounds(380, 170, 80, 50);
		cb4 = new Choice();
		cb4.add("Choose a security question");
		cb4.add("What is your name?");
		cb4.add("How old are you?");
		cb4.add("Where are you live?");
		cb4.setBounds(180, 480, 320, 25);
		cb5 = new Choice();
		cb5.add("Choose a state");
		cb5.add("USA");
		cb5.add("Korea");
		cb5.add("India");
		cb5.add("UK");
		cb5.add("China");
		cb5.add("Japan");
		cb5.setBounds(180, 710, 320, 50);
		cb6 = new Choice();
		cb6.add("Mobile");
		cb6.add("Home");
		cb6.add("Company");
		cb6.setBounds(390, 790, 110, 30);
		cbg = new CheckboxGroup();
		r1 = new Checkbox("Male", cbg, false);
		r2 = new Checkbox("Female", cbg, false);
		r1.setBounds(180, 200, 50, 50);
		r2.setBounds(250, 200, 50, 50);
		b1 = new Button("Enter");
		b1.setBounds(250, 850, 110, 30);
		b1.addActionListener(this);
		f.add(b1);
		f.add(lb1);
		f.add(lb2);
		f.add(lb3);
		f.add(lb4);
		f.add(lb5);
		f.add(lb6);
		f.add(lb7);
		f.add(lb8);
		f.add(lb9);
		f.add(lb10);
		f.add(lb11);
		f.add(lb12);
		f.add(lb13);
		f.add(lb14);
		f.add(lb15);
		f.add(lb16);
		f.add(lb17);
		f.add(lb18);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(t9);
		f.add(t10);
		f.add(t11);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		f.add(cb5);
		f.add(cb6);
		f.add(r1);
		f.add(r2);
		f.setSize(600, 1200);
		f.setLayout(null);
		f.setVisible(true);
		r1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				gender="Male";
			}
		});
		r2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				gender="Female";
			}
		});
		// window closing event
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		lb19 = new Label("First Name : " + t1.getText());
		lb20 = new Label("Last Name : " + t2.getText());
		lb21 = new Label("Month : " + cb1.getSelectedItem());
		lb22 = new Label("Day : " + cb2.getSelectedItem());
		lb23 = new Label("Year : " + cb3.getSelectedItem());
		lb24 = new Label("Gender : "+gender);
		lb25 = new Label("Email : "+t3.getText());
		lb26 = new Label("Re-typeEmail : "+t4.getText());
		lb27 = new Label("Password : "+t5.getText());
		lb28 = new Label("Re-typePassword : "+t6.getText());
		lb29 = new Label("SecurityQuestion : "+cb4.getSelectedItem());
		lb30 = new Label("SecurityAnswer : "+t7.getText());
		lb31 = new Label("Address : "+t8.getText());
		lb32 = new Label("City : "+t9.getText());
		lb33 = new Label("State : "+cb5.getSelectedItem());
		lb34 = new Label("ZipCode : "+t10.getText());
		lb35 = new Label("Phone : "+t11.getText());
		lb19.setBounds(50, 870, 200, 10);
		lb20.setBounds(50, 885, 200, 10);
		lb21.setBounds(50, 900, 200, 10);
		lb22.setBounds(50, 915, 200, 10);
		lb23.setBounds(50, 930, 200, 10);
		lb24.setBounds(50, 945, 200, 10);
		lb25.setBounds(50, 960, 200, 10);
		lb26.setBounds(50, 975, 200, 10);
		lb27.setBounds(50, 990, 200, 10);
		lb28.setBounds(300, 900, 200, 10);
		lb29.setBounds(300, 915, 200, 10);
		lb30.setBounds(300, 930, 200, 10);
		lb31.setBounds(300, 945, 200, 10);
		lb32.setBounds(300, 960, 200, 10);
		lb33.setBounds(300, 975, 200, 10);
		lb34.setBounds(300, 990, 200, 10);
		lb35.setBounds(300, 1015, 200, 10);
		f.add(lb19);
		f.add(lb20);
		f.add(lb21);
		f.add(lb22);
		f.add(lb23);
		f.add(lb24);
		f.add(lb15);
		f.add(lb26);
		f.add(lb27);
		f.add(lb28);
		f.add(lb29);
		f.add(lb30);
		f.add(lb31);
		f.add(lb32);
		f.add(lb33);
		f.add(lb34);
		f.add(lb35);
	}

}
