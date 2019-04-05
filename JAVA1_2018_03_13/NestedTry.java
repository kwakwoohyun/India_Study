package JAVA1_2018_03_13;

public class NestedTry {
//멀티플 캐치로 잡히지 않아 트라이문 안에 또하나의 트라이문을 넣는다.
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
