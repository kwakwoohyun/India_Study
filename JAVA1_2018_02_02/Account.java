//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
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
