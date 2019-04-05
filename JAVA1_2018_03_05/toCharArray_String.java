package JAVA1_2018_03_05;

public class toCharArray_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		int icount = 0;
		String str = "hi my name is";
		char[] c = str.toCharArray();
		for(int i = 0 ; i < c.length; i++) {
			if(c[i]=='i') {
				icount++;
			}
		}
		System.out.println(icount);
	}

}
