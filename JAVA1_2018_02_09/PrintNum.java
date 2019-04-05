package JAVA1_2018_02_09;
import java.util.Scanner;
public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2=num;
		int count=0;
		Than1000 a = new Than1000();
		while(num2!=0) {
			num2=num2/10;
			count++;
			if(count==2) {
				a.devine(num);
				break;
			}
		}
		Than100 b = new Than100();
		Than10 c = new Than10();
	}
}
class Than1000 extends PrintNum{
	static int num3;
	static int num4;
	int count=0;
	public void devine(int num) {
		num4=num%10;
		while(num!=0) {
			num=num/10;
			count++;
			if(count==1) {
				num3=num%10;
			}
			if(count==2)
				swap(num);
		}
	}
	public static void swap(int num) {
		switch(num) {
		case 1:System.out.print("ONE HUNDRED AND ");break;
		case 2:System.out.print("TWO HUNDRED AND ");break;
		case 3:System.out.print("THREE HUNDRED AND ");break;
		case 4:System.out.print("FOUR HUNDRED AND ");break;
		case 5:System.out.print("FIVE HUNDRED AND ");break;
		case 6:System.out.print("SIX HUNDRED AND ");break;
		case 7:System.out.print("SEVEN HUNDRED AND ");break;
		case 8:System.out.print("EIGHT HUNDRED AND ");break;
		case 9:System.out.print("NINE HUNDRED AND ");break;
		}
	}
}
class Than100 extends Than1000{
public void ten_num() {
	switch(num4) {
	case 0:System.out.println("TEN");break;
	case 1:System.out.print("ELEVEN  ");break;
	case 2:System.out.print("TWELVE ");break;
	case 3:System.out.print("THIRTEEN ");break;
	case 4:System.out.print("FOURTEEN");break;
	case 5:System.out.print("FIFTEEN ");break;
	case 6:System.out.print("SIXTEEN ");break;
	case 7:System.out.print("SEVENTEEN ");break;
	case 8:System.out.print("EIGHTEEN");break;
	case 9:System.out.print("NINETEEN");break;
	}
	num4=-1;
	
}

	public Than100() {
		switch(num3) {
		case 1:ten_num();break;
		case 2:System.out.print("TWOWENTY ");break;
		case 3:System.out.print("THIRTY ");break;
		case 4:System.out.print("FOURTY ");break;
		case 5:System.out.print("FIFTY ");break;
		case 6:System.out.print("SIXTY ");break;
		case 7:System.out.print("SEVENTY ");break;
		case 8:System.out.print("EIGHTY ");break;
		case 9:System.out.print("NINETY ");break;
		}
	}
}
class Than10 extends Than1000{
	public Than10() {
		switch(num4) {
		case 0:System.out.print("ZERO ");break;
		case 1:System.out.print("ONE  ");break;
		case 2:System.out.print("TWO ");break;
		case 3:System.out.print("THREE ");break;
		case 4:System.out.print("FOUR ");break;
		case 5:System.out.print("FIFE ");break;
		case 6:System.out.print("SIX ");break;
		case 7:System.out.print("SEVEN ");break;
		case 8:System.out.print("EIGHT ");break;
		case 9:System.out.print("NINE ");break;
		}
	}
}
