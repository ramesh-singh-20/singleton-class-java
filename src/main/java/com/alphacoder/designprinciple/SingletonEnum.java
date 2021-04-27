package com.alphacoder.designprinciple;

public enum SingletonEnum {
    INSTANCE;

    String s1;

    public void print(){
        System.out.println("Inside method.");
    }
}
