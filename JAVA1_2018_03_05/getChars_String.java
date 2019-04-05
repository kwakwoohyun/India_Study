package JAVA1_2018_03_05;

public class getChars_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("hello students how r u");
		char ch [] = new char[10];
		try {
			str.getChars(8, 18, ch, 0);
			System.out.println(ch);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
