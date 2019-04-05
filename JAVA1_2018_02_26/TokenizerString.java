package JAVA1_2018_02_26;

import java.util.StringTokenizer;

public class TokenizerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer at = new StringTokenizer("my name is khan"," ");
		while(at.hasMoreTokens()) {
			System.out.println(at.nextToken());
		}
		
		StringTokenizer st = new StringTokenizer("my,name,is,khan");
		System.out.println("Next token is : "+st.nextToken(","));
	}

}
