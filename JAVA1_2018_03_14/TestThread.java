package JAVA1_2018_03_14;

class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	public RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this.threadName);
			t.start();
		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		// R1.run();
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
	}
}
