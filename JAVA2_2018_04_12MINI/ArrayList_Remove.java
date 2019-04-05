package JAVA2_2018_04_12MINI;

import java.util.ArrayList;

public class ArrayList_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arlist = new ArrayList<>();
		arlist.add("Shim");
		arlist.add("Kwak");
		arlist.add("Jong");
		arlist.add("Na");
		System.out.println(arlist);
		arlist.remove(3);
		System.out.println(arlist);
		arlist.remove("Jong");// (Integer)10
		System.out.println(arlist);
		//arlist.clear();
		//System.out.println(arlist);
		ArrayList<String> arlist2 = new ArrayList<>();
		arlist2.add("Shim");
		arlist2.add("Kwak");
		arlist2.add("Jong");
		arlist2.add("Na");
		ArrayList<String> arlist3 = new ArrayList<>();
		arlist3.add("Jong");
		arlist2.removeAll(arlist3);//arlist3에 있는 내용은 모두 지운다.
		System.out.println(arlist2);
		arlist2.retainAll(arlist);//retainAll = 유지하다.
		System.out.println(arlist2);
	}

}
