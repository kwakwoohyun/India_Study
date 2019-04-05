

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class zFileUDPreceiver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(7789);
		byte[] buf = new byte[3000];
		// 패킷을 생성한다.
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		// 소켓.receive로 패킷을 받는다.
		ds.receive(dp);
		System.out.println("receive ! ");

		System.out.println("input file");
		Scanner sc =new Scanner(System.in);
		String file = sc.nextLine();
		String copyfile = ("D://java//"+file+".doc");
		// 받은 파일을 fileoutputstream을 이용하여 저장한다. (옮긴다)
		FileOutputStream fos = new FileOutputStream(copyfile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
  
		bos.write(dp.getData(), 0, dp.getLength());
		bos.flush();

		ds.close();
	}

}
