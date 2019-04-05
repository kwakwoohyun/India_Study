//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static int count = 0;

	private static void anagrams(String pre, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(pre + "  ");
			count++;
		} else {
			for (int i = 0; i < n; i++)
				anagrams(pre + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("INPUT : ");
		anagrams("", in.next());
		System.out.println("\n" + "Total number of anagrams = " + count);

	}
}