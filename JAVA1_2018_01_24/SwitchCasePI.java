//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_01_24;
import java.util.Scanner;
public class SwitchCasePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Area of circle");
		System.out.println("2. Area of Square");
		System.out.println("3. Area of sphere");
		
		int n = sc.nextInt();
		int r = 4;
		int a = 4;
		
		switch(n) {
		case 1:{
			System.out.println("r=4 Circle Area is "+r*r*3.14);
			break;
		}
		case 2:{
			System.out.println("a=4 Square Area is "+a*a);
			break;
		}
		case 3:{
			System.out.println("r=4 Sphere Area is "+4*3.14*r*r*r);
		}
			
		}
	}

}
