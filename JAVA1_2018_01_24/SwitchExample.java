//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_01_24;

public class SwitchExample {

	public static void main(String[] args) {
		//break를 지우면 
		int num = 20;
		switch(num) {
		case 10:{
			System.out.println("10");
			//break;
		}
		case 20 : {
			System.out.println("20");
			//break;
		}
		case (30) : {
			System.out.println("30");
			//break;
		}
		default : {
			System.out.println("Not in 10, 20 or 30");
		}
		}
	}

}
