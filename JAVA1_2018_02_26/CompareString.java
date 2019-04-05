package JAVA1_2018_02_26;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin";
		String s2="Sachin";
		String s3="Ratan";
		System.out.println("compareTo="+s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		
		System.out.println(s1.equals(s2));
		
		String c1="Sachin";
		String c2="Sachin";
		String c3=new String("Sachin");
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		
		String a1="SACHIN";
		String a2="sachin";
		String a3="Ratan";
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a2));
	}

}
