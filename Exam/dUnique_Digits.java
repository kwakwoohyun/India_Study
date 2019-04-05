//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;

public class dUnique_Digits {

	public static boolean unique(int num) {
		int origin = num;
		int a[] = new int[10];
		int i = 0;
		while (num != 0) {
			a[i] = num % 10; // a[0] = 0, a[1] = 0, a[2] = 1
			num = num / 10; // num = 10, num = 1, num = 0
			i = i + 1; // i = 1, i = 2, i = 3
		}
		for (int j = 0; j < i; j++) {
			for (int z = j + 1; z < i; z++) {
				if (a[j] == a[z]) {// 0 1 0 1 0 2 1 2 0 3 2 3
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Input M");
		int m = sc.nextInt();
		System.out.println("Input N");
		int n = sc.nextInt();
		System.out.println("THE UNIQUE DIGIT INTEGERS ARE : ");
		for (int i = m; i <= n; i++) {
			if (unique(i)) {
				count++;
				System.out.print(i + " ");
				if(count%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("FREQUENCY OF UNIQUE DIGIT INTEGERS IS : "+count);
	}

}
