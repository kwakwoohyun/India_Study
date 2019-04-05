package Network_2018_07_25;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class getURL {

	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		// TODO Auto-generated method stub

		URL hp = new URL("http://www.mcc.edu.in/file");
		System.out.println(hp.getProtocol());
		System.out.println(hp.getHost());
		System.out.println(hp.getPort());
		System.out.println(hp.getFile());
		System.out.println(hp.toExternalForm());
		
		URL hp2 = new URL("http://www.google.com");
		System.out.println(hp2.getProtocol());
		System.out.println(hp2.getHost());
		System.out.println(hp2.getPort());
		System.out.println(hp2.getFile());
		System.out.println(hp2.toExternalForm());

	}

}
