package JAVA2_2018_04_23CRIS;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class p1_KeyListener extends Frame implements KeyListener {
	TextField t1;
	Label l1;

	public p1_KeyListener(String s) {
		super(s);
		Panel p = new Panel();
		l1 = new Label("Key Listener!");
		p.add(l1);
		add(p);
		addKeyListener(this);
		setSize(400, 300);
		setVisible(true);

		// window closing event
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p1_KeyListener("Key Listener Tester");
	}

	public void keyTyped(KeyEvent e) {
		l1.setText("Key Typed"); // any key
	}

	public void keyPressed(KeyEvent e) {
		l1.setText("Key Pressed"); // special key
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
