package JAVA1_2018_03_13;

public class NestedTry {
//��Ƽ�� ĳġ�� ������ �ʾ� Ʈ���̹� �ȿ� ���ϳ��� Ʈ���̹��� �ִ´�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {5,0,1,2};
			try {
				int x=arr[3]/arr[1];
			}catch(ArithmeticException ae) {
				System.out.println("divided by zero");
			}
			arr[4]=3;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
	}

}
