package Network_2018_07_25;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;

public class getURL2 {

	public static void main(String[] args) throws IOException, UnknownHostException {
		// TODO Auto-generated method stub

		URL hp = new URL("http://www.yahoo.com");
		URLConnection hpCon = hp.openConnection();

		long d = hpCon.getDate();
		if (d == 0) {
			System.out.println("No date info");
		} else {
			System.out.println("Date : " + new Date(d));
		}

		System.out.println("Content-type : " + hpCon.getContentType());

		d = hpCon.getExpiration();
		if (d == 0) {
			System.out.println("No expiry");
		} else {
			System.out.println("Expires on : " + new Date(d));
		}

		long d1 = hpCon.getLastModified();
		if (d1 == 0) {
			System.out.println("No date info");
		} else {
			System.out.println("Date : " + new Date(d1));
		}

		int len = hpCon.getContentLength();
		if (len == 1) {
			System.out.println("No content");
		} else {
			System.out.println("content : " + len);
		}

		if (len != 0) {
			System.out.println("**************");
			InputStream input = hpCon.getInputStream();
			int i = len;
			int c;
			while (((c = input.read()) != -1)) {
				System.out.print((char) c);
			}
			input.close();
		} else {
			System.out.println("No connecctions");
		}
	}

}
