package JAVA2_2018_06_21CRIS;

import javax.swing.*;

public class p6_JOptionPane_ShowMessageDialog {
	JFrame f;

	p6_JOptionPane_ShowMessageDialog() {
		f = new JFrame();
		JOptionPane.showMessageDialog(f, "Successfully Updated", "Alert!!!!", JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p6_JOptionPane_ShowMessageDialog();
	}

}
