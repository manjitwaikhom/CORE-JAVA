package com.thread;

public class ThreadGroupDemo2  
{ 
    public static void main(String arg[]) throws InterruptedException, 
        SecurityException 
    { 
        // creating the thread group 
        ThreadGroup gfg = new ThreadGroup("Parent thread"); 
  
        ThreadGroup gfg_child = new ThreadGroup(gfg, "child thread"); 
  
        NewThread2 t1 = new NewThread2("one", gfg); 
        System.out.println("Starting one"); 
        NewThread2 t2 = new NewThread2("two", gfg); 
        System.out.println("Starting two"); 
  
        // block until other thread is finished 
        t1.join(); 
        t2.join(); 
  
        // destroying child thread 
        gfg_child.destroy(); 
        System.out.println(gfg_child.getName() + " destroyed"); 
  
        // destroying parent thread 
        gfg.destroy(); 
        System.out.println(gfg.getName() + " destroyed"); 
    } 
} 

//

class NewThread2 extends Thread  
{ 
    NewThread2(String threadname, ThreadGroup tgob) 
    { 
        super(tgob, threadname); 
        start(); 
    } 
public void run() 
    { 
  
        for (int i = 0; i < 10; i++)  
        { 
            try 
            { 
                Thread.sleep(10); 
            } 
            catch (InterruptedException ex)  
            { 
                System.out.println("Exception encounterted"); 
            } 
        } 
    } 
}  