package JAVA1_2018_03_05;

public class indexOf_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "this is index of example";
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("index");
		System.out.println(index1+" "+index2);
		
		int index3=s1.indexOf("is",10);
		System.out.println(index3);
		
		int index4=s1.indexOf('s');
		System.out.println(index4);
		
		int index5=s1.indexOf("is",1);
		System.out.println(index5);
	}

}
