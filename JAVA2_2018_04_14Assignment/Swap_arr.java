package JAVA2_2018_04_14Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap_arr {
	public static void swap(ArrayList arr, int a, int b) {
		int num1 = (int) arr.get(a);
		int num2 = (int) arr.get(b);
		arr.add(a, num2);
		arr.remove(a + 1);
		arr.add(b, num1);
		arr.remove(b + 1);
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
		System.out.println("Input swap index A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		swap(arr, a, b);
	}

}
