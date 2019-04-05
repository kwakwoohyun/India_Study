package JAVA2_2018_04_19CRIS;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class p5_buttonclick1 extends Frame implements ActionListener {
	TextField tf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p5_buttonclick1();
	}

	p5_buttonclick1() {
		try {
			tf = new TextField();
			tf.setBounds(60, 50, 200, 20);
			Button b = new Button("click me");
			b.setBounds(100, 120, 80, 30);
			b.addActionListener(this);
			add(b);
			add(tf);
			setBackground(Color.PINK);

			// window closing event
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});

		} catch (Exception e) {
		}

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		tf.setText("Welcome to Java Event Handling");
		setBackground(Color.BLACK);
	}

	// public void actionPerformed(ActionEvent e) {
	// tf.setText("Welcome to Java Event Handling");
	// }
}
