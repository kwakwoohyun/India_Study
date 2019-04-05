package JAVA2_2018_04_11CRIS;

//1. create frame 2. 
import java.awt.*;
import java.awt.event.*;

public class basic3 {
	private static Dialog d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic3 t = new basic3();
	}

	public basic3() {
		Frame f = new Frame("wohyun");
		d = new Dialog(f, "Dialog Demo", true);
		d.setLayout(new FlowLayout());
		Button b = new Button("OK");
		d.add(new Label("Dialog example Button"));
		d.add(b);
		d.setSize(400, 200);
		d.setVisible(true);
	}

}
