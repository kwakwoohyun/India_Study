//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package Exam;

public class aFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int num = 1;
		System.out.print("5! = ");
		
		for(int i=a; i>0; i--) {
			num = num*i;
			System.out.print(i);
			if(i!=1) {
				System.out.print("*");
			}
			else if(i==1) {
				System.out.print("=");
			}
		}
		System.out.print(num);
	}

}
