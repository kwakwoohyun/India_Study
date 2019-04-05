package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class basic1 extends Frame {
	public void paint(Graphics g) {
		g.drawString("Hello", 200, 200);  //문자열과 시작지점
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic1 t = new basic1();
	}

	public basic1() {
		setSize(400,400); //콘솔창 사이즈
		setVisible(true);
		setTitle("Event in Java awt");  //콘솔창 타이틀 beginning frame
	}
}
