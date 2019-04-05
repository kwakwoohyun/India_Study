package Exam;

import java.util.Scanner;
import java.util.Arrays;

public class gNecessity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String temp[] = new String[10];
		String str = sc.nextLine();
		String word = "";
		int j = 0;
		char s[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			s[i] = str.charAt(i);
			if ((s[i] == ' ') || (s[i] == '?') || (s[i] == '!')) {
				count++;
				temp[j] = word;
				j++;
				word = "";
			} else
				word = word + s[i];
		}
		System.out.println("LENGTH : " + count);

		String new_temp[] = new String[j];
		for (int i = 0; i < j; i++) {
			new_temp[i] = temp[i];
		}

		Arrays.sort(new_temp);
		for(int i=0; i<j ; i++) {
		System.out.print(new_temp[i] + " ");
		}

	}
}
