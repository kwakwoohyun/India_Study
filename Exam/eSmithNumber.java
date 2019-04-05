//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
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
	public static int smith(int num) {//�μ������� ������ ���� �˾Ƴ�
		int sum = 0;

		for(int i=2;i<10;i++) {
			if(num%i==0) {//������ = remain
				sum = sum+i;
				num=num/i;//������ = divide
				i=2;//�ʱ�ȭ = reset
			}
		}
		if(num/10!=0) {//���� �μ����ظ� ������ ���� 10���ڸ� �̻��̸� ���ڸ��� ���� ����
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
