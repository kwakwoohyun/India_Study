package JAVA2_2018_04_06MINI;

public class Array_Generics {
//���׸��Լ����� �˷��ִ� <T> �̰� �׵ڰ� ����Ÿ���̴�.
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
		// �Ұ����ϴ�. Generics�� ��ü�ۿ� ���� ���Ѵ�. int�� ������ Integer�� ��ü��
		System.out.println("Printing Integer Array");
		printArray(intarray);
		System.out.println("Printing Character Array");
		printArray(chararray);
	}

}
