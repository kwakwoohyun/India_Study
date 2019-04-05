package Network_2018_07_25;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CharacterIsTicsIP {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		InetAddress Address11 = InetAddress.getByName("www.javatpoint.com");
		System.out.println(Address11);

		InetAddress Address12 = InetAddress.getByName("208.91.199.91");
		System.out.println(Address12.getHostName());

		InetAddress Address13 = InetAddress.getByName("www.mcc.edu.in");
		System.out.println(Address13.getHostAddress());

		System.out.println("------------------------------------------");

		InetAddress addr = InetAddress.getByName("localhost");
		System.out.println(addr);

		InetAddress addr1[] = InetAddress.getAllByName("www.mcc.edu.in");
		System.out.println(addr1);

		InetAddress addr2[] = InetAddress.getAllByName("www.mcc.edu.in");
		for (int i = 0; i < addr2.length; i++) {

			System.out.println(addr2[i]);

		}

		System.out.println("------------------------------------------");

		InetAddress addr4 = InetAddress.getByName("224.1.0.1");
		if (addr4.isAnyLocalAddress()) {
			System.out.println(addr4 + " is local address");
		} else {
			System.out.println(addr4 + " is not local address");
		}

	}

}
