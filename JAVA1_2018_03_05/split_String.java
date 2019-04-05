package JAVA1_2018_03_05;

public class split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java string split method by javatpoint";
		String words[]=s1.split("\\s");//    \\s == space 
		String words2[]=s1.split(" "); //    " " == space
		System.out.print("words = ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		System.out.print("\n words2 = ");
		for(int i=0;i<words2.length;i++) {
			System.out.println(words2[i]);
		}
		String words3[]=s1.split(" ",4);
		System.out.print("\n words3 = ");
		for(int i=0;i<words3.length;i++) {
			System.out.println(words3[i]);
		}
		String words4[]=s1.split("",3);
		System.out.println("\n words4 = ");
		for(int i=0;i<words4.length;i++) {
			System.out.println(words4[i]);
		}
		
	}

}
