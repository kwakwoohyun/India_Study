package JAVA2_2018_04_06MINI;

//타입형을 다르게 하여 오버로딩을 가능하게 한다.
public class withoutGenerics {
	public static void print(int tp) {
		System.out.println(tp);
	}

	public static void print(char tp) {
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
