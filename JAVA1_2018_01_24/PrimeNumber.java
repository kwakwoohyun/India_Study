//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_01_24;

//PrimeNumber = 소수 이다.
import java.util.Scanner;

public class PrimeNumber {

	public static boolean prime(int num) {
		for (int i = 2; i < num; i++) {  //소수는 1과 자기 자신만 나눠지는 수 이므로 2~자기자신 전까지의 숫자들로 나누고 나누어 떨어지면 소수가 아니다. 
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
