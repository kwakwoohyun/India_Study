//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;

//EvilNumber = 이진수의 1의 개수가 짝수인것 
import java.util.Scanner;

public class bEvilNumner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT :");
		int count = 0;
		int count1 = 0;
		int num=sc.nextInt();
		int bina[]=new int[15];
		while(num!=0){
			try {
			bina[count]=num%2;
			}catch(Exception e) {
				System.out.println("Array");
			}
			count++;
			num=num/2;
		}
		System.out.print("BINARY EQUIVALENT: ");
		for(int i=count-1;i>=0;i--) {
			System.out.print(bina[i]);
			if(bina[i]==1) {
				count1=count1+1;
			}
		}
		System.out.println();
		System.out.println("NO.OF 1's:"+count1);
		if(count1%2==0) {
			System.out.println("Evil Number");
		}
		else
			System.out.println("Not Evil Number");
			
	}
}
