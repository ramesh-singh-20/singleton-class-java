package com.alphacoder.designprinciple;

import java.io.Serializable;

public class Singleton implements Serializable {
    //variable is declared volatile so that it gets
    // read from main memory instead of Thread's local cache.
    private static volatile Singleton instance;

    private Singleton(){
        if(instance!= null){
            throw new RuntimeException("Call Singleton() method to get instance of this class.");
        }
    }

    public static Singleton Singleton(){
        if(instance== null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    public Object clone(){
        return null;
    }

    protected Singleton readResolve(){
        return instance;
    }
}
