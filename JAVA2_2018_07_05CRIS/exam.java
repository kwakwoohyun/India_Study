package JAVA2_2018_07_05CRIS;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.transform.Source;

public class exam implements ActionListener {
	Font f1 = new Font("Arial", Font.BOLD, 30);
	Font f2 = new Font("Arial", Font.BOLD, 15);
	Font f3 = new Font("Arial", Font.ITALIC, 15);
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;;
	JTextField t1, t2, t3, t4;
	JTextArea ta1;
	JRadioButton rb1, rb2;
	JCheckBox c1, c2, c3;
	JButton b1, b2, b3;
	final JComboBox<String> cb;
	final JPasswordField value;
	final JList<String> list1;
	ButtonGroup bg;
	JFrame f = new JFrame();

	public exam() {
		Icon india = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\m.png");
		JLabel in = new JLabel(india);
		in.setBounds(60, 10, 100, 100);
		f.add(in);
		l1 = new JLabel("Hotel Bill Generation");
		l1.setFont(f1);
		l1.setBounds(190, 0, 500, 100);
		l2 = new JLabel("Customer Name");
		l2.setFont(f2);
		l2.setBounds(160, 100, 120, 100);
		t1 = new JTextField();
		t1.setBounds(300, 138, 220, 25);
		l3 = new JLabel("Mobile No.");
		l3.setFont(f2);
		l3.setBounds(160, 130, 120, 100);
		t2 = new JTextField();
		t2.setBounds(300, 168, 220, 25);
		l4 = new JLabel("Course Staudied");
		l4.setFont(f2);
		l4.setBounds(160, 160, 120, 100);
		t3 = new JTextField("Diploma in Java");
		t3.setBounds(300, 198, 220, 25);
		l5 = new JLabel("Gender");
		l5.setFont(f2);
		l5.setBounds(160, 190, 120, 100);
		rb1 = new JRadioButton("Male");
		rb1.setBounds(300, 228, 60, 25);
		rb1.setFont(f2);
		rb1.setSelected(true);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(360, 228, 100, 25);
		rb2.setFont(f2);
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		l6 = new JLabel("Favourite Food");
		l6.setFont(f2);
		l6.setBounds(160, 220, 120, 100);
		c1 = new JCheckBox("Butter");
		c1.setBounds(300, 257, 65, 25);
		c1.setFont(f3);
		c2 = new JCheckBox("Chicken");
		c2.setBounds(365, 257, 80, 25);
		c2.setFont(f3);
		c3 = new JCheckBox("Butter Naan");
		c3.setBounds(445, 257, 120, 25);
		c3.setFont(f3);
		l7 = new JLabel("Password");
		l7.setFont(f2);
		l7.setBounds(160, 250, 120, 100);
		value = new JPasswordField();
		value.setBounds(300, 288, 220, 25);
		l8 = new JLabel("Address");
		l8.setFont(f2);
		l8.setBounds(160, 280, 120, 100);
		ta1 = new JTextArea();
		ta1.setBounds(300, 318, 220, 70);
		l9 = new JLabel("Favorite Color");
		l9.setFont(f2);
		l9.setBounds(160, 360, 120, 100);
		l10 = new JLabel("Favorite Sport");
		l10.setFont(f2);
		l10.setBounds(160, 390, 120, 100);
		String Color[] = { "Red", "Blue", "Green", "Yellow", "Pink" };
		cb = new JComboBox<String>(Color);
		cb.setBounds(300, 398, 100, 25);
		// cb.setFont(f3);
		final DefaultListModel<String> ll = new DefaultListModel<String>();
		ll.addElement("Boxing");
		ll.addElement("BasketBall");
		ll.addElement("FootBall");
		ll.addElement("Baseball");
		ll.addElement("Swim");
		ll.addElement("Golf");
		list1 = new JList<String>(ll);
		list1.setBounds(300, 428, 100, 75);
		b1 = new JButton("Submit");
		b2 = new JButton("Reset");
		b3 = new JButton("Exit");
		b1.setBounds(210, 540, 80, 30);
		b2.setBounds(300, 540, 80, 30);
		b3.setBounds(390, 540, 80, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(list1);
		f.add(cb);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(rb1);
		f.add(rb2);
		f.add(l6);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(ta1);
		f.add(value);
		f.setSize(700, 700);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exam();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			if (t1.getText().isEmpty() || (t2.getText().isEmpty()) || (t3.getText().isEmpty())
					|| (ta1.getText().isEmpty()) || (rb1.isSelected()) && (rb2.isSelected())
					|| ((c1.isSelected() == false) && (c2.isSelected() == false) && (c3.isSelected() == false))
					|| (list1.isSelectionEmpty())) {
				JOptionPane.showMessageDialog(null, "Data Missing");
			} else {
				JOptionPane.showMessageDialog(null, "Data Submitted");
				JOptionPane.showMessageDialog(f,
						"Customer Name : " + t1.getText() + "\nMobile No . " + t2.getText() + "\nCourse Studied : "
								+ t3.getText() + "\nGender : Male" + "\nFavourite Food : Butter \nAddress : "
								+ ta1.getText() + "\nFavorite Color : " + cb.getSelectedItem() + "\nFavorite Sport : "
								+ list1.getSelectedValue(),
						"Alert!!!!", JOptionPane.WARNING_MESSAGE);
			}
		} else if (e.getSource() == b2) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			ta1.setText(null);
			rb1.setSelected(false);
			rb2.setSelected(false);
			value.setText(null);
			c1.setSelected(false);
			c2.setSelected(false);
			c3.setSelected(false);
			cb.setSelectedIndex(0);
			list1.setSelectedIndex(0);
		} else if (e.getSource() == b3) {
			f.setVisible(false);
			f.dispose();
		}
	}

}
