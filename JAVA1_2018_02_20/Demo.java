package JAVA1_2018_02_20;

//<static variable> OR <normal variable>
//static variable �� ��ü�� ���� �ƴϰ� Ŭ���� ���̴�.
//static variable�� �ҷ��ö� ��ü�� ������� �������� static�� ���� �ҷ��ö��� classname.variablename���� �ҷ��ü� �ִ�
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
}//a�� static�� �ƴ϶� static �Լ����� ������� �� �Ѵ�.
//public static void increment(){
//a++;
//}