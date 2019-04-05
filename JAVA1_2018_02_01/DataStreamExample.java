package JAVA1_2018_02_01;

import java.io.*;

public class DataStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = new DataInputStream(System.in);
		int f = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		double area = 3.14 * f * g;
		System.out.println("Area of eclipse " + area);
	}

}
