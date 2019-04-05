package JAVA1_2018_03_14;
//t1,t2 서로 독립적이다.(independent)
public class TestSleepMethod extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try{
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		t1.start();
		t2.start();
	}

}
