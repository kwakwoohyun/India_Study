//variable=변수,divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;

public class fCirclularPrime {
	public static boolean prime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ori = num;
		int ori2 = num;
		int count = 0;
		int count1 = 0;
		int a;
		while (ori != 0) {
			ori = ori / 10;
			count++;//number of digit = 자리수
		}
		for (int i = 0; i < count; i++) {
			a = num % 10;
			num = num / 10 + ((int) (a * (Math.pow(10, count - 1))));
			System.out.print(num);
			if (prime(num)) {
				System.out.println(" prime");
				count1++;
			} else {
				System.out.println(" not prime");
			}
		}
		if (count1 == count) {
			System.out.println(ori2+" = circle prime");
		} else {
			System.out.println(ori2+" = not circle prime");
		}

	}

}
