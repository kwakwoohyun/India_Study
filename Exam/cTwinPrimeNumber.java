//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;

class prime {
	public static boolean prime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

class twin {
	public static int count = 0;
	static prime p = new prime();

	public static void twin(int i) {
		if (p.prime(i + 2)) {
			System.out.print("(" + i + "," + (i + 2) + ")");
			count++;
			if (count % 5 == 0) {
				System.out.println();
			}
		}

	}

}

public class cTwinPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input Number");
		Scanner sc = new Scanner(System.in);
		prime p = new prime();
		twin t = new twin();
		int num = sc.nextInt();
		int n = 0;
		for (int i = 2; i <= num; i++) {
			if (p.prime(i)) {
				t.twin(i);
			}
		}
	}

}
