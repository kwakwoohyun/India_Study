package JAVA2_2018_04_11CRIS;

import java.awt.*;
import java.awt.event.*;

public class basic1 extends Frame {
	public void paint(Graphics g) {
		g.drawString("Hello", 200, 200);  //���ڿ��� ��������
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic1 t = new basic1();
	}

	public basic1() {
		setSize(400,400); //�ܼ�â ������
		setVisible(true);
		setTitle("Event in Java awt");  //�ܼ�â Ÿ��Ʋ beginning frame
	}
}
