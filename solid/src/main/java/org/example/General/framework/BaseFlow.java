package org.example.General.framework;

public  class BaseFlow {
    public  void step1(){
        System.out.println("step1");
    };
    public  void step2(){
        System.out.println("step2");
    };
    void run(){
        step1();
        step2();
    }
}
