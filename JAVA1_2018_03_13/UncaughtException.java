package JAVA1_2018_03_13;

public class UncaughtException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		try {
			a = 0;
			b = 10;
			c = b / a;
			System.out.println("This line will not be executed");
		} catch (Exception e) {
			System.out.println("Divided by zero");
		}
		System.out.println("After exception is handled");
	}
}
