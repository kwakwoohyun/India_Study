package JAVA2_2018_04_06MINI;

//Generics = any type of data
public class Generics {
				  //���׸��Լ����� �˷��ִ� <T> �̰� �׵ڰ� ����Ÿ���̴�.
	public static <T> void print(T tp) {
		System.out.println(tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		char c = 'j';
		System.out.println("Printing Integer");
		print(i);
		System.out.println("Printing Character");
		print(c);
	}

}
