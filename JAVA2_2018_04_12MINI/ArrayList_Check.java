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
		System.out.println(arlist.contains(10)); //contains(value) = ���� �ִ��� Ȯ���ϴ� �޼ҵ�
		arlist.clear(); //clear ����Ʈ�� ��� ��Ҹ� ���� �޼ҵ�
		arlist.add(10);
		arlist.add(10);
		arlist.add(10);
		arlist.add(10);
		System.out.println(arlist.indexOf(10));
		System.out.println(arlist.lastIndexOf(10));
	}

}
