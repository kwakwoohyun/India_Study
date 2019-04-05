package JAVA2_2018_04_14Assignment;

import java.util.Scanner;
import java.util.ArrayList;

public class Sort_arr {
	public static void sort(ArrayList arr) {
		int size = arr.size();
		int index = arr.size() - 1;
		ArrayList newarr = new ArrayList();
		for (int i = 0; i < size; i++) {
			int small = 100;
			for (int j = 0; j < arr.size(); j++) {
				if ((int) arr.get(j) < small) {
					small = (int) arr.get(j);
					index = j;
				}
			}
			newarr.add(small);
			arr.remove(index);
		}
		System.out.println(newarr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("Input five numbers");
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		sort(arr);
	}

}
