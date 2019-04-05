package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
	Frame f = new Frame("Simple Calculator");
	Label lb1 = new Label("Enter the First Number");
	Label lb2 = new Label("Enter the Second Number");
	Label lb3 = new Label("Result");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Button b1 = new Button("Add");
	Button b2 = new Button("Multiplication");
	Button b3 = new Button("Division");
	Button b4 = new Button("Cancel");

	calculator() {
		lb1.setBounds(40, 100, 150, 25);
		lb2.setBounds(40, 140, 150, 25);
		lb3.setBounds(40, 180, 150, 25);
		t1.setBounds(250, 100, 100, 25);
		t2.setBounds(250, 140, 100, 25);
		t3.setBounds(250, 180, 100, 25);
		b1.setBounds(150, 250, 45, 15);
		b1.setSize(60, 40);
		b2.setBounds(230, 250, 45, 15);
		b2.setSize(60, 40);
		b3.setBounds(150, 300, 45, 15);
		b3.setSize(60, 40);
		b4.setBounds(230, 300, 45, 15);
		b4.setSize(60, 40);
		f.add(lb1);
		f.add(lb2);
		f.add(lb3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(450, 600);
		f.setBackground(Color.pink);
	}

	public void actionPerformed(ActionEvent e) {
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		if (e.getSource() == b1) {
			t3.setText(String.valueOf(n1 + n2));
		}
		if (e.getSource() == b2) {
			t3.setText(String.valueOf(n1 * n2));
		}
		if (e.getSource() == b3) {
			t3.setText(String.valueOf(n1 / n2));
		}
		if (e.getSource() == b4) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculator();
	}

}
