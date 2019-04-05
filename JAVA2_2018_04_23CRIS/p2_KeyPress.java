package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

class MyKeyListener extends KeyAdapter {

	public void keyPressed(KeyEvent ke, Label label) {
		// TODO Auto-generated method stub
		char i = ke.getKeyChar();
		String str = Character.toString(i);
		label.setText(str);
	}

}

public class p2_KeyPress extends Frame {
	Label label;
	TextField txtField;

	public p2_KeyPress() {
		super("Key Press Event Frame");
		Panel panel = new Panel();
		label = new Label();
		txtField = new TextField(20);
		txtField.addKeyListener(new MyKeyListener());
		add(label, BorderLayout.NORTH);
		panel.add(txtField, BorderLayout.CENTER);
		add(panel, BorderLayout.CENTER);

		// window closing event
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2_KeyPress k = new p2_KeyPress();
	}

}
