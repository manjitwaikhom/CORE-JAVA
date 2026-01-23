package com.thread;

public class EvenOddThreads {



    public static void main(String[] args) {
        int MAX =40;
        Printer printer =new Printer();

        Thread t1 = new Thread(()->{
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }

}


class Printer{
    int count=1;
    int MAX=20;

    public synchronized void printOdd() throws InterruptedException{
        while(count < MAX){
            if(count %2 ==0) {
                wait();
            }
            System.out.println("ODD:  "+count);
            count++;
            notify();

        }
    }

    public synchronized void printEven()throws InterruptedException{
        while(count < MAX){
            if(count %2 !=0) {
                wait();
            }
            System.out.println("EVEN: "+count);
            count++;
            notify();

        }
    }
}
