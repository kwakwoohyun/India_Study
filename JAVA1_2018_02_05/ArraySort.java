//divide=������,remain=������,reset=�ʱ�ȭ,content=����,formula=��,loop control=�ݺ� 
package JAVA1_2018_02_05;
import java.util.Arrays;
import java.util.Scanner;
//sort ��������
public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int marks[] = new int[7];
		for(int i = 0 ; i < marks.length; i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("BEFORE SORTING : "+Arrays.toString(marks));
		System.out.println(marks);
		Arrays.sort(marks);
		System.out.println("AFTER SORTING : "+Arrays.toString(marks));
		
		int mark[] =null;
		for(int i=0;i<10;i++) {
			mark[i]=i;	
		}
		for(int i=0;i<mark.length;i++) {
			System.out.println(mark[i]);
		}
	}
}
