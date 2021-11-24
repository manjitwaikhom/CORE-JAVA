package com.thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        //use this way to execute CPU intensive task
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Core count:" +coreCount);
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        //use this in case of IO intensive task like DB fetch, http calls which require waiting for some time,
        //exact number will depend on task submission and average wait time of the thread, too many thread will increase memory consumption
        //ExecutorService service = Executors.newFixedThreadPool(40);

        //thread1
        service.execute(()->{
            for (int i=0;i<100;i++) {
                System.out.println("Thread-01("+i+")");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //thread2
       service.execute(()->{
           for (int i=0;i<100;i++) {
               System.out.println("\t\tThread-02 ("+i+")");
               try {
                   Thread.sleep(200);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       });

        service.shutdown();



    }
}
