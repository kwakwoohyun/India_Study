package JAVA2_2018_04_12MINI;

import java.util.ArrayList;

public class ArrayList_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<>(10);
		arlist.add(10);
		arlist.add(20);
		arlist.add(30);
		arlist.add(40);
		arlist.add(50);
		System.out.println(arlist);
		System.out.println(arlist.contains(10)); //contains(value) = 값이 있는지 확인하는 메소드
		arlist.clear(); //clear 리스트의 모든 요소를 비우는 메소드
		arlist.add(10);
		arlist.add(10);
		arlist.add(10);
		arlist.add(10);
		System.out.println(arlist.indexOf(10));
		System.out.println(arlist.lastIndexOf(10));
	}

}
