package Network_2018_07_11;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class get_url {

	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress Address = InetAddress.getLocalHost();
		InetAddress addr4 = InetAddress.getByName("224.1.0.1");

		String address = String.valueOf(addr4);
		String num[] = address.split("/");
		String rnum = String.valueOf(num[1]);
		String rrnum[] = rnum.split("\\.");
		int raddress = Integer.parseInt(rrnum[0]);

		if (raddress > 0 && raddress < 128) {
			System.out.println("A Class");
		}
		if (raddress > 127 && raddress < 192) {
			System.out.println("B Class");
		}
		if (raddress > 191 && raddress < 224) {
			System.out.println("C Class");
		}
		if (raddress > 223 && raddress < 240) {
			System.out.println("D Class");
		}
		if (raddress > 239 && raddress < 256) {
			System.out.println("E Class");
		}

		/*
		 * char c[]=address.toCharArray(); for(int i=0;i<c.length;i++) {
		 * System.out.println(c[i]); }
		 */
		System.out.println(Address);
		InetAddress Address2 = InetAddress.getByName("www.google.com");
		System.out.println(Address2);
		InetAddress Address3 = InetAddress.getLoopbackAddress();
		System.out.println(Address3);
	}

}
