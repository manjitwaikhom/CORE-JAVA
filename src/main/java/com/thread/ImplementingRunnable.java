package com.thread;

public class ImplementingRunnable {
	public static void main(String[] args) 
    { 
        int n = 7; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            Thread thread = new Thread(new MyThread()); 
            thread.start(); 
        } 
    } 
}

class MyThread implements Runnable {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
