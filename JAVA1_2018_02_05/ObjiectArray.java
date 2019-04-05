//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package JAVA1_2018_02_05;
class Account{
	int a;
	int b;
	public void setData(int c, int d) {
		a=c;
		b=d;
	}
	public void showData() {
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
}
public class ObjiectArray {

	public static void main(String[] args) {
		//Account obj = new Account();      //��ü����
		Account obj[] = new Account[2];		//��ü�迭���������� ��ü�� �������� �ʾ���
		
		
		obj[0]=new Account(); 
		obj[1]=new Account();				//���⼭ ��ü�� ����
		
		obj[0].setData(1,2);
		
		obj[1].setData(3,4);
		System.out.println("For Array Element 0");
		obj[0].showData();
		System.out.println("For Array element 1");
		obj[1].showData();
	}

}
