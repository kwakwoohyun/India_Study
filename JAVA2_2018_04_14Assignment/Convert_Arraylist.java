package JAVA2_2018_04_14Assignment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Convert_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Input five numbers");
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		int intarr[] = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			intarr[i] = arr.get(i);
		}
		System.out.println("int array = ");
		for (int i = 0; i < intarr.length; i++) {
			System.out.print(intarr[i] + " ");
		}
	}

}
