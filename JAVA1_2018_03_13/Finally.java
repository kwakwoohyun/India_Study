package JAVA1_2018_03_13;

public class Finally {
//오류가 있던 없던 실행한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		System.out.println("out of try");
		try {
			System.out.println("Access invalid element"+a[3]);
		}//catch(Exception e){
			//System.out.println("array index out of bound");
	//	}
		finally {
			System.out.println("Finally is always executed.");
		}
	}

}
