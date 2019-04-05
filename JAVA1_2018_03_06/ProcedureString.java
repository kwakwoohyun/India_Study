package JAVA1_2018_03_06;
import java.util.Scanner;
public class ProcedureString {
//ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("INPUT : ");
		String str = sc.nextLine();
		String tmp[]=str.split(" ");
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i].endsWith(".") || tmp[i].endsWith("?") || tmp[i].endsWith("!")) {
				tmp[i]=tmp[i].replace('.', ' ');
				tmp[i]=tmp[i].replace('?', ' ');
				tmp[i]=tmp[i].replace('!', ' ');
			}
		}
		int k=0;
		int z=0;
		String notpro[]=new String[10];
		String pro[] = new String[10];
		for(int i=0;i<tmp.length;i++) {
			int last=tmp[i].length()-1;
			if((tmp[i].charAt(0) == 'A' || tmp[i].charAt(0) == 'E' || tmp[i].charAt(0) == 'I'|| tmp[i].charAt(0) == 'O'|| tmp[i].charAt(0) == 'U') &&
					(tmp[i].charAt(last)== 'A' || tmp[i].charAt(last)== 'E' || tmp[i].charAt(last)== 'I' || tmp[i].charAt(last)== 'O' || tmp[i].charAt(last)== 'U')) {
				pro[k]=tmp[i];
				k++;
			}
			else {
				notpro[z]=tmp[i];
				z++;
			}
		}
		System.out.println("OUTPUT : NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL : ");
		for(int i=0;i<k;i++) {
			System.out.print(pro[i]+" ");
		}
		for(int i=0;i<z;i++) {
			System.out.print(notpro[i]+" ");
		}
	}

}
