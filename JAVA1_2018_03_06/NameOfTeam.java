package JAVA1_2018_03_06;
import java.util.Scanner;
public class NameOfTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("INPUT : N = ");
		int n = sc.nextInt();
		String team[] = new String[n];
		String s=sc.nextLine();
		int max=0;
		for(int i=0;i<n;i++) {
			System.out.println("Team "+(i+1)+": ");
			team[i]=sc.nextLine();
			if(team[i].length()>max) {
				max=team[i].length();
			}
		}
		char array[][]=new char[max][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<max;j++) {
				if(j>team[i].length()-1) {
					array[j][i]=' ';
				}else {
				array[j][i]=team[i].charAt(j);
				}
			}
		}
		for(int i=0;i<max;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+"    ");
			}
			System.out.println();
		}
	}

}
