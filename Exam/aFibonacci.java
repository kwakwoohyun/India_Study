//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package Exam;
import java.util.Scanner;
public class aFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���°������ �Ǻ���ġ ������ ���ұ��");
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
