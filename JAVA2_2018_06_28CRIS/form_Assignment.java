package JAVA2_2018_06_28CRIS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class form_Assignment implements ActionListener {
	JFrame f;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
	JTextField t1, t2, t3, t4;
	JTextArea ta1, ta2;
	JRadioButton b1, b2;
	JComboBox c1, c2, c3;
	JCheckBox cb1;
	JButton bb1, bb2, bb3;
	ButtonGroup bg;

	form_Assignment() {
		initialize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new form_Assignment();
	}

	public void initialize() {
		f = new JFrame();
		f.setBounds(100, 130, 730, 489);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);

		l1 = new JLabel("Registration Form");
		l1.setBounds(300, 10, 300, 20);
		l2 = new JLabel("Name : ");
		l2.setBounds(40, 60, 50, 20);
		l3 = new JLabel("Father's Name : ");
		l3.setBounds(40, 90, 100, 20);
		l4 = new JLabel("Gender : ");
		l4.setBounds(40, 120, 100, 20);
		l5 = new JLabel("Date of Birth : ");
		l5.setBounds(40, 150, 90, 20);
		l6 = new JLabel("Address : ");
		l6.setBounds(40, 180, 70, 20);
		l7 = new JLabel("Phone No. : ");
		l7.setBounds(40, 280, 90, 20);
		l8 = new JLabel("Email : ");
		l8.setBounds(40, 310, 50, 20);
		t1 = new JTextField();
		t1.setBounds(165, 60, 150, 20);
		t2 = new JTextField();
		t2.setBounds(165, 90, 150, 20);
		b1 = new JRadioButton("Male");
		b1.setBounds(165, 120, 70, 20);
		b2 = new JRadioButton("Female");
		b2.setBounds(235, 120, 70, 20);
		bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		String date[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		c1 = new JComboBox<String>(date);
		c1.setBounds(165, 150, 40, 20);
		String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		c2 = new JComboBox<String>(month);
		c2.setBounds(210, 150, 50, 20);
		String year[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
				"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
				"2018" };
		c3 = new JComboBox<String>(year);
		c3.setBounds(265, 150, 50, 20);
		ta1 = new JTextArea();
		ta1.setBounds(165, 180, 150, 90);
		t3 = new JTextField();
		t3.setBounds(165, 280, 150, 20);
		t4 = new JTextField();
		t4.setBounds(165, 310, 150, 20);
		cb1 = new JCheckBox("I accept the terms and conditions");
		cb1.setBounds(40, 340, 220, 20);
		ta2 = new JTextArea();
		ta2.setBounds(360, 60, 210, 250);
		bb1 = new JButton("SUBMIT");
		bb1.setBounds(75, 390, 80, 30);
		bb1.addActionListener(this);
		bb2 = new JButton("RESET");
		bb2.setBounds(185, 390, 80, 30);
		bb2.addActionListener(this);
		bb3 = new JButton("EXIT");
		bb3.setBounds(295, 390, 80, 30);
		bb3.addActionListener(this);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(ta1);
		f.add(t3);
		f.add(t4);
		f.add(cb1);
		f.add(ta2);
		f.add(bb1);
		f.add(bb2);
		f.add(bb3);
		f.setVisible(true);
		f.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bb1) {
			if (t1.getText().isEmpty() || (t2.getText().isEmpty()) || (ta1.getText().isEmpty())
					|| (t3.getText().isEmpty()) || (t4.getText().isEmpty()) || (bg.isSelected(null))) {
				JOptionPane.showMessageDialog(null, "Data Missing");
			} else if (cb1.isSelected() == false) {
				JOptionPane.showMessageDialog(null, "Check Please");
			} else {
				JOptionPane.showMessageDialog(null, "Data Submitted");
				String gender = "";
				if (b1.isSelected()) {
					gender = "Male";
				} else if (b2.isSelected()) {
					gender = "Female";
				}
				ta2.setText("Name : " + t1.getText() + "\nFather's Name : " + t2.getText() + "\nGender : " + gender
						+ "\nDate of Birth : " + c1.getSelectedItem() + " / " + c2.getSelectedItem() + " / "
						+ c3.getSelectedItem() + "\nAddress : " + ta1.getText() + "\nPhone No. : " + t3.getText()
						+ "\nEmail : " + t4.getText());
			}
		}
		if (e.getSource() == bb2) {
			t1.setText(null);
			t2.setText(null);
			ta1.setText(null);
			t3.setText(null);
			t4.setText(null);
			cb1.setSelected(false);
			c1.setSelectedItem("1");
			c2.setSelectedItem("Jan");
			c3.setSelectedItem("1995");
		}
		if (e.getSource() == bb3) {
			f.setVisible(false);
			f.dispose();
		}
	}

}