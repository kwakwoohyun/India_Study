package Exam;

import java.util.Scanner;

abstract class Rotated {
	abstract void Rotated(int array[][],int m);
}
 //m=3 3 4 9 2 5 8 1 6 7
//m=4 1 2 4 9 2 5 8 3 1 6 7 4 3 7 6 5
class RotatedMatrix extends Rotated {
	int sum=0;
	 void Rotated(int array[][],int m) {
		 int n=m;
		 System.out.println("MATRIX AFTER ROTATION");
		  for(int i=0;i<m;i++) {
			  for(int j=0;j<m;j++) {
				  System.out.print(array[n-1][i]+"  ");
				  n=n-1;
				  if((i==0||i==m-1) && (j==0||j==m-1)) {
					  sum=sum+array[i][j];
				  }
			  }
			  System.out.println("");
			  n=m;
		  }
		  System.out.println("SUM OF THE CORNER ELEMENTS = "+sum);
	}
}

public class hRotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int array[][] = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("ORIGINAL MATRIX");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("");
		}
		Rotated obj = new RotatedMatrix();
		obj.Rotated(array,m);
	}
}
