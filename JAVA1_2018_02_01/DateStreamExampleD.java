package JAVA1_2018_02_01;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Formatter;

public class DateStreamExampleD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = new DataInputStream(System.in);
		Formatter fmt = new Formatter();

		System.out.println("Enter P1");
		float f = Float.parseFloat(in.readLine());
		System.out.println("Enter P2");
		float g = Float.parseFloat(in.readLine());
		double area = 3.14 * f * g;
		fmt.format("%1.2f",area);
		System.out.println("Area of eclipse " + fmt);

	}

}
