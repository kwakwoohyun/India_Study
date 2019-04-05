//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
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
