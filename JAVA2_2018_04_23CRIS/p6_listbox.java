package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

public class p6_listbox implements ActionListener {
	
	final List lst1 = new List(4, true); // true = 중복체크
	final List lst2 = new List(4, true);
	final Label lbl = new Label();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p6_listbox();
	}

	p6_listbox() {
		Frame f = new Frame("List your Skills");
		lbl.setAlignment(Label.CENTER);
		lbl.setSize(500, 100);
		Button b1 = new Button("Select");
		b1.setBounds(200, 150, 80, 30);
		lst1.setBounds(100, 100, 70, 70);
		lst1.add("Driving");
		lst1.add("Swimming");
		lst1.add("Singing");
		lst1.add("Dancing");
		lst2.setBounds(100, 200, 70, 70);
		lst2.add("Computing");
		lst2.add("Plumbing");
		lst2.add("Wiring");
		lst2.add("Drawing");
		f.add(lst1);
		f.add(lst2);
		f.add(lbl);
		f.add(b1);
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
		/*
		 * b1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { String data = "YOU SELECTED " +
		 * lst1.getItem(lst1.getSelectedIndex()); data = data +
		 * ", Other Selected Skill is "; for (String frame : lst2.getSelectedItems()) {
		 * data = data + frame + " "; } lbl.setText(data); ; } });
		 */
		b1.addActionListener(this);

		// window closing event
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String data = "YOU SELECTED " + lst1.getItem(lst1.getSelectedIndex());
		data = data + ", Other Selected Skill is ";
		for (String frame : lst2.getSelectedItems()) {
			data = data + frame + " ";
		}
		lbl.setText(data);
		;
	}
}
