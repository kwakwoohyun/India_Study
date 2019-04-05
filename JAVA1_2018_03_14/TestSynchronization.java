package JAVA1_2018_03_14;
class Table{
	//synchronized동기화=하나가 끝난후 다른걸 시작한다.
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}

}
