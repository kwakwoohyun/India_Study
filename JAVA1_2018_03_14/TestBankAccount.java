package JAVA1_2018_03_14;
class BankAccount{
	private volatile int balance;
	public BankAccount(int b) {
		balance = b;
	}
	public BankAccount() {
		balance = 0;
	}
	synchronized public int getBalance() {
		return balance;
	}
	synchronized public int withdraw(int w) {
		int b=getBalance();
		if(w<=b) {
			balance = balance-w;
			return w;
		}else {
			return 0;
		}
	}
}
class WithdrawAccount implements Runnable{
	private BankAccount acc;
	private int amount;
	public WithdrawAccount() {
		acc=null;
		amount=0;
	}
	public WithdrawAccount(BankAccount acc,int amount) {
		this.acc=acc;
		this.amount=amount;
	}
	public void run() {
		int w;
		for(int i=0;i<20;i++) {
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Balance before"+Thread.currentThread().getName()+"withdrawl:"+acc.getBalance());
			w=acc.withdraw(amount);
			System.out.println("Balance after"+Thread.currentThread().getName()+"withdrawl:"+acc.getBalance());
		}
	}
}
public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount(1000);
		WithdrawAccount w = new WithdrawAccount(b,10);
		Thread wt1 = new Thread(w);
		wt1.setName("T1");
		Thread wt2 = new Thread(w);
		wt2.setName("T2");
		wt1.start();
		wt2.start();
	}

}
