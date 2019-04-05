package JAVA2_2018_04_06_MINI;
//ArrayList 는 제네릭 클래스의 일부이다.
import java.util.*;

public class ArrayList_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		arlist.add(10);
		arlist.add(20);
		System.out.println(arlist.get(0));
		System.out.println(arlist.get(1));
		System.out.println(arlist.indexOf(10));
		System.out.println(arlist.indexOf(20));
		if (arlist.isEmpty()) {
			System.out.println("Empty Array List");
		} else {
			System.out.println("Non Empty Array List");
		}
	}

}
