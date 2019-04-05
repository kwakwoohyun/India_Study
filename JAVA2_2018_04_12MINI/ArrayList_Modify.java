package JAVA2_2018_04_12MINI;

import java.util.ArrayList;

public class ArrayList_Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<>(10);
		arlist.add(10);
		arlist.add(20);
		arlist.add(30);
		arlist.add(40);
		arlist.add(50);
		arlist.set(0, 60); // set(index,value) = °ªÀ» ¹Ù²Û´Ù
		System.out.println(arlist);
		System.out.println(arlist.size());
		// arlist.ensureCapacity(10);
		arlist.trimToSize();
		System.out.println(arlist.size());

	}

}
