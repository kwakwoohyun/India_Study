package JAVA1_2018_03_13;

public class MultipleCatch {
//ĳġ���� �ϳ��� ����ȴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2};
			arr[2]=3/0;
       }catch(ArithmeticException ae) {
    	   System.out.println("divide by zero");
       }catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("array index out of bound exception");
       }
	}

}
