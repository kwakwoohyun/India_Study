package JAVA2_2018_04_06MINI;

public class generic {
	public <T> T get(T tp) {
		System.out.println(tp);
		return tp;
	}

	public <T> void arr(T[] tp) {
		for (int i = 0; i < tp.length; i++) {
			System.out.println(tp[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generic g = new generic();
		int i = 10;
		char c = 'A';
		System.out.println(g.get(i));
		System.out.println(g.get(c));
		// int iarr[] = { 1, 2, 3, 4 };
		// char carr[] = { 'a', 'b', 'c', 'd' };
		Integer iarr[] = { 1, 2, 3, 4 };
		Character carr[] = { 'a', 'b', 'c', 'd' };
		g.arr(iarr);
		g.arr(carr);
	}
}
