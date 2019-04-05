//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;
import java.util.Arrays;

public class fSquareMatrix {
	public static void print(int array[][],int m) {
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < m ; j++) {
				System.out.print(array[i][j]+"  ");
			}
			System.out.println("");
		}
	}
	
	public static void sort(int array[][],int m) {
		int n = (m*m)-((m-1)*4);//formula=식
		int j = 1;
		int x = 1;
		int z = m;
		int count = 0;
		int array2[] = new int[n];
		for(int i = 0; i < n ; i++) {//loop control 반복 
			array2[i]=array[j][z-(z-x)];
			count++;
			z++;
			x++;
			if(count == m-2) {
				j=j+1;
				x=1;
				count = 0;
				z=m; //content 내용
			}
		}
		j=1;
		z=m;
		count=0;
		Arrays.sort(array2);
		for(int i = 0 ; i < n ; i++) {
			array[j][z-(z-x)]=array2[i];
			count++;
			z++;
			x++;
			if(count==m-2) {
				j=j+1;
				x=1;
				count = 0;
				z=m;
			}
		}
		print(array,m);
	}
	
	public static void cross(int array[][],int m) {
		int count = 0 ;
		int sum = 0 ;
		for(int a = 0 ; a < m ; a++) {
			for(int b = 0 ; b < m ; b++) {
				if((a==b) || (a+b==m-1)) {
					System.out.print(array[a][b]+"  ");
					count=count+1;
					sum=sum+array[a][b];
				}  

				else {
					System.out.print("    ");
					count=count+1;
				}
			}
			System.out.println("");
		}
		System.out.println("SUM OF THE DIAGONAL ELEMENTS = "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input M");
		int m = sc.nextInt();
		int array[][] = new int[m][m];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < m ; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("ORIGINAL MATRIX");
		print(array,m);
		System.out.println("BEARRANGED MATRIX");
		sort(array,m);
		System.out.println("DIAGONAL ELEMENTS");
		cross(array,m);
	}

}
