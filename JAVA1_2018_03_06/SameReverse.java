package JAVA1_2018_03_06;

import java.util.Scanner;

public class SameReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT : ");
		String str = sc.nextLine();
		if(str.endsWith(".") || str.endsWith("?") || str.endsWith("!")) {
			str=str.replace(".", " ");
			str=str.replace('?', ' ');
			str=str.replace('!', ' ');
		}
		String tmp[] = str.split(" ");
		int count = 0;
		System.out.println("OUTPUT : ");
		for (int i = 0; i < tmp.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(tmp[i]);
			String tempsb = sb.toString();
			String tempreverse = sb.reverse().toString();
			if (tempsb.equals(tempreverse)) {
				System.out.print(tempsb+" ");
				count++;
				sb.delete(0, sb.length());
			}
		}
		System.out.println("");
		if (count != 0) {
			System.out.println("NUMBER OF PALINDROMIC WORDS :" + count);
		}
		else {
			System.out.println("NO PALINDROMIC WORDS");
		}
	}

}
