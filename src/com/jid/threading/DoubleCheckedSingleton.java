package com.jid.threading;

/**
 * Created by Jorge on 2016-02-12.
 */
public class DoubleCheckedSingleton {
    private volatile DoubleCheckedSingleton instance = null;

    public DoubleCheckedSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null){
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
