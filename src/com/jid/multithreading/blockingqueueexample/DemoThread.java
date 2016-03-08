package com.jid.multithreading.blockingqueueexample;

/**
 * Created by Jorge on 2015-11-03.
 */
public class DemoThread implements Runnable {

    private String name = null;

    public DemoThread(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing: " + name);
    }
}
