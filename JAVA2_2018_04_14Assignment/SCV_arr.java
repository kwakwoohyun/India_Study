package JAVA2_2018_04_14Assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class SCV_arr {

	public static void createCSV(ArrayList<String> list, String filepath) {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(filepath,true));

			for (String item : list) {
				fw.write(item);
				fw.newLine();
			}
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shim");
		list.add("Kwak");
		list.add("Jong");
		list.add("Na");
		createCSV(list, "mycsv.csv");
	}

}
