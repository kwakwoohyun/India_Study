//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;

class print {
	public void printt(int i, int j) {
		System.out.print(j + "*" + i + "=" + (j * i) + " ");
	}
}

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int num = sc.nextInt();
		print m = new print();
		for (int j = 1; j <= num; j++) {
			for (int i = 0; i <= num; i++) {
				m.printt(i, j);
			}
			System.out.println();
		}
	}

}
