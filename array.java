import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];
		Scanner sc = new Scanner(System.in);

		
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		String st = sc.nextLine();
		String ss[] = st.split(" ");
		System.out.println(Arrays.toString(ss));
		
		String sss = sc.nextLine();
		char c[] = sss.toCharArray();
		System.out.println(Arrays.toString(c));
	}

}
