//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
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
