package JAVA1_2018_02_20;

//<static variable> OR <normal variable>
//static variable 은 객체의 것이 아니고 클래스 것이다.
//static variable을 불러올때 객체를 사용하지 않으려고 static을 쓴다 불러올때는 classname.variablename으로 불러올수 있다
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Student s1 = new Student();
		s1.showData();
		Student s2 = new Student();
		s2.showData();
		System.out.println(Student.b);
	}

}

class Student {
	int a;
	static int b;

	Student() {
		b++;
	}

	public void showData() {
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
}//a는 static이 아니라 static 함수에서 사용하지 못 한다.
//public static void increment(){
//a++;
//}