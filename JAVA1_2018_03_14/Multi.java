package JAVA1_2018_03_14;
//2���� �����尡 �ִ�.
public class Multi extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1 = new Multi();
		t1.start();
	}

}
