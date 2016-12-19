package com.thread;

/*----EXAMPLE USING BLOCK LEVEL SYNCHRONIZATION-----*/

import java.util.ArrayList;

/*----------------------------------------------------------*/

class HelloHai {
	void m1(ArrayList al) {
		synchronized (al) {
			System.out.println("m1-begin" + "by"
					+ Thread.currentThread().getName());
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i) + "by "
						+ Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
			System.out.println("m1 end" + "by "
					+ Thread.currentThread().getName());
		}
	}

	void m2(ArrayList al) {
		synchronized (al) {
			System.out.println("m2 -begin" + "by "
					+ Thread.currentThread().getName());
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i) + " by "
						+ Thread.currentThread().getName());
				try {
					Thread.sleep(700);
				} catch (Exception e) {
				}
			}
			System.out.println("m2  end" + "by "
					+ Thread.currentThread().getName());
		}
	}
}

/*----------------------------------------------------------------------*/

class Thread_A implements Runnable {
	HelloHai h = null;
	ArrayList al = null;

	Thread_A(HelloHai h, ArrayList al) {
		Thread t = new Thread(this, "B");
		this.h = h;
		this.al = al;
		t.start();
	}

	public void run() {
		h.m2(al);
	}
}

/*----------------------------------------------------------------------*/
class Thread_B implements Runnable {
	HelloHai h = null;
	ArrayList al = null;

	Thread_B(HelloHai h, ArrayList al) {
		Thread t = new Thread(this, "B");
		this.h = h;
		this.al = al;
		t.start();
	}

	public void run() {
		h.m1(al);
	}
}

/*----------------------------------main()------------------------------------*/

class BlockLevelSyncronization {
	public static void main(String as[]) {
		ArrayList al = new ArrayList();
		al.add("11");
		al.add("22");
		al.add("33");
		al.add("44");
		al.add("55");
		HelloHai h = new HelloHai();
		new Thread_A(h, al);
		new Thread_B(h, al);
	}
}
