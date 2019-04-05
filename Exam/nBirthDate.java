package Exam;

import java.util.Scanner;

public class nBirthDate {
	public static int day4(int n, int yyyy) {
		switch (n) {
		case 1: {
			return 31;
		}
		case 2: {
			if (yyyy % 4 == 0) {
				return 29;
			}else {
				return 28;
			}
		}
		case 3: {
			return 31;
		}
		case 4: {
			return 30;
		}
		case 5: {
			return 31;
		}
		case 6: {
			return 30;
		}
		case 7: {
			return 31;
		}
		case 8: {
			return 31;
		}
		case 9: {
			return 30;
		}
		case 10: {
			return 31;
		}
		case 11: {
			return 30;
		}
		case 12: {
			return 30;
		}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you date of birth in dd mm yyyy format : ");
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yyyy = sc.nextInt();
		int date = 0;
		if ((yyyy % 4 == 0)&&(dd<32)) {
			for (int i = 1; i < mm; i++) {
				date = date + day4(i, yyyy);
			}
			for (int i = 1; i <= dd; i++) {
				date = date + i;
			}
			System.out.println("VALID DATE : ");
			System.out.println(date);
		} else if((yyyy % 4 != 0)&&(dd<32)){
			for (int i = 1; i < mm; i++) {
				date = date + day4(i,yyyy);
			}
			for (int i = 1; i <= dd; i++) {
				date = date + 1;
			}
			System.out.println("VALID DATE : ");
			System.out.println(date);
		}else if(dd>31) {
			System.out.println("INVALID DATE");
		}
	}

}
