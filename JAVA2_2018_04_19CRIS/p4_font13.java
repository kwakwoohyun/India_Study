package JAVA2_2018_04_19CRIS;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class p4_font13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Font Demo");
		String fontlist[] = null;
		String msg = "";
		TextArea txt = null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontlist = ge.getAvailableFontFamilyNames();
		for (int i = 0; i < fontlist.length; i++) {
			msg = msg + fontlist[i] + "\n";
			txt = new TextArea(msg);
		}
		txt.setBounds(70, 100, 300, 300);
		f.add(txt);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		// window closing event
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}