package JAVA1_2018_03_05;

public class lastIndexOf_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is index of example";
		int index1=s1.lastIndexOf('s',2);
		System.out.println(index1);
		
		int index2=s1.lastIndexOf("is");
		System.out.println(index2);
		
		int index3=s1.lastIndexOf('e');
		System.out.println(index3);
		
		int index4=s1.lastIndexOf('e',20);
		System.out.println(index4);
	}

}
