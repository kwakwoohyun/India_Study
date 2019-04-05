package JAVA2_2018_04_19CRIS;

import java.awt.*;
import java.awt.event.*;

public class p2_menu10 {
	p2_menu10() {
		Frame f1 = new Frame("Menubar Example");
		MenuBar mb;
		mb = new MenuBar();
		Menu menu;
		menu = new Menu("Course");
		Menu submenu1 = new Menu("UG");
		Menu submenu2 = new Menu("PG");
		MenuItem mi1 = new MenuItem("B.Sc.");
		MenuItem mi2 = new MenuItem("BCA.");
		MenuItem mi3 = new MenuItem("BBA");
		MenuItem mi4 = new MenuItem("M.Sc.");
		MenuItem mi5 = new MenuItem("MCA");
		submenu1.add(mi1);
		submenu1.add(mi2);
		submenu1.add(mi3);
		submenu2.add(mi4);
		submenu2.add(mi5);
		menu.add(submenu1);
		menu.add(submenu2);
		mb.add(menu);
		f1.setMenuBar(mb);
		f1.setSize(600, 500);
		f1.setLayout(null);
		f1.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p2_menu10();
	}

}
