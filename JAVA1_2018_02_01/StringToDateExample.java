package JAVA1_2018_02_01;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDateExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String sDate1  = "31/12/1998";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);
	}	

}
