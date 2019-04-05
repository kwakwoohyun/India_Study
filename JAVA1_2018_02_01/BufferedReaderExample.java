//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_02_01;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Welcome "+name);
	}

}
