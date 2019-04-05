
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input copy file name");
		String copyfile = sc.nextLine();
		System.out.println("Input target file name");
		String targetfile = sc.nextLine();
		String copy = "C:/Users/user/eclipse-workspace/MCC/src/" + copyfile + ".java";
		String target = "C:/Users/user/eclipse-workspace/MCC/src/" + targetfile + ".java";
		try {
			fis = new FileInputStream(copy);
			fos = new FileOutputStream(target);

			byte[] buf = new byte[9999];
			int readcount = 0;

			while ((readcount = fis.read(buf)) != -1) {
				fos.write(buf, 0, readcount);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
