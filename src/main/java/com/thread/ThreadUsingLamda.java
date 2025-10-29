package com.thread;

public class ThreadUsingLamda {

    public static void main(String[] args) {


        Runnable r1 = ()-> {
            for (int i=0;i<10;i++){
                System.out.println("Thread A");
            }
        };

        Runnable r2 = ()-> {
            for (int i=0;i<10;i++){
                System.out.println("              Thread B");
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
