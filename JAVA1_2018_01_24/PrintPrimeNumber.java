//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_01_24;

//PrimeNumber = 소수 이다.
import java.util.Scanner;

public class PrintPrimeNumber {

	public static boolean prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please input number");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= num; i++) {//1은 소수가 아니므로 2부터 시작한다.
			boolean isprime = prime(i);
			if (isprime) { 
				System.out.print(i + "   ");
				count++;
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}

		}
	}

}
