//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package JAVA1_2018_01_24;

//PrimeNumber = �Ҽ� �̴�.
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

		for (int i = 2; i <= num; i++) {//1�� �Ҽ��� �ƴϹǷ� 2���� �����Ѵ�.
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
