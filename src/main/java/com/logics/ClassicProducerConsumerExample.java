package com.logics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

/*in this example buffer is responsible for creating or removing the elements.
 * check next example for this problem
 * */
public class ClassicProducerConsumerExample {
    
    public static final Logger LOGGER= Logger.getLogger(ClassicProducerConsumerExample.class.getName());
    
    public static void main(String[] args) throws InterruptedException {
	
        Buffer buffer = new Buffer(2);
        
        //Producer thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
        	LOGGER.info("Producer thread started");
                try {
                    buffer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        //Consumer thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
        	LOGGER.info("Consumer thread started");
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        producerThread.start();
        consumerThread.start();
        
        producerThread.join();
        consumerThread.join();
    }
    
    static class Buffer {
        private Queue<Integer> list;
        private int size;
        public Buffer(int size) {
            this.list = new LinkedList<>();
            this.size = size;
        }
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    while (list.size() >= size) {
                        // wait for the consumer
                        wait();
                    }
                    list.add(value);
                    System.out.println("Produced " + value);
                    value++;
                    // notify the consumer
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0) {
                        // wait for the producer
                        wait();
                    }
                    int value = list.poll();
                    System.out.println("Consume " + value);
                    // notify the producer
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}