package JAVA2_2018_04_06_MINI;

class Pc<T> {
	public void print(T tparr[]) {
		for (int i = 0; i < tparr.length; i++) {
			System.out.println(tparr[i]);
		}
	}
}

public class GenericPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pc<Integer> obj = new Pc<Integer>();
		Integer iarr[] = { 1, 2, 3, 4 };
		obj.print(iarr);
	}

}
