package JAVA1_2018_02_26;

public class Buffer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sa = new StringBuffer("Hello");
		sa.append("Java");
		System.out.println("append="+sa);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.insert(1, "Java");
		System.out.println("insert="+sb);
		
		StringBuffer sc = new StringBuffer("Hello");
		sc.replace(1,3,"Java");
		System.out.println("replace="+sc);
		
		StringBuffer sd = new StringBuffer("Hello");
		sd.delete(1,3);
		System.out.println("delete="+sd);
		
		StringBuffer se = new StringBuffer("Hello");
		se.reverse();
		System.out.println("reverse="+se);
		
		StringBuffer sf = new StringBuffer();
		System.out.println("sf capacity="+sf.capacity());//(16*2)+2
		
		StringBuffer sg = new StringBuffer();
		sg.append("Hello");
		System.out.println("sg capacity="+sg.capacity());//16 
		sg.append("java is my favourite language");
		sg.ensureCapacity(10);//(16*2)+2=34
		System.out.println("ensureCapacity="+sg.capacity());
		sg.ensureCapacity(50);//(34*2)+2
		System.out.println("ensureCapacity="+sg.capacity());
	}

}
