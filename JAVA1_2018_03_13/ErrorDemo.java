package JAVA1_2018_03_13;

public class ErrorDemo {
	public void method1() {
		this.method2();
	}
	public void method2() {
		this.method1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorDemo ed = new ErrorDemo();
		ed.method1();
	}

}
