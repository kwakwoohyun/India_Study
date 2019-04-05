package JAVA2_2018_06_19CRIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p9_Label_Example_to_find_IP_Address extends Frame implements ActionListener {
	JTextField tf;
	JLabel l;
	JButton b;

	p9_Label_Example_to_find_IP_Address() {
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(this);
		add(b);
		add(tf);
		add(l);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p9_Label_Example_to_find_IP_Address();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is : " + ip);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
