package JAVA2_2018_06_21CRIS;

import javax.swing.*;
import java.awt.event.*;

public class p3_ComboBox_Example {
	JFrame f;

	p3_ComboBox_Example() {
		f = new JFrame();
		final JLabel label = new JLabel();

		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		JButton b = new JButton("Show");
		b.setBounds(200, 100, 75, 20);
		String languages[] = { "C", "C++", "C#", "JAVA", "PHP" };
		final JComboBox<String> cb = new JComboBox<String>(languages);
		cb.setBounds(50, 100, 90, 20);
		f.add(cb);
		f.add(label);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350, 350);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String data = "Programming language Selected : " + cb.getItemAt(cb.getSelectedIndex());
				label.setText(data);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p3_ComboBox_Example();
	}

}
