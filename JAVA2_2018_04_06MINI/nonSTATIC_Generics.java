package JAVA2_2018_04_06MINI;

//non static 메소드는 객체를 사용하여 접근해야 한다. 
//static을 사용하는 이유는 객체를 사용하지 않으려고 쓰는 것 이다.
public class nonSTATIC_Generics {
	public <T> void print(T tp) {
		System.out.println(tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonSTATIC_Generics s = new nonSTATIC_Generics();
		int i = 10;
		char c = 'j';
		System.out.println("Printing Integer");
		s.print(i);
		System.out.println("Printing Character");
		s.print(c);
	}

}
