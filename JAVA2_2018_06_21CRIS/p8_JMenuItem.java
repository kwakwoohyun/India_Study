package JAVA2_2018_06_21CRIS;

import javax.swing.*;

public class p8_JMenuItem {
	JMenu menu, submenu, submenu2;
	JMenuItem i1, i2, i3, i4, i5;
	JMenuItem i6, i7, i8, i9, i10;

	p8_JMenuItem() {
		JFrame f = new JFrame();
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		submenu2 = new JMenu("Sub Menu2");
		i1 = new JMenuItem("Item1");
		i2 = new JMenuItem("Item2");
		i3 = new JMenuItem("Item3");
		i4 = new JMenuItem("Item4");
		i5 = new JMenuItem("Item5");

		i6 = new JMenuItem("Item6");
		i7 = new JMenuItem("Item7");
		i8 = new JMenuItem("Item8");
		i9 = new JMenuItem("Item9");
		i10 = new JMenuItem("Item10");

		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(i5);
		menu.add(submenu);

		submenu.add(i6);
		submenu.add(i7);
		submenu.add(i8);
		submenu.add(i9);
		submenu.add(i10);
		submenu.add(submenu2);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p8_JMenuItem();
	}

}
