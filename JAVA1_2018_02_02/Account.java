//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package JAVA1_2018_02_02;

public class Account {
	int a;
	int b;
	
	public void setData(int a, int b) {
		this.a=a;
		b=b;
	}
	
	public void showData() {
		System.out.println("Value of A = "+a);
		System.out.println("Value of B = "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setData(2, 3);
		obj.showData();
	}	

}
