package JAVA2_2018_04_06MINI;

//non static �޼ҵ�� ��ü�� ����Ͽ� �����ؾ� �Ѵ�. 
//static�� ����ϴ� ������ ��ü�� ������� �������� ���� �� �̴�.
public class nonSTATIC_Generics {
	public <T> void print(T tp) {
		System.out.println(tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonSTATIC_Generics s = new nonSTATIC_Generics();
		int i = 10;
		char c = 'j';
		System.out.println("Printing Integer");
		s.print(i);
		System.out.println("Printing Character");
		s.print(c);
	}

}
