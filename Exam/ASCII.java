package Exam;
import java.util.Scanner;
public class ASCII {
	//2 3 1 2 1 7 9 8 6 2 3 1 0 1 9 9 5 0 1 8 7 2 3 7 9 2 3 1 0 1 8 1 1 7 9 2 7 -1
	//2 3 5 1 1 0 1 1 5 0 1 7 8 2 3 5 1 1 1 2 1 7 9 9 1 1 8 0 1 5 6 2 3 4 0 1 6 1 1 7 1 1 4 1 1 4 8 -1
	public static void ascii(int code[]) {
		int a=0;   
		int capital=0;
		System.out.print("THE DECODED MESSAGE : ");
		for(int i=0;i<code.length;i++) {
			a=(code[i]%10+a)*10;
			if((a/10>=65 && a/10<=122) || a/10==32) {
				if((a/10>=65) && (a/10<=90)) {
					capital++;
				}
				char temp=(char)(a/10);
				System.out.print(temp);
				a=0;
			}
		}
		System.out.println("");
		for(int i=0;i<capital;i++) {
			System.out.print("*");
		}
	}

	public static void reverse(int num[],int j) {
		int code[] = new int[j-1];
		int k=0;
		for(int i=j-2;i>=0;i--) {
			code[k]=num[i];
			k++;//이 경우에는 count나 다른 변수 이용해서 0부터 배열 저장 필요.
		}
		ascii(code);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[] = new int[50];
		int j = 0;
		System.out.println("Input code number");
		for(int i = 0 ; i < 50; i++)
		{
			num[i] = sc.nextInt();
			j++;
			if(num[i]<0) 
				break;	
		}
		reverse(num,j);
	}

}
