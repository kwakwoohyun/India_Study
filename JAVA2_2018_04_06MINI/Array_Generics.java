package JAVA2_2018_04_06MINI;

public class Array_Generics {
//제네릭함수임을 알려주는 <T> 이고 그뒤가 리턴타입이다.
	public static <T> void printArray(T[] tparr) {
		/*for (T element : tparr) {
			System.out.println(element);
		}*/
		for (int i = 0; i < tparr.length; i++) {
			System.out.println(tparr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intarray[] = { 10, 20, 30, 40, 50 };
		Character chararray[] = { 'J', 'A', 'V', 'A' };
		// int intarray[]={10,20,30,40,50};
		// char charray[]={'J','A','V','A'};
		// 불가능하다. Generics는 객체밖에 받지 못한다. int는 변수용 Integer는 객체용
		System.out.println("Printing Integer Array");
		printArray(intarray);
		System.out.println("Printing Character Array");
		printArray(chararray);
	}

}
