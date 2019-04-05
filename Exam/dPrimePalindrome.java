package Exam;

import java.util.Scanner;

public class dPrimePalindrome {
	static int count = 0;

	public static boolean prime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) { 
				return false;
			}
		}
		return true;
	}

	public static boolean rivers(int i) {
		int num = i;
		int r = 0;
		while (i != 0) {
			r = ((i % 10) + r) * 10;
			i = i / 10;
		}
		r = r / 10;
		if (num == r) {
			count++;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input M");
		int m = sc.nextInt();
		System.out.println("Input N");
		int n = sc.nextInt();
		if (n < 3000) {
			System.out.println("THE PRIME PALINDROME INTEGERS ARE");
			for (int a = m; a <= n; a++) {
				if (prime(a)) {
					if (a != 1) {
						if (rivers(a)) {
							System.out.print(a + " ");
						}
					}
				}

			}
			System.out.println("");
			System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS : " + count);
		} else {
			System.out.println("OUT OF RANGE");
		}

	}

}
