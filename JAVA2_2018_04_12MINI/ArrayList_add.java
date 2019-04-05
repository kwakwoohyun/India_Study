package JAVA2_2018_04_12MINI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<>();
		arlist.add(10);
		arlist.add(1, 20);
		System.out.println(arlist);
		ArrayList<Integer> arlist2 = new ArrayList<>();
		arlist2.addAll(arlist);
		System.out.println(arlist2);
		arlist2.addAll(1, arlist);
		System.out.println(arlist2);

		for (int i = 0; i < arlist.size(); i++) {
			System.out.println(arlist.get(i));
		}
		Collections.shuffle(arlist2);
		System.out.println(arlist2);
	}

}
