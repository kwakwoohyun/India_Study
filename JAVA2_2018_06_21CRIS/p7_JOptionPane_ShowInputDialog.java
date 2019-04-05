package JAVA2_2018_06_21CRIS;

import javax.swing.*;

public class p7_JOptionPane_ShowInputDialog {
	JFrame f;

	p7_JOptionPane_ShowInputDialog() {
		f = new JFrame();
		String name = JOptionPane.showInputDialog(f, "Enter Name");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p7_JOptionPane_ShowInputDialog();
	}

}
