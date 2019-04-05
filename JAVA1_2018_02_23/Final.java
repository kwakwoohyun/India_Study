package JAVA1_2018_02_23;

import java.util.Scanner;
import java.util.Arrays;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int z = 0;
		System.out.print("Enter number of names in Array A N=");
		final int n = sc.nextInt();
		System.out.print("Enter number of names in Array B M=");
		final int m = sc.nextInt();
		int count = n + m;
		int q=0;
		int w=0;
		int t=0;
		 String A[] = new String[n];
		System.out.println("First array : (A)");
		for (int i = 0; i < n; i++) {
			q=0;
			String atmp = sc.next();
			
			if(atmp.equals(A[q])) {
				System.out.println("Try Input");
				i--;
				q++;
			}else{
				A[i]=atmp;
			}
		}
		 String B[] = new String[m];
		System.out.println("Second Array : (B)");
		for (int i = 0; i < m; i++) {
			w=0;
			
			String btmp = sc.next();
			if(btmp.equals(B[w]) || btmp.equals(A[0]) || btmp.equals(A[1])) {
				t=0;
				System.out.println("Try Input");
				i--;
				w++;
			}else{
				B[i]=btmp;
			}
		}
		 String C[] = new String[n + m];
		for (int i = 0; i < n; i++) {
			C[i] = A[i];
		}
		for (int i = n; i < n + m; i++) {
			C[i] = B[z];
			z++;
		}
		for (int i = 0; i < n + m; i++) {
			System.out.println(C[i]);
		}
		System.out.println("(A)");
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
		System.out.println("(B)");
		for (int i = 0; i < m; i++) {
			System.out.println(B[i]);
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		System.out.println("(C)");
		for (int i = 0; i < n + m; i++) {
			System.out.println(C[i]);
		}
		System.out.println("(A)");
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
		System.out.println("(B)");
		for (int i = 0; i < m; i++) {
			System.out.println(B[i]);
		}

	}

}
