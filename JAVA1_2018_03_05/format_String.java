package JAVA1_2018_03_05;

public class format_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sonoo";
		
		String sf1=String.format("name is %s", name);
		String sf2=String.format("value is %f", 32.33434);
	
		String sf3=String.format("value is %32.5f", 32.33434);//%�ڿ� �Ҽ����տ� ���� space������ �ǹ� �Ҽ����ڿ� ���� �Ҽ��� ��°�ڸ� ������ ǥ��
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
	}

}
