package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

public class scrollbar {
	scrollbar() {
		Frame f1 = new Frame("Scrollbar Example");
		final Label l = new Label();
		l.setAlignment(Label.CENTER);
		l.setSize(500, 500);
		final Scrollbar s = new Scrollbar();
		s.setBounds(100, 100, 20, 300);
		final Scrollbar s2 = new Scrollbar(Scrollbar.HORIZONTAL);
		s2.setBounds(200, 200, 300, 20);
		f1.add(s);
		f1.add(s2);
		f1.add(l);
		f1.setSize(600, 500);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setBackground(Color.pink);
		s.setBackground(Color.CYAN);
		s2.setBackground(Color.BLACK);
		s.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l.setText("Vertical Scrollbar Adjusted with : " + s.getValue());
			}
		});
		s2.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l.setText("Horizontal Scrolbar Adjusted with :" + s2.getValue());
			}
		});
		
		// window closing event
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new scrollbar();
	}

}
