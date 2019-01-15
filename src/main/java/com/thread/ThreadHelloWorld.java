package com.thread;

/*----------------------THREADING------------------------------*/
class ThreadHelloWorld {
	public static void main(String as[]) {
		System.out.println("main begin");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("waikhom_thread");
		t.setPriority(9);
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());

		int x = 10 / 0;

		System.out.println("main end");
	}
}
