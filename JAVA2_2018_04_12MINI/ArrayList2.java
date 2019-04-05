package JAVA2_2018_04_12MINI;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<>();
		arlist.add(10);
		arlist.add(20);
		System.out.println(arlist.get(0));
		System.out.println(arlist.get(1));
		
		ArrayList<Integer> arlist2 = new ArrayList<>(arlist);
		System.out.println(arlist2.get(0));
		System.out.println(arlist2.get(1));
		
		ArrayList<Integer> arlist3 = new ArrayList<>(2);
		arlist3.add(30);
		arlist3.add(40);
		System.out.println(arlist3.get(0));
		System.out.println(arlist3.get(1));

	}

}
