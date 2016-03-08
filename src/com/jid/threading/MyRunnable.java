package com.jid.threading;

/**
 * Created by Jorge on 2016-02-12.
 */
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Executing thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable(), "myRunnable");
        myThread.start();
    }
}
