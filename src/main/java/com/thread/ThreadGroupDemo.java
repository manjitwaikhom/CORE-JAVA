package com.thread;

class NewThread extends Thread 
{ 
	NewThread(String threadname, ThreadGroup tgob) 
	{ 
		super(tgob, threadname); 
		start(); 
	} 
public void run() 
	{ 

		for (int i = 0; i < 1000; i++) 
		{ 
			try
			{ 
				Thread.sleep(110); 
			} 
			catch (InterruptedException ex) 
			{ 
				System.out.println("Exception encounterted"); 
			} 
		} 
	} 
} 
public class ThreadGroupDemo 
{ 
	public static void main(String arg[]) 
	{ 
		// creating the thread group 
		ThreadGroup tg = new ThreadGroup("parent thread group"); 

		NewThread t1 = new NewThread("one", tg); 
		System.out.println("Starting one"); 
		NewThread t2 = new NewThread("two", tg); 
		System.out.println("Starting two");
		NewThread t3 = new NewThread("two", tg); 
		System.out.println("Starting two"); 


		// checking the number of active thread 
		System.out.println("number of active thread: "
						+ tg.activeCount());
		//Destroys the thread group and any child groups on which it is called.
		tg.destroy();
	} 
} 

