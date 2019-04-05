//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;
import java.util.Scanner;
public class aFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번째까지의 피보나치 수열을 구할까요");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			System.out.print(fibo(i)+" ");
			i++;
		}
	}
	public static int fibo(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}

}
