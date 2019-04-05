package JAVA2_2018_04_19CRIS;

import java.awt.*;
import java.awt.event.*;

public class p6_borderlayout2 extends Frame implements ActionListener {
	Label lbl;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p6_borderlayout2();

	}

	public p6_borderlayout2() {
		setLayout(new BorderLayout());
		try {
			Button button1 = new Button("BorderLayout.NORTH");
			button1.addActionListener(this);
			add(button1, BorderLayout.NORTH);
			Button button2 = new Button("BorderLayout.SOUTH");
			button2.addActionListener(this);
			add(button2, BorderLayout.SOUTH);
			Button button3 = new Button("BorderLayout.EAST");
			button3.addActionListener(this);
			add(button3, BorderLayout.EAST);
			Button button4 = new Button("BorderLayout.WESt");
			button4.addActionListener(this);
			add(button4, BorderLayout.WEST);
			lbl = new Label("BorderLayout.CENTER");
			add(lbl, BorderLayout.CENTER);

			// window closing event
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		} catch (Exception e) {
		}
		
		setSize(400, 400);
		setVisible(true);
		setTitle("Event in java awt");
	}

	public void actionPerformed(ActionEvent e) {
		Button bt = (Button) e.getSource();
		String str = bt.getLabel();
		lbl.setText(str);
	}
}
