//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_01_24;

public class IfElseIfExapmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 65;
		
		if(marks<50) {
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("C grade");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("B grade");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100){
			System.out.println("A+ grade");
		}
		else {
			System.out.println("invalid!");
		}
	}

}
