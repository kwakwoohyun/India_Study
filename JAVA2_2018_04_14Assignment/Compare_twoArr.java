package JAVA2_2018_04_14Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compare_twoArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Input the five number(arr1)");
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println("Input the five number(arr2)");
		arr2.add(sc.nextInt());
		arr2.add(sc.nextInt());
		arr2.add(sc.nextInt());
		arr2.add(sc.nextInt());
		arr2.add(sc.nextInt());
		Collections.sort(arr);
		Collections.sort(arr2);
		if (arr.equals(arr2)) {
			System.out.println("Same elements");
		} else {
			System.out.println("Not same elements");
		}
	}

}
