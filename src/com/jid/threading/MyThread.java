package com.jid.threading;

/**
 * Created by Jorge on 2016-02-12.
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Execute thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread("myThread");
        myThread.start();
    }
}
