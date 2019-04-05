package JAVA2_2018_06_29CRIS;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kwak_Hotel extends Canvas {
	JPanel mainPanel = new JPanel();
	JPanel appetizerPanel = new JPanel();
	JPanel maincoursePanel = new JPanel();
	JPanel billPanel = new JPanel();
	JPanel[] panels = { mainPanel, appetizerPanel, maincoursePanel, billPanel };

	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("C:\\Users\\user\\Desktop\\Assignment\\m.png");
		Image i2 = t.getImage("C:\\Users\\user\\Desktop\\Assignment\\g.png");
		g.drawImage(i, 150, 60, this);
		g.drawImage(i2, 350, 60, this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kwak_Hotel h = new Kwak_Hotel();
		JFrame f = new JFrame();
		f.add(h);
		f.setBackground(Color.white);
		f.setSize(750, 450);
		// f.setLayout(null);
		f.setVisible(true);
	}

}
