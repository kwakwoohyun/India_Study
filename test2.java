import java.util.Scanner;
//print time program
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name");
		String name = sc.next();
		System.out.println("Input N times");
		int n = sc.nextInt();
		System.out.println("Input Y seconds");
		int y = sc.nextInt();

		y = y * 1000;
		run(n, y, name);
	}
 
	public static void run(int n, int y, String name) {
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(y);
			} catch (Exception e) {
				System.out.println();
			}
			System.out.println(name);
		}
	}
}