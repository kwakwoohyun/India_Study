package JAVA1_2018_02_20;

import java.util.Scanner;
import java.util.Arrays;

public class StringStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sentences.");
		int k = sc.nextInt();
		String temp[] = new String[10];
		int count = 0;
		String word = "";
		int j = 0;
		String result[] = new String[10];
		System.out.println("Enter sentences.");
		String str1 = sc.nextLine();
		for (int z = 0; z < k; z++) {
			String str = sc.nextLine();
			char s[] = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				s[i] = str.charAt(i);
				if ((s[i] == ' ') || (s[i] == '?') || (s[i] == '.')) {
					count++;
					temp[j] = word;
					j++;
					word = "";
				} else
					word = word + s[i];
			}
		}

		equal(temp, j);
		System.out.println("Total number of word : " + count);
	}

	public static void equal(String temp[], int j) {
		int fre =0;
		String nonsame[] = new String[50];
		int samecount=0;
		int count=0;
		int frearray[]=new int[20];
		for(int i=0;i<j;i++) {
			for(int q=i+1;q<j;q++) {
				if(temp[i].equals(temp[q])) {
					j++;
				}
			}
			if(j==0) {
				nonsame[count]=temp[i];
				count++;
			}
			j=0;
		}
		for(int i=0; i<count;i++) {
			for(int z=0;z<j;z++) {
				if(nonsame[i].equals(temp[z])) {
					fre++;
				}
			}
			frearray[i]=fre;
			fre=0;
		}
		for(int i=0; i<count;i++) {
			for(int z=i+1;z<count;z++) {
				if(frearray[z]<frearray[i]) {
					String temps = nonsame[i];
					nonsame[i]=nonsame[z];
					nonsame[z]=temps;
					int ttmp=frearray[i];
					frearray[i]=frearray[z];
					frearray[z]=ttmp;
				}
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(nonsame[i]+"       "+frearray[i]);
		}
	}
}