package Exam;

/*20:10 20-12.
12:30 20-12.
16:20 20-12.*/
/*2:50 21-12.
12:30 21-12.
16:30 20-12.*/
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("NUMBER OF USERS : ");
		int usernum = sc.nextInt();
		int user[] = new int[usernum];
		int logintimeh[] = new int[usernum];
		int logintimem[] = new int[usernum];
		int loginmonth[] = new int[usernum];
		int logindate[] = new int[usernum];
		int logouttimeh[] = new int[usernum];
		int logouttimem[] = new int[usernum];
		int logoutmonth[] = new int[usernum];
		int logoutdate[] = new int[usernum];
		int k = 0;
		int during[]=new int [usernum];
		int duringhour[]=new int[usernum];
		int duringminute[]=new int[usernum];
		String tmp1 = "";
		String tmp2 = "";
		String login[] = new String[usernum];
		String logout[] = new String[usernum];
		System.out.println("INPUT USER ID : ");
		for (int i = 0; i < usernum; i++) {
			user[i] = sc.nextInt();
		}
		System.out.println("INPUT LOGIN TIME & DATE : ");
		String zzzz = sc.nextLine();
		for (int i = 0; i < usernum; i++) {
			login[i] = sc.nextLine();
		}
		System.out.println("INPUT LOGOUT TIME & DATE : ");
		for (int i = 0; i < usernum; i++) {
			logout[i] = sc.nextLine();
		}
		for (int i = 0; i < usernum; i++) {
			char loginch[] = login[i].toCharArray();
			for (int j = 0; j < loginch.length; j++) {
				if (loginch[j] == ':') {
					logintimeh[i] = Integer.parseInt(tmp1);
					tmp1 = ""; 
				} else if (loginch[j] == ' ') {
					logintimem[i] = Integer.parseInt(tmp1);
					tmp1 = "";
				} else if (loginch[j] == '-') {
					logindate[i] = Integer.parseInt(tmp1);
					tmp1 = "";
				} else if (loginch[j] == '.') {
					loginmonth[i] = Integer.parseInt(tmp1);
					tmp1 = "";
				} else {
					tmp1 = tmp1 + String.valueOf(loginch[j]).toString();
				}
			}
		}
		for (int i = 0; i < usernum; i++) {
			char logoutch[] = logout[i].toCharArray();
			for (int j = 0; j < logoutch.length; j++) {
				if (logoutch[j] == ':') {
					logouttimeh[i] = Integer.parseInt(tmp2);
					tmp2 = "";
				} else if (logoutch[j] == ' ') {
					logouttimem[i] = Integer.parseInt(tmp2);
					tmp2 = "";
				} else if (logoutch[j] == '-') {
					logoutdate[i] = Integer.parseInt(tmp2);
					tmp2 = "";
				} else if (logoutch[j] == '.') {
					logoutmonth[i] = Integer.parseInt(tmp2);
					tmp2 = "";
				} else {
					tmp2 = tmp2 + String.valueOf(logoutch[j]).toString();
				}
			}
		}
		for(int i=0;i<usernum;i++) {
			if((loginmonth[i]==logoutmonth[i]) && (logindate[i]==logoutdate[i])) {
				during[i]=(logouttimeh[i]*60+logouttimem[i])-(logintimeh[i]*60+logintimem[i]);
			}
			else if((loginmonth[i]!=logoutmonth[i]) || (logindate[i]!=logoutdate[i])) {
				int diff = logoutdate[i]-logindate[i];
				during[i]=((logouttimeh[i]*60)+(diff*24*60)+logouttimem[i])-(logintimeh[i]*60+logintimem[i]);
			}
		}
		for(int i=0; i<usernum;i++) {
			int z = during[i];
			int h=0;
			int m=0;
			while(z>=60) {
				z=z-60;
				h++;
			}
			duringhour[i]=h;
			duringminute[i]=z;
		}
		int max=0;
		for(int i=0;i<usernum;i++) {
			if(duringhour[i]>max) {
				max=i;
			}
		}
		System.out.println("USER         LOGIN             LOGOUT        DURATION HOURS");
		for (int i = 0; i < usernum; i++) {
			System.out.print(
					user[i] + "      " + logintimeh[i] + " : " + logintimem[i] + " " + loginmonth[i] + " - " + logindate[i]);
			System.out.print(
					"      " + logouttimeh[i] + " : " + logouttimem[i] + " " + logoutmonth[i] + " - " + logoutdate[i]+"      "+duringhour[i]+" : "+duringminute[i]);
			System.out.println("");
		}
		System.out.println("THE USER WHO LOGGED IN FOR THE LONGEST DURATION : ");
		System.out.print(user[max]+"      "+logintimeh[max] + " : " + logintimem[max] + " " + loginmonth[max] + " - " + logindate[max]);
		System.out.print(
				"      " + logouttimeh[max] + " : " + logouttimem[max] + " " + logoutmonth[max] + " - " + logoutdate[max]+"      "+duringhour[max]+" : "+duringminute[max]);
	}

}
