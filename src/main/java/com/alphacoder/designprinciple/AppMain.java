package com.alphacoder.designprinciple;

public class AppMain {
    public static void main(String[] args) {
        SingletonEnum instance1= SingletonEnum.INSTANCE;
        SingletonEnum instance2= SingletonEnum.INSTANCE;

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        instance1.print();
        instance2.print();
    }
}
