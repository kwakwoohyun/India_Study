package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class basic4 {
	private static Dialog d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic4 t = new basic4();
	}

	public basic4() {
		Frame f = new Frame("File Dialog Demo");
		f.setVisible(true);
		f.setSize(700, 700);
		FileDialog fd = new FileDialog(f, "File Dialog");
		// FileDialog
		fd.setVisible(true);
	}

}
