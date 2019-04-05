//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

import java.util.Scanner;

public class bHarshad_NivenNum {
	static int count = 0;

	public static void Harshad(int num) {
		int sum=0;
		int ori=num;

		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		if(ori%sum==0){
			System.out.print(ori+" ");
			count=count+1; 
			if(count==10)
			{
				System.out.println("");
				count=0;
			}
		}
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int num = sc.nextInt();
		System.out.println("::HarseadNumber::");
		for (int i = 1; i <= num; i++) {
			Harshad(i);
		}
	}

}
