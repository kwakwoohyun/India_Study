//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package Exam;

import java.util.Scanner;

public class Harshad_Niven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int temp = i;
			int sum = 0;
			while (temp != 0) {
				sum = (temp % 10) + sum;
				temp = temp / 10;
			}

			if (i % sum == 0) {
				System.out.print(i + " ");
			}

		}

	}

}
