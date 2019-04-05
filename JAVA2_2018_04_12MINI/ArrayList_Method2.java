package JAVA2_2018_04_12MINI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<>(10);
		arlist.add(10);
		arlist.add(20);
		arlist.add(30);
		arlist.add(40);
		arlist.add(50);
		Iterator itr = arlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator Listitr = arlist.listIterator();// 양방향 가능
		System.out.println("-------------");
		while (Listitr.hasNext()) {
			System.out.println(Listitr.next());
		}
		System.out.println("-------------");
		for (int i = 0; i < arlist.size(); i++) {
			System.out.println(Listitr.previous());
		}
		ListIterator Listitr2 = arlist.listIterator(3);
		System.out.println("-------------");
		while (Listitr2.hasNext()) {
			System.out.println(Listitr2.next());
		}
	}

}
