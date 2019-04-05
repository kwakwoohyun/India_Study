//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;



public class cMagicNumber {

	static boolean composite(int j) {
		for (int i = 2; i < j; i++) {
			if (j % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static int mmagic(int i) {
		int sum=0;
		while(i!=0) {
			sum=sum+i%10;
			i=i/10;
		}

		if(sum<10)
		{
			return sum;
		}
		else
			return mmagic(sum);
	}
	public static void main(String[] args) {
		int sum=0;
		int x;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input M");
		int m = sc.nextInt();
		System.out.println("Input N");
		int n = sc.nextInt();
		System.out.println("THE COMPOSITE MAGIC INTEGERS ARE : ");
		for (int i = m; i <= n; i++) {
			if (composite(i)) {
				if(mmagic(i)==1) {
					count++;
					System.out.print(i+" ");
				}
			}
		}
		System.out.println("");
		System.out.println("FREQUENCY OF COMPOSITE MAGIC INTEGERS IS "+count);
	}

}

