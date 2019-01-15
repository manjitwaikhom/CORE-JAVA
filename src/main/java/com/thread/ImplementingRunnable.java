package com.thread;

/*----DEVELOPING THREAD BY "implementing java.lang.Runnable" INTERFACE------*/

class Stack {
	int x;

	void push(int a) {
		x = a;
	}

	int pop() {
		return x;
	}
}

/*--------------------------------------------*/

class ThreadA implements Runnable {
	Stack st = null;

	public ThreadA(Stack st, String tname) {
		Thread t = new Thread(this, tname);
		this.st = st;
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			st.push(i);
			System.out.println(i + " is pushed by A");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}
	}
}

/*----------------------------------------------------*/
class ThreadB extends Thread {
	Stack st = null;

	public ThreadB(Stack st, String tname) {
		super(tname);
		this.st = st;
		start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			int x = st.pop();
			System.out.println(x + " is poped by B");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}
	}
}

/*------------------------------------------------------------------*/
class ImplementingRunnable {
	public static void main(String as[]) {
		Stack st = new Stack();
		ThreadA a = new ThreadA(st, "A");
		ThreadB b = new ThreadB(st, "B");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " by " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}
	}
}