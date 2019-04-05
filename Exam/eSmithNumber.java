//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package Exam;
import java.util.Scanner;
public class eSmithNumber {

	public static int sum(int num) {
		int sum=0;
		while(num!=0) {
			sum=(num%10)+sum;
			num=num/10;
		}
		return sum;
	}
	public static int smith(int num) {//인수분해한 수들의 합을 알아냄
		int sum = 0;

		for(int i=2;i<10;i++) {
			if(num%i==0) {//나머지 = remain
				sum = sum+i;
				num=num/i;//나누다 = divide
				i=2;//초기화 = reset
			}
		}
		if(num/10!=0) {//만약 인수분해를 끝낸뒤 수가 10의자리 이상이면 각자리의 합을 구함
			sum = sum+sum(num);
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int j = 0;
		int sum = smith(num);
		if(sum==sum(num)) {
			System.out.println("smith num");
		}
		else {
			System.out.println("not smith num");
		}
	}

}
