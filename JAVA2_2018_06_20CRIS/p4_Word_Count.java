package JAVA2_2018_06_20CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p4_Word_Count implements ActionListener {
	JLabel l1, l2;
	JTextArea area;
	JButton b;

	p4_Word_Count() {
		JFrame f = new JFrame("Word Count");
		l1 = new JLabel();
		l1.setBounds(50, 25, 100, 30);
		l2 = new JLabel();
		l2.setBounds(160, 25, 100, 30);
		area = new JTextArea();
		area.setBounds(20, 75, 250, 200);
		b = new JButton("Count Word");
		b.setBounds(100, 300, 120, 30);
		b.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b);
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p4_Word_Count();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = area.getText();
		String words[] = text.split(" ");
		l1.setText("Words : " + words.length);
		l2.setText("Characters : " + text.length());
	}

}
