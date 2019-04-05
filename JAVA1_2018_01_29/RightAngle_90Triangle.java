//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_01_29;

import java.util.Scanner;

class RightAngle {

	public void print(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

public class RightAngle_90Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input Number");
		RightAngle t = new RightAngle();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			t.print(i);
		}

	}

}
