package Exam;

import java.util.Scanner;

public class jID_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		System.out.print("Give the number of integers :");
		int n = sc.nextInt();
		int maxindex[] = new int[n];
		int j = 0;
		int left=1; 
		int right=0;
		int maxi = 0;
		int orinum[] = new int[n];
		System.out.print("Give Integer :");
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			orinum[i] = num[i];
		}
		System.out.print("Original Array : ");
		for (int i = 0; i < n; i++) {
			System.out.print(orinum[i]+" ");
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				if (num[i] > max) {
					max = num[i];
					maxi = i;
				}
			}
			maxindex[j] = maxi;
			j++;
			num[maxi] = 0;
			max = 0;
		}
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					num[(n / 2) - left] = orinum[maxindex[i]];
					left++;
				}
				else if(i%2!=0) {
					num[n/2+right]=orinum[maxindex[i]];
					right++;
				}
				else if(i%2==0){
					num[n/2-left]=orinum[maxindex[i]];
					left++;
				}
			}
		}
		if (n % 2 != 0) {
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					num[(n / 2)] = orinum[maxindex[i]];
					right++;
				}
				else if(i%2!=0) {
					num[n/2+right]=orinum[maxindex[i]];
					right++;
				}
				else if(i%2==0){
					num[n/2-left]=orinum[maxindex[i]];
					left++;
				}
			}
		}
		System.out.println("");
		System.out.print("Rearranged Array : ");
		for (int i = 0; i < n; i++) {
			System.out.print(+num[i]+" ");
		}
	}
}
