package JAVA1_2018_03_05;

public class format_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sonoo";
		
		String sf1=String.format("name is %s", name);
		String sf2=String.format("value is %f", 32.33434);
	
		String sf3=String.format("value is %32.5f", 32.33434);//%뒤에 소수점앞에 수는 space개수를 의미 소수점뒤에 수는 소수점 몇째자리 수까지 표현
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
	}

}
