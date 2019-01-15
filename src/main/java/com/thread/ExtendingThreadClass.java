package com.thread;

/*-----------------------DEVELOPING THREAD BY EXTENDING "java.lang.Thread" CLASS-----------------------*/

class HelloThread extends Thread {
	public HelloThread(String tname) {
		super(tname);
		start();
	}

	@Override
	public void run() {
		for (int i = 101; i <= 105; i++) {
			System.out.println(i + " by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

/*------------------------------------------*/
class ExtendingThreadClass {
	public static void main(String as[]) {
		System.out.println("main begin");
		HelloThread h1 = new HelloThread("thread_A");
		HelloThread h2 = new HelloThread("thread_B");
		HelloThread h3 = new HelloThread("thread_C");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println("main end");
	}
}
