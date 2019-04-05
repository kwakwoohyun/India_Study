package JAVA2_2018_04_06_MINI;

             //<T>는 제네릭 클래스임을 알려주는 키워드
class MyGenData<T> {
	T data;
	public void set(T data1) {
		data = data1;
	}

	public T get() {
		return data;
	}
}

public class Generics_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenData<Integer> gi = new MyGenData<Integer>();
		gi.set(10);
		System.out.println(gi.get());
		gi.set(20);
		System.out.println(gi.get());
		MyGenData<Character> ci = new MyGenData<Character>();
		ci.set('a');
		System.out.println(ci.get());
		ci.set('b');
		System.out.println(ci.get());
	}

}
