package JAVA2_2018_04_12MINI;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<>(10);
		arlist.add(10);
		arlist.add(30);
		arlist.add(40);
		arlist.add(20);
		arlist.add(50);
		Collections.reverse(arlist);
		System.out.println(arlist);
		Collections.sort(arlist);
		System.out.println(arlist);
		Collections.sort(arlist, Collections.reverseOrder());
		System.out.println(arlist);
		Collections.swap(arlist, 0, 1);
		System.out.println(arlist);
		Collections.shuffle(arlist);
		System.out.println(arlist);
	}

}
