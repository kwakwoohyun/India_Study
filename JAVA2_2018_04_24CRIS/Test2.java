package JAVA2_2018_04_24CRIS;

import java.awt.*;
import java.awt.event.*;

public class Test2 {
	Frame f;
	Label lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19, lb20,
			lb21, lb22, lb23, lb24, lb25, lb26, lb28, lb29, lb30, lb31;
	Choice c;
	TextField f1, f2, f3, lb27;
	Button b;
	String room = "";

	public Test2() {
		f = new Frame("Label Example"); // title
		f.setSize(1000, 700);
		f.setLayout(null);
		f.setVisible(true);
		lb1 = new Label("Select Room No");
		lb1.setBounds(100, 50, 100, 30);
		c = new Choice();
		c.add("101");
		c.add("102");
		c.add("103");
		c.add("104");
		c.add("105");
		c.setBounds(200, 50, 150, 30);
		c.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				room = c.getItem(c.getSelectedIndex());
				lb31.setText(room);
		
			}
		});
		lb31 = new Label();
		f.add(lb31);
		lb31.setBounds(250,100,100,30);
		lb2 = new Label("Room No : ");
		lb2.setBounds(100, 100, 100, 30);
		lb3 = new Label("Room Type : ");
		lb3.setBounds(350, 100, 72, 30);
		lb4 = new Label("Price : ");
		lb4.setBounds(600, 100, 60, 30);
		lb5 = new Label("Guest 1");
		lb5.setBounds(150, 150, 50, 30);
		lb6 = new Label("Guest 2");
		lb6.setBounds(400, 150, 50, 30);
		lb7 = new Label("Guest 3");
		lb7.setBounds(150, 180, 100, 30);
		lb8 = new Label("Guest 4");
		lb8.setBounds(400, 180, 100, 30);
		lb9 = new Label("Guest 5");
		lb9.setBounds(150, 210, 100, 30);
		lb10 = new Label("Identity Proof Type");
		lb10.setBounds(400, 210, 130, 30);
		lb11 = new Label("Standard Non Ac");
		lb11.setBounds(420, 100, 100, 30);
		lb12 = new Label("Rs. 950");
		lb12.setBounds(660, 100, 100, 30);
		lb13 = new Label("sujoy kr das (8930098300)");
		lb13.setBounds(220, 150, 150, 30);
		lb14 = new Label("abishek mondal (89211512");
		lb14.setBounds(470, 150, 170, 30);
		lb15 = new Label("Booking Date");
		lb15.setBounds(400, 250, 100, 30);
		lb16 = new Label("2014-10-12 - 10/16/2014");
		lb16.setBounds(500, 250, 150, 30);
		lb17 = new Label("Other Facilities");
		lb17.setBounds(220, 280, 100, 30);
		lb18 = new Label("Quantity");
		lb18.setBounds(400, 280, 100, 30);
		lb19 = new Label("Amount");
		lb19.setBounds(540, 280, 170, 30);
		lb20 = new Label("Bed Tea");
		lb20.setBounds(220, 310, 100, 30);
		lb21 = new Label("Lunch");
		lb21.setBounds(220, 330, 100, 30);
		lb22 = new Label("Dinner");
		lb22.setBounds(220, 360, 100, 30);
		lb23 = new Label("Rs. 50");
		lb23.setBounds(540, 310, 100, 30);
		lb24 = new Label("Rs. 120");
		lb24.setBounds(540, 340, 100, 30);
		lb25 = new Label("Rs. 150");
		lb25.setBounds(540, 360, 100, 30);
		lb26 = new Label("Total Amount");
		lb26.setBounds(540, 390, 170, 30);
		lb27 = new TextField();
		lb27.setBounds(540, 450, 100, 30);
		b = new Button("submit");
		b.setBounds(600, 450, 100, 30);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int n1 = Integer.parseInt(f1.getText());
				int n2 = Integer.parseInt(f2.getText());
				int n3 = Integer.parseInt(f3.getText());
				int total = n1 * 50 + n2 * 120 + n3 * 150;
				lb27.setText(String.valueOf(total));
			}
		});
		f1 = new TextField();
		f1.setBounds(400, 310, 100, 30);
		f2 = new TextField();
		f2.setBounds(400, 340, 100, 30);
		f3 = new TextField();
		f3.setBounds(400, 370, 100, 30);
		f.add(lb1);
		f.add(c);
		f.add(lb2);
		f.add(lb3);
		f.add(lb4);
		f.add(lb5);
		f.add(lb6);
		f.add(lb7);
		f.add(lb8);
		f.add(b);
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
		f.add(lb19);
		f.add(lb20);
		f.add(lb21);
		f.add(lb22);
		f.add(lb23);
		f.add(lb24);
		f.add(lb25);
		f.add(lb26);
		f.add(lb27);
		f.add(f1);
		f.add(f2);
		f.add(f3);
		// window closing event
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2();
	}

}
