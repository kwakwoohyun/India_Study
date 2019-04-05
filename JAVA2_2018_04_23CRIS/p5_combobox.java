package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

public class p5_combobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p5_combobox();

	}

	p5_combobox() {
		Frame f1 = new Frame("Choice List");
		final Label lbl = new Label();
		lbl.setAlignment(Label.CENTER);
		lbl.setSize(400, 100);
		final Choice cb = new Choice();
		cb.setBounds(100, 100, 75, 75);
		cb.add("1.Nutton");
		cb.add("2.Chicken");
		cb.add("3.Pork");
		cb.add("4.Fish");
		f1.add(cb);
		f1.add(lbl);
		f1.setSize(400, 400);
		f1.setLayout(null);
		f1.setVisible(true);
		cb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String data = "You Selected " + cb.getItem(cb.getSelectedIndex());
				lbl.setText(data);
			}
		});

		// window closing event
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
