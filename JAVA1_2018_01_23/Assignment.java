//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package JAVA1_2018_01_23;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		int c = 5;
		
		int add = a+b;
		//(a>b)?a:b
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max);
	}

}
