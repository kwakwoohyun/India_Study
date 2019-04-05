package JAVA2_2018_04_14Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Shuffle_arr {
	public static void shuffle(ArrayList arr, int size) {
		ArrayList newarr = new ArrayList();
		int num = size;
		for (int i = 0; i < size; i++) {
			int random = (int) (Math.random() * num);
			newarr.add(arr.get(random));
			arr.remove(random);
			num--;
		}
		System.out.println(newarr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("Input the five numbers");
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		int size = arr.size();
		shuffle(arr, size);
	}

}
