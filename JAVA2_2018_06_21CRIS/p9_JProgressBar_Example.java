package JAVA2_2018_06_21CRIS;

import javax.swing.*;

public class p9_JProgressBar_Example extends JFrame {
	JProgressBar jb;
	int i = 0;
	int num = 0;

	p9_JProgressBar_Example() {
		jb = new JProgressBar(0, 2000);
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250, 150);
		setLayout(null);

	}

	public void interate() {
		while (i <= 2000) {
			jb.setValue(i);
			i = i + 20;
			try {
				Thread.sleep(5);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p9_JProgressBar_Example m = new p9_JProgressBar_Example();
		m.setVisible(true);
		m.interate();
	}

}
