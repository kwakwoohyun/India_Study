package JAVA2_2018_06_19CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p8_ButtonEvent1 implements ActionListener {

	JFrame f;
	JButton b = new JButton("Say Hi");

	// UI = User Interface
	public void createUI() {
		f = new JFrame();
		f.setLayout(null);
		JLabel tbLabel = new JLabel("Click On Button");
		b.addActionListener(this);
		tbLabel.setBounds(75, 50, 100, 20);
		b.setBounds(75, 75, 150, 20);
		f.add(tbLabel);
		f.add(b);
		f.setVisible(true);
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p8_ButtonEvent1 dd = new p8_ButtonEvent1();
		dd.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		b = (JButton) e.getSource(); // 주석처리해도 돌아감 왜그런지 모르겠음
		sayHi();
	}

	public void sayHi() {
		JOptionPane.showMessageDialog(f, "Hi,To All.", "wwSay Hi", JOptionPane.INFORMATION_MESSAGE);
	}
}
