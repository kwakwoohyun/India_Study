package JAVA2_2018_04_14Assignment;

import java.util.Scanner;
import java.util.ArrayList;

public class Reverse_arr {
	public static void reverse(ArrayList arr) {
		int num[] = new int[arr.size()];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) arr.get(i);
		}
		arr.clear();
		for (int i = num.length - 1; i >= 0; i--) {
			arr.add(num[i]);
		}
		System.out.println(arr);
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
		reverse(arr);
	}
}