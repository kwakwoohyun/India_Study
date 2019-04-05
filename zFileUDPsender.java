

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class zFileUDPsender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 데이타그램 소켓 생성 및 ip 찾기
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input file");
		String file = sc.nextLine();
		String transferFile = ("D://java//"+file+".doc");
		// 보내고싶은 파일과 파일크기를 찾아 읽어오는 작업
		//File transferFile = new File("D://java//seok.doc");
		//byte[] buf = new byte[(int) transferFile.length()];
		
		byte[] buf = new byte[999];
		FileInputStream fin = new FileInputStream(transferFile);
		BufferedInputStream bin = new BufferedInputStream(fin);
		// buf에 ㄷㅔ이터를 저장
		bin.read(buf, 0, buf.length);

		// packet을 생성하여 보내고싶은 파일,과 크기, ip, port를 저장
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 7789);
		// 소켓.send로 패킷을 보낸다.
		ds.send(dp);
		System.out.println("send ! ");
		ds.close();
	}

}
