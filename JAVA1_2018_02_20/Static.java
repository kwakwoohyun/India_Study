package JAVA1_2018_02_20;
import java.util.Scanner;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sentences.");
		int k=sc.nextInt();
		int count = 0;
		System.out.println("Enter sentences.");
		String str = sc.nextLine();
		char s[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			s[i]=str.charAt(i);
			if(s[i]==' ') {
				count++;
			}
		}
	}
	static void word() {
		
	}

}
