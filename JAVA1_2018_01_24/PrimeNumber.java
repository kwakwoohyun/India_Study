//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package JAVA1_2018_01_24;

//PrimeNumber = �Ҽ� �̴�.
import java.util.Scanner;

public class PrimeNumber {

	public static boolean prime(int num) {
		for (int i = 2; i < num; i++) {  //�Ҽ��� 1�� �ڱ� �ڽŸ� �������� �� �̹Ƿ� 2~�ڱ��ڽ� �������� ���ڵ�� ������ ������ �������� �Ҽ��� �ƴϴ�. 
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

		boolean isprime = prime(num);
		if (isprime) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}

	}

}
