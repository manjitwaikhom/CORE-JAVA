package com.thread;

/*---EXAMPLE USING SYNCRONIZATION------*/

class Account {
	int bal = 970;

	public synchronized void withdraw(int amt) {
		if (bal > amt) {
			System.out.println(Thread.currentThread().getName()
					+ "  is going to withdraw......" + bal);
			try {
				Thread.sleep(1200);
			} catch (Exception e) {
			}
			bal -= amt;
			System.out.println(Thread.currentThread().getName()
					+ "  has completed withdrawing...." + bal);
		} else {
			System.out.println("No Funds for: "
					+ Thread.currentThread().getName());
		}
	}

	public int getBal() {
		return bal;
	}
}

/*------------------------------------------------*/

class accThread implements Runnable {
	Account acc = null;

	accThread(Account acc) {
		this.acc = acc;
		Thread t1 = new Thread(this, "A");
		Thread t2 = new Thread(this, "B");
		t1.start();
		t2.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.withdraw(225);
			if (acc.getBal() < 0) {
				System.out.println("Amount is overdrawn......");
			}
		}
	}
}

/*-----------------------------------------------------------*/

class UsingSyncronization {
	public static void main(String as[]) {
		Account acc = new Account();
		new accThread(acc);
	}
}