package Exam;

//HELLO!HOW ARE YOU?HOPE EVERY THING IS FINE.BEST OF LUCK.
import java.util.Scanner;

public class lFindLengthOfSentenceVVVVWWW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT : ");
		String str = sc.nextLine();
		int k = 0;
		int z = 0;
		int q = 0;
		int e=1;
		int word = 0;
		int vowel = 0;
		
		String sentence = "";
		String strArray[] = new String[str.length()];
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '!' || ch[i] == '?' || ch[i] == '.') {
				for (int j = z; j < i; j++) {
					sentence =sentence + ch[j];
				}
				strArray[k] = sentence;
				sentence = "";
				k++;
				z = i + 1;
			}
		}
		int wv[] = new int[k * 2];
		System.out.println("Sentence          No.of Vowels          NO.of Words");
		for (int i = 0; i < k; i++) {
			char c[] = strArray[i].toCharArray();
			System.out.print("    " + (i+1) + "               ");
			for (int j = 0; j < c.length; j++) {
				if (c[j] == 'A' || c[j] == 'E' || c[j] == 'I' || c[j] == 'O' || c[j] == 'U') {
					vowel++;
				}
				if (c[j] == ' ') {
					word++;
				}
			}
			wv[q] = vowel * 3;
			wv[q + 1] = (word+1) * 3;
			q=q+2;
			System.out.print("    " + vowel + "               ");
			vowel = 0;
			System.out.println("    " + (word + 1));
			word = 0;
		}
		System.out.println("Sentence          No.of words/vowels");

		for(int i=0;i<wv.length;i=i+2) {
			System.out.print("   "+e+"              ");
			e++;
			for(int j=0;j<wv[i];j++) {
				System.out.print("V");
			}
			System.out.print("\n");
			System.out.print("                  ");
			for(int r=0;r<wv[i+1];r++) {
				System.out.print("W");
			}
			System.out.print("\n");
		}
	}
}
