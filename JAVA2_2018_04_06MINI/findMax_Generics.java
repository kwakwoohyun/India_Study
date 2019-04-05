package JAVA2_2018_04_06MINI;

//static 뒤에는 <T extends Comparable<T>> = 제네릭 메소드를 알려주는 것 
public class findMax_Generics {             // 리턴타입 T
	public static <T extends Comparable<T>> T findMax(T e1, T e2, T e3) {
		T max = e1;
		if (e2.compareTo(max) > 0) {
			max = e2;
		}
		if (e3.compareTo(max) > 0) {
			max = e3;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		System.out.println(findMax(i1, i2, i3));
		double d1 = 1.23;
		double d2 = 2.34;
		double d3 = 3.45;
		System.out.println(findMax(d1, d2, d3));
		char c1 = 'a';
		char c2 = 'b';
		char c3 = 'c';
		System.out.println(findMax(c1, c2, c3));
	}

}
