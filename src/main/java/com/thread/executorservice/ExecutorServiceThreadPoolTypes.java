package com.thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceThreadPoolTypes {
    public static void main(String[] args) {
        //FixedThreadPool uses BlockingQueue for concurrency
        ExecutorService fixedService = Executors.newFixedThreadPool(40);
        fixedService.execute(()->{
            System.out.println("Fixed Thread Pool");
        });

        //CachedThreadPool uses synchronous queue
        ExecutorService cachedService = Executors.newCachedThreadPool();
        cachedService.execute(()->{
            System.out.println("\t\tCached Pool");
        });

        //ScheduledThreadPool
        ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(4);

        //task runs once after 5 seconds delay
        scheduledService.schedule(()->{
            System.out.println("\t\t\ttScheduled Pool : once after 5 seconds");
        },5, TimeUnit.SECONDS);

        //task runs repeatedly after 5 seconds delay
        scheduledService.scheduleAtFixedRate(()->{
            System.out.println("\t\t\t\tScheduled Pool : repeatedly after 5 seconds");
        },5,5,TimeUnit.SECONDS);

        //task runs repeatedly after 5 seconds delay after previous task completes
        scheduledService.scheduleWithFixedDelay(()->{
            System.out.println("\t\t\t\t\tScheduled Pool : repeatedly after 5 seconds");
        },5,5,TimeUnit.SECONDS);

        //SingleThreadedExecutor uses blocking queue and recreates thread if killed
        //used to make sure task1 always run before task2
        ExecutorService singleService = Executors.newSingleThreadExecutor();
        singleService.execute(()->{
            System.out.println("\t\t\t\t\tSingle Pool");
        });

    }
}
