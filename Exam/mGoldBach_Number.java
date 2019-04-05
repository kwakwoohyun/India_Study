package Exam;

import java.util.Scanner;

public class mGoldBach_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT N = ");
		int n = sc.nextInt();
		if (n % 2 == 1) {
			System.out.println("INVALID INPUT NUMBER IS ODD.");
		} else if (n <= 9 || n >= 50) {
			System.out.println("INVALID INPUT NUMBER OUT OF RANGE. ");
		} else {
			int array[] = new int[n];
			int k = 0;
			for (int i = 0; i < n; i++) {
				if (i % 2 != 0) {
					if (i != 1 && primenum(i)) {
						array[k] = i;
						k++;
					}
				}
			}
			System.out.println("OUTPUT PAIRS ARE : ");
			sum(array, k, n);
		}
	}

	public static void sum(int array[], int k, int num) {
		for (int i = 0; i <= k / 2; i++) {
			for (int j = 0; j < k; j++) {
				if (array[i] + array[j] == num) {
					System.out.println(array[i] + "  " + array[j]);
				}
			}
		}
	}

	public static boolean primenum(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
