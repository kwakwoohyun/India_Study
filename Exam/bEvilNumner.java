//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package Exam;

//EvilNumber = �������� 1�� ������ ¦���ΰ� 
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
