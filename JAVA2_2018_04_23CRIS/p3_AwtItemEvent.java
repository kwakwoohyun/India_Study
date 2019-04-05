package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

public class p3_AwtItemEvent extends Frame implements ItemListener {
	TextArea txtArea;

	public p3_AwtItemEvent(String title) {
		super(title);
		txtArea = new TextArea();
		add(txtArea, BorderLayout.CENTER);
		Choice choice = new Choice();
		choice.addItem("red");
		choice.addItem("green");
		choice.addItem("blue");
		choice.addItemListener(this);
		/*
		 * choice.addItemListener(new ItemListener() { public void
		 * itemStateChanged(ItemEvent e) { txtArea.setText("This is the " + e.getItem()
		 * + " color.\n"); } });
		 */

		// window closing event
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		add(choice, BorderLayout.NORTH);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p3_AwtItemEvent("AWT Demo");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		txtArea.setText("This is the " + e.getItem() + " color.\n");
	}

}
