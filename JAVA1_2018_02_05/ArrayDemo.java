//divide=나누다,remain=나머지,reset=초기화,content=내용,formula=식,loop control=반복 
package JAVA1_2018_02_05;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = new int[7];
		for(int count = 0 ; count < 7; count ++) {
			array[count] = count+1;
		}
		for(int count = 0 ; count < 7 ; count++) {
			System.out.println("array["+count+"]="+array[count]);
		}
		System.out.println("length of array = "+array.length);
		array[8]=10;
	}

}
