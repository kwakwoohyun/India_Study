package Exam;

import java.util.Scanner;

public class kDiamondString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT : ");
		String str = sc.next();
		int k = str.length();
		StringBuffer strr = new StringBuffer(str);
		int middle = k / 2;
		int right = middle;
		int left = middle;
		for (int i = 0; i < k; i++) {
			if (i == 0 || i == k - 1) {
				System.out.println(strr);
			} else if (i == 1 || i == k - 2) {
				StringBuffer temp = new StringBuffer(str);
				temp.replace(middle, middle + 1, " ");
				System.out.println(temp);
			} else {
				if (i <= (k / 2)) {
					StringBuffer temp = new StringBuffer(str);
					left--;
					right++;
					for (int j = left; j <= right; j++) {
						temp.replace(j, j + 1, " ");
					}
					System.out.println(temp);
				} else {
					StringBuffer temp = new StringBuffer(str);
					left++;
					right--;
					for (int j = left; j <= right; j++) {
						temp.replace(j, j + 1, " ");
					}
					System.out.println(temp);
				}
			}
		}
	}

}
