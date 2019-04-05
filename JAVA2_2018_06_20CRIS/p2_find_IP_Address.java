package JAVA2_2018_06_20CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p2_find_IP_Address {
	p2_find_IP_Address() {
		JFrame f = new JFrame();
		JButton b;
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		final JLabel l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					String host = tf.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					l.setText("IP of " + host + " is : " + ip);
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		f.add(b);
		f.add(tf);
		f.add(l);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p2_find_IP_Address();
	}

}
