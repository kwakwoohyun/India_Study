package JAVA1_2018_03_05;

public class charAt_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="import java";
		char ch[] =new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
