import java.util.Scanner;

//server chat program
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Question");
		System.out.println("Keyword : name,from,old,job,department,hobby,gender");
		while (true) {
			String q = sc.nextLine();
			String str[] = q.split(" ");
			out(str);
		}
	}

	public static void out(String str[]) {
		for(int i=0;i<str.length;i++) {
			switch (str[i]) {
			case "name":
				System.out.println("My name is kwak");
				break;
			case "from":
				System.out.println("I'm from Korea");
				break;
			case "old":
				System.out.println("I'm 24years old");
				break;
			case "job":
				System.out.println("I'm student");
				break;
			case "department":
				System.out.println("My department is computer science");
				break;
			case "hobby":
				System.out.println("My hobby is coding");
				break;
			case "gender":
				System.out.println("I'm a man");
				break;
			default:
				break;
			}
		}
	}
}
