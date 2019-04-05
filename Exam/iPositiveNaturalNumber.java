package Exam;

import java.util.Scanner;

interface positiveinterface {
	public void natural(int array[],int j,int i);
}

class naturalnumber implements positiveinterface {
	public void natural(int array[],int j,int i) {
		for(int k=i;k<=j;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println("");
	}
}

public class iPositiveNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT = ");
		int num = sc.nextInt();
		int n=num;
		int array[] = new int[num];
		int sum = 0;
		positiveinterface obj = new naturalnumber();
		naturalnumber obj2 = new naturalnumber();
		for(int i=0;i<n;i++) {
			array[i]=i+1;
		}
		for(int i=0;i<n-n;i++) {
			for(int j=i;j<n;j++) {
				sum=sum+array[j];
				if(sum==num) {
					obj2.natural(array,j,i);
					sum=0;
					break;
				}
			}
			sum=0;
		}
	}

}
